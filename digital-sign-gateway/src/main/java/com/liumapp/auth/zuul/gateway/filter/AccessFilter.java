package com.liumapp.auth.zuul.gateway.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by liumapp on 2/6/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class AccessFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);

    /**
     *  pre : before
     *  routing : while routing
     *  post : after routing and error
     *  error : catch exception
     * @return String
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        HttpServletRequest request = ctx.getRequest();
//
//        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
//
//        Object accessToken = request.getParameter("accessToken");
//        if(accessToken == null) {
//            log.warn("access token is empty");
//            // or use ctx.setResponseBody(body) , that dependence on you
//            ctx.setSendZuulResponse(false);
//            ctx.setResponseStatusCode(401);
//            return null;
//        }
        log.info("this is access filter");
        return null;
    }

}
