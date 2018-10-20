package com.adrianoribeiro.ch1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Check Permutation: Given two strings, write a method to decide 
 * if one is a permutation of the other
 * 
 * @author Adriano Ribeiro <adrianomsg@gmail.com>
 */
public class CheckPermutation {

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
		assertTrue(CheckPermutation.checkPermutation("brazil", "rabzli"));
		assertFalse(CheckPermutation.checkPermutation("cracking", "crackingg"));
		assertFalse(CheckPermutation.checkPermutation("crackingg", "cracking"));
		assertTrue(CheckPermutation.checkPermutation("crackingthecodinginterview", "crackingthecodinginterview"));
		assertFalse(CheckPermutation.checkPermutation("drackingthecodinginterview", "crackingthecodinginterview"));
	}
}
