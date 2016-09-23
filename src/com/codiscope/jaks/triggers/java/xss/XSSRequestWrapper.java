package com.codiscope.jaks.triggers.java.xss;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * The class XSSRequestWrapper
 */
public class XSSRequestWrapper extends  HttpServletRequestWrapper{

    /**
     * The constructor of XSSRequestWrapper
     */
    public XSSRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String[] getParameterValues(String parameter) {

        String[] encodedValues = new String[2];
        encodedValues[0] = stripxss("");
        encodedValues[1] = strip_xss("");

        return encodedValues;
    }

    private String strip_xss(String parameter){
        return "";
    }

    private String stripxss(String parameter){
        return "";
    }
}
