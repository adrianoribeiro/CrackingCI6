package com.adrianoribeiro.ch1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Question 6 - String Compression
 * 
 * @author Adriano Ribeiro <adrianomsg@gmail.com>
 */
public class StringCompressionQ6 {

	public static String transform(String value) {
		
		StringBuilder sb = new StringBuilder();
		
		char[] valueArr = value.toCharArray();
		int countSequence = 0;
		for (int i = 0; i < valueArr.length ; i++) {
			
			countSequence++;
			if(i+1 >= valueArr.length || valueArr[i] != valueArr[i+1]) {
				sb.append(valueArr[i]);
				sb.append(countSequence);
				countSequence = 0;
			}
		}
		
		return sb.toString();
	}
	
	@Test
	public void test() {
		assertEquals("a2b1c5a3", StringCompressionQ6.transform("aabcccccaaa"));
		assertEquals("a2b1c3d1", StringCompressionQ6.transform("aabcccd"));
		assertEquals("a1", StringCompressionQ6.transform("a"));
	}
}
