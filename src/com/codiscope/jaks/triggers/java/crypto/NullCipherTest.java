package com.codiscope.jaks.triggers.java.crypto;

import javax.crypto.*;
import java.security.Key;

/**
 * The class NullCipherTest
 */
public class NullCipherTest {

    /**
     * Test which should be found by Jacks
     */
    public void positiveTest(Key k, byte [] bytes) throws Exception{
        NullCipher cipher = createNullCipher();
        cipher.init(Cipher.ENCRYPT_MODE, k);
        byte[] cipherText = cipher.doFinal(bytes);
    }

    /**
     * Test which shouldn't be found by Jacks
     */
    public void  negativeTest(Key k, byte [] bytes) throws Exception{
        Cipher cipher = Cipher.getInstance("RSA/GCM/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, k);
        byte[] cipherText = cipher.doFinal(bytes);
    }

    /**
     * returns instance of NullCipher
     */
    private NullCipher createNullCipher(){
        return null;
    }

}
