package com.codiscope.jaks.triggers.java.command;

import tests.sources.PrivateSource;

import java.io.File;
import java.io.IOException;

/**
 * The class CommandInjection
 * GUID-620
 */
public class CommandInjection {

    private PrivateSource privateSource = new PrivateSource();

    /**
     * Test which should be found by Jacks
     */
    public void positiveTest() throws IOException {
        String command = privateSource.method1();
        Runtime runtime = Runtime.getRuntime();
        String [] strings = getStrings();
        File file = getFile();
        runtime.exec(command);
        runtime.exec(command, strings);
        runtime.exec(command, strings, file);
        runtime.exec(strings);
        runtime.exec(strings, strings);
        runtime.exec(strings, strings, file);
    }

    private File getFile(){
        return null;
    }

    private String [] getStrings(){
        return null;
    }

}
