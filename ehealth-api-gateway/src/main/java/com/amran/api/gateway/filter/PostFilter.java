package com.amran.api.gateway.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * @Author : Amran Hosssain on 6/27/2020
 */
public class PostFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "post";
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
        System.out.println("Inside Response Filter");

        return null;
    }
}
