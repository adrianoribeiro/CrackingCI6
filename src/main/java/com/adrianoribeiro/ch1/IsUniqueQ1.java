package com.adrianoribeiro.ch1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Question 1 - IsUnique
 * 
 * @author Adriano Ribeiro <adrianomsg@gmail.com>
 */
public class IsUniqueQ1 {

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
		assertFalse(IsUniqueQ1.isUnique("Adriano"));
		assertTrue(IsUniqueQ1.isUnique("brazil"));
		assertFalse(IsUniqueQ1.isUnique("cracking"));
		assertFalse(IsUniqueQ1.isUnique("crackingthecodinginterview"));
	}
}
