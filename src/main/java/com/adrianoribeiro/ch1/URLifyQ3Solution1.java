package com.adrianoribeiro.ch1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Question 3 - URLify, simple version
 * 
 * @author Adriano Ribeiro <adrianomsg@gmail.com>
 */
public class URLifyQ3Solution1 {

	public static String apply(String text) {
		
		char[] arrText = text.trim().toCharArray();
		StringBuilder sbTextConvert = new StringBuilder();
		
		for (int i = 0; i < arrText.length; i++) {
			
			if(arrText[i] == ' ') {
				sbTextConvert.append("%20");
				continue;
			}
			
			sbTextConvert.append(arrText[i]);
		}
		
		return sbTextConvert.toString();
	}
	
	@Test
	public void test() {
		assertEquals("", URLifyQ3Solution1.apply(""));
		assertEquals("Mr%20John%20Smith", URLifyQ3Solution1.apply("Mr John Smith   "));
		assertEquals("Cracking%20the%20Coding%20Interview", URLifyQ3Solution1.apply("Cracking the Coding Interview"));
	}
}