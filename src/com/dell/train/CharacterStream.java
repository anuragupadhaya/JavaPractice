package com.dell.train;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader("C:/Users/Devil/Desktop/input.txt");
			out = new FileWriter("C:/Users/Devil/Desktop/output.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}

		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
