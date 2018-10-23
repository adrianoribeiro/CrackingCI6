package com.adrianoribeiro.ch1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Question 4 - PalindromePermutation
 * 
 * @author Adriano Ribeiro <adrianomsg@gmail.com>
 */
public class PalindromePermutation {

	public static boolean apply(String text) {
		
		String lowerText = text.toLowerCase(); 
		int[] letters = new int[128];
		
		for (int i = 0; i < (lowerText.length()); i++) {
			if( lowerText.charAt(i) == ' ')
				continue;
			
			letters[(int) lowerText.charAt(i)]++;
		}
		
		int unpairedCount = 0;
		for (int i = 0; i < letters.length; i++) {
			if(letters[i] % 2 != 0) {
				unpairedCount++;
			}
			
			if(unpairedCount > 1) return false;
		}
		
		return true;
	}
	
	@Test
	public void test() {
		assertTrue(PalindromePermutation.apply("Tact Coa"));
		assertTrue(PalindromePermutation.apply("abcabc"));
		assertTrue(PalindromePermutation.apply("abcdabc"));
		assertFalse(PalindromePermutation.apply("abcdabcc"));
		assertTrue(PalindromePermutation.apply("abcdabccc"));
	}
}
