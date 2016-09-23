package com.codiscope.jaks.triggers.java.files;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * The class SimpleBufferedReader
 */
public class SimpleBufferedReader {

    /**
     * Test which should be found by Jacks
     */
    public void positiveTest() throws IOException {

        BufferedReader reader = getBufferedReader();
        reader.readLine();
    }

    /**
     * Test which shouldn't be found by Jacks
     */
    public void negativeTest() throws IOException {

        BufferedReader reader = getBufferedReader();
        reader.read();
    }

    /**
     * Get instance of BufferedReader
     */
    private BufferedReader getBufferedReader() {
        return null;
    }

}
