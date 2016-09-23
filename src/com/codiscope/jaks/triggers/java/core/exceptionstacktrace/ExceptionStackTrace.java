package com.codiscope.jaks.triggers.java.core.exceptionstacktrace;

import tests.sources.PrivateSource;

/**
 * https://bitbucket.org/codiscope/jacks.engine/src/7732106bbbc7dfe50bf21c47cf95fbc38d4b6023/uEngine/src/trigger/custom_triggers/java/core/exception-stack-trace/exception-stack-trace-trigger.js?at=develop&fileviewer=file-view-default
 * Created by ronn on 19.08.16.
 */
public class ExceptionStackTrace {

    private PrivateSource privateSource = new PrivateSource();

    public void positiveTest() {

        try {
            throw new RuntimeException();
        } catch (final RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void negativeTest() {
        try {
            throw new RuntimeException();
        } catch (final RuntimeException e) {
        }
    }
}
