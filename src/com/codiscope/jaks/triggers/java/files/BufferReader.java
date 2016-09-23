package com.codiscope.jaks.triggers.java.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public void bufferReaderCheck() throws NumberFormatException, IOException {

		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(inp.readLine());

		for (int i = 0; i < T; i++) {
			String s = inp.readLine();
			System.out.println(Double.parseDouble(s));
		}

	}

}
