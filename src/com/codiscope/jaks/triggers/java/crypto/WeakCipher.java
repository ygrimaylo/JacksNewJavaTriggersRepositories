package com.codiscope.jaks.triggers.java.crypto;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

/**
 * The class WeakCipher
 */
public class WeakCipher {

    /**
     * Test which should be found by Jacks
     */
    public void positiveTest(Key k, byte [] bytes) throws Exception {
        Cipher cipher = Cipher.getInstance("\bDES\b(/.*/.*)?/i");
        cipher.init(Cipher.ENCRYPT_MODE, k);
        byte[] cipherText = cipher.doFinal(bytes);
    }
}

