package com.codiscope.jaks.triggers.java.crypto;

import java.security.MessageDigest;

/**
 * The class BadHash
 */
public class BadHash {

    /**
     * Test which should be found by Jacks
     */
    public String positiveTest() throws Exception {
        String password = "";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] resultBytes = md.digest(password.getBytes("UTF-8"));

        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : resultBytes) {
            stringBuilder.append(Integer.toHexString(b & 0xFF));
        }

        return stringBuilder.toString();
    }

    /**
     * Test which shouldn't be found by Jacks
     */
    public String negativeTest() throws Exception {
        String password = "";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] resultBytes = md.digest(password.getBytes("UTF-8"));

        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : resultBytes) {
            stringBuilder.append(String.format("%02X", b));
        }

        return stringBuilder.toString();
    }
}
