package com.adrianoribeiro.ch1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Question 3 - URLify, solution 2
 * 
 * @author Adriano Ribeiro <adrianomsg@gmail.com>
 */
public class URLifySolution2 {

	public static String apply(String text) {
		
		char[] arrText = text.trim().toCharArray();
			
		int countSpaces = 0;
		for (char letter : arrText) {
			countSpaces+= (letter == ' ') ? 1 : 0;				
		}
		
		int arrTextConvertLength = arrText.length + (countSpaces*2);
		char[] arrTextConvert = new char[arrTextConvertLength];
		
		for (int i = (arrText.length - 1); i >= 0; i--) {
			if(arrText[i] == ' ') {
				arrTextConvert[--arrTextConvertLength] = '0';
				arrTextConvert[--arrTextConvertLength] = '2';
				arrTextConvert[--arrTextConvertLength] = '%';
				
				continue;
			}
			
			arrTextConvert[--arrTextConvertLength] = arrText[i];
		}
		
		return String.valueOf(arrTextConvert);
	}
	
	@Test
	public void test() {
		assertEquals("ab%20c", URLifySolution2.apply("ab c"));
		assertEquals("Mr%20John%20Smith", URLifySolution2.apply("Mr John Smith   "));
		assertEquals("Cracking%20the%20Coding%20Interview", URLifySolution2.apply("Cracking the Coding Interview"));
	}
}