package com.liumapp.auth.zuul.gateway.filter.auth;

import com.liumapp.auth.zuul.gateway.auth.service.MultyUserDetailsService;
import com.liumapp.auth.zuul.gateway.auth.util.JwtTokenUtil;
import com.liumapp.auth.zuul.gateway.auth.util.SecurityExpression;
import io.jsonwebtoken.ExpiredJwtException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by liumapp on 2/2/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    private final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    private MultyUserDetailsService userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private SecurityExpression securityExpression;

    @Value("${jwt.header}")
    private String tokenHeader;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        final String requestHeader = request.getHeader(this.tokenHeader);

        String authToken = getAuthToken(requestHeader);
        String username = getUsername(authToken);
        String requestUrl = getRequestUrl(request);

        if (isNeedAuth(requestUrl)) {
            if ( !chkAuth(authToken , username , requestUrl)) {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
                return ;
            }
        }

        chain.doFilter(request, response);
    }

    private String getAuthToken (String requestHeader) {
        String authToken = null;

        if (requestHeader != null && requestHeader.startsWith("Bearer ")) {
            authToken = requestHeader.substring(7);

        } else {
            logger.warn("couldn't find bearer string, will ignore the header");
        }

        return authToken;
    }

    private String getUsername (String token) {
        String username = null;

        try {
            username = jwtTokenUtil.getUsernameFromToken(token);
        } catch (IllegalArgumentException e) {
            logger.error("an error occured during getting username from token", e);
        } catch (ExpiredJwtException e) {
            logger.warn("the token is expired and not valid anymore", e);
        }

        return username;
    }

    private String getRequestUrl (HttpServletRequest request) {
        String url = request.getRequestURI();

        if (url.isEmpty() || url == null)
            url = request.getServletPath();

        return url;
    }

    /**
     * is necessary to chk auth .
     * @return boolean
     */
    private boolean isNeedAuth (String requestUrl) {
        boolean unchk = requestUrl.contains("unchk");
        return !unchk;
    }

    private boolean chkAuth (String token , String username , String url) {
        if (token == null || token.isEmpty())
            return false;

        logger.info("checking authentication for user " + username);

        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {

            // It is not compelling necessary to load the use details from the database. You could also store the information
            // in the token and read it from it. It's up to you ;)
            // chk twice
            UserDetails userDetails = null;
            try {
                userDetails = userDetailsService.loadUserByPhone(username);
            } catch (UsernameNotFoundException e) {
                userDetails = userDetailsService.loadUserByEmail(username);
            }

            // For simple validation it is completely sufficient to just check the token integrity. You don't have to call
            // the database compellingly. Again it's up to you ;)
            if (jwtTokenUtil.validateToken(token, userDetails) & securityExpression.hasRole(userDetails.getAuthorities() , url)) {
                return true;
            }

        }

        return false;
    }
}