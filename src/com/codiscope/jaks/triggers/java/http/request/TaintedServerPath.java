package com.codiscope.jaks.triggers.java.http.request;

import javax.servlet.http.HttpServletRequest;

import tests.sources.PrivateSource;

/**
 * Created by ronn on 23.08.16.
 */
public class TaintedServerPath {

    private PrivateSource privateSource = new PrivateSource();

    public void positiveTest() {

        final HttpServletRequest request = privateSource.getRequest();
        final String requestURI = request.getRequestURI();
        final StringBuffer requestURL = request.getRequestURL();
    }

    public void negativeTest() {

        final HttpServletRequest request = privateSource.getRequest();
        final String servletPath = request.getServletPath();
    }
}
