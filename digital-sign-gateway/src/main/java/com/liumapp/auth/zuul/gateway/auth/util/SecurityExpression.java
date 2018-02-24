package com.liumapp.auth.zuul.gateway.auth.util;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by liumapp on 2/9/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class SecurityExpression {

    private String RolePrefix = "ROLE_";

    public boolean hasRole (Collection<? extends GrantedAuthority> authorities , String url) {
        Iterator<? extends GrantedAuthority> iterator = authorities.iterator();
        while (iterator.hasNext()) {
            GrantedAuthority authority = iterator.next();
            String[] tmp = authority.getAuthority().split(RolePrefix);
            String role = tmp[1].toLowerCase();
            if (url.contains(role)) {
                return true;
            }
        }
        return false;
    }

}
