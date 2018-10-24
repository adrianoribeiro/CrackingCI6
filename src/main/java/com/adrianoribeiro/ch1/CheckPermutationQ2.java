package com.adrianoribeiro.ch1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Question 2 - CheckPermutation
 * 
 * @author Adriano Ribeiro <adrianomsg@gmail.com>
 */
public class CheckPermutationQ2 {

	public static boolean checkPermutation(String t1, String t2) {
		
		if(!(t1.length()==t2.length())) return false;
		
		String lowerT1 = t1.toLowerCase();
		String lowerT2 = t2.toLowerCase();
		
		int[] letters = new int[128];
		for (int i = 0; i < lowerT1.length(); i++) {
			letters[lowerT1.charAt(i)]++;
		}
		
		for (int i = 0; i < lowerT2.length(); i++) {
			int pos = lowerT2.charAt(i);
			if(--letters[pos] < 0) return false;
		}
		
		return true;
	}
	
	@Test
	public void test() {
		assertTrue(CheckPermutationQ2.checkPermutation("brazil", "rabzli"));
		assertFalse(CheckPermutationQ2.checkPermutation("cracking", "crackingg"));
		assertFalse(CheckPermutationQ2.checkPermutation("crackingg", "cracking"));
		assertTrue(CheckPermutationQ2.checkPermutation("crackingthecodinginterview", "crackingthecodinginterview"));
		assertFalse(CheckPermutationQ2.checkPermutation("drackingthecodinginterview", "crackingthecodinginterview"));
	}
}
