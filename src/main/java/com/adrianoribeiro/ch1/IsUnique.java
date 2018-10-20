package com.adrianoribeiro.ch1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * 
 * @author Adriano Ribeiro <adrianomsg@gmail.com>
 */
public class IsUnique {

	public static boolean isUnique(String word) {
		
		String lowerWord = word.toLowerCase();
		boolean[] lettersFound = new boolean[128];
		
		for (int i = 0; i < word.toLowerCase().length(); i++) {
			int pos = (int) lowerWord.charAt(i);
			
			if(lettersFound[pos]) return false;
			
			lettersFound[pos] = true;
		}
		
		return true;
	}
	
	@Test
	public void test() {
		assertTrue(IsUnique.isUnique("brazil"));
		assertFalse(IsUnique.isUnique("cracking"));
		assertFalse(IsUnique.isUnique("crackingthecodinginterview"));
	}
}
