package com.codiscope.jaks.triggers.java.crypto;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

/**
 * The class PaddingOracle
 */
public class PaddingOracle {

    /**
     * Test which should be found by Jacks
     */
    public void positiveTest(Key k, byte [] bytes) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, k);
        byte[] cipherText = cipher.doFinal(bytes);
    }

    /**
     * Test which shouldn't be found by Jacks
     */
    public void negativeTest(Key k, byte [] bytes) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, k);
        byte[] cipherText = cipher.doFinal(bytes);
    }
}
