package org.elsys.netprog.rest;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Random;

public class Hash {
	
	private String hash;
	private int length;
	private String input;
	private byte inputBytes[];
	
	public Hash(int length) {
		this.length = length;
		generateHash();
	}
	
	public void generateHash()
	{
		try {
			inputBytes = new byte[length];
			new Random().nextBytes(inputBytes);
			input = new String(inputBytes, Charset.forName("UTF-8"));
			String encoded = Base64.getEncoder().encodeToString(inputBytes);
			MessageDigest md;
			md = MessageDigest.getInstance("MD5");
			hash = new String(md.digest(encoded.getBytes()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
	
	public boolean checkInput(String Input) {
		if(input.equals(Input)) {
			generateHash();
			return true;
		}
		return false;
	}
	
	public boolean checkHash(String input) {
		return hash.equals(input);
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public String getHash() {
		return hash;
	}

}
