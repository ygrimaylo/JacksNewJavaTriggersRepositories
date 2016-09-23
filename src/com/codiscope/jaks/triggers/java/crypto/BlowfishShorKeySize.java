package com.codiscope.jaks.triggers.java.crypto;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class BlowfishShorKeySize {

	public Key strongKeySize() throws NoSuchAlgorithmException {
		KeyGenerator keyGenerator = KeyGenerator.getInstance("Blowfish");
		// Now set the keysize to 256 bits
		keyGenerator.init(256);
		Key key = keyGenerator.generateKey();
		return key;
	}

	public Key weakKeySize() throws NoSuchAlgorithmException {
		KeyGenerator keyGenerator = KeyGenerator.getInstance("Blowfish");
		// Now set the keysize to 32 bits
		keyGenerator.init(32);
		Key key = keyGenerator.generateKey();
		return key;
	}

	public SecretKey weakKeySize1() throws NoSuchAlgorithmException {
		KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
		keyGen.init(64);
		SecretKey key = keyGen.generateKey();
		return key;
	}

	public SecretKey weakKeySize2() throws NoSuchAlgorithmException {
		KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
		keyGen.init(96, new SecureRandom());
		SecretKey key = keyGen.generateKey();
		return key;
	}

	public SecretKey okKeySize1() throws NoSuchAlgorithmException {
		KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
		keyGen.init(128, new SecureRandom());

		SecretKey key = keyGen.generateKey();
		return key;
	}
}
