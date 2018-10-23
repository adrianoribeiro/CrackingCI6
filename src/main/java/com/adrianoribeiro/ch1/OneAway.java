package com.adrianoribeiro.ch1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Question 5 - OneAway
 * 
 * @author Adriano Ribeiro <adrianomsg@gmail.com>
 */
public class OneAway {

	public static boolean check(String w1, String w2) {

		if (w1.length() == w2.length()) {
			return compareEquals(w1, w2);
		} else if (w1.length() + 1 == w2.length()) {
			return compareDiff(w1, w2);
		} else if (w2.length() + 1 == w1.length()) {
			return compareDiff(w2, w1);
		}

		return false;
	}

	private static boolean compareEquals(String s1, String s2) {

		String lowerS1 = s1.toLowerCase();
		String lowerS2 = s2.toLowerCase();

		int diff = 0;
		for (int i = 0; i < lowerS1.length(); i++) {
			if (lowerS1.charAt(i) != lowerS2.charAt(i))
				diff++;
		}

		return diff <= 1;
	}

	private static boolean compareDiff(String s1, String s2) {

		if(Math.abs(s1.length() - s2.length()) > 1) { 
			return false;
		}
		
		String lowerS1 = s1.toLowerCase();
		String lowerS2 = s2.toLowerCase();

		int diff = 0;
		for (int i = 0; i < lowerS2.length(); i++) {

			if ((i - diff) >= lowerS1.length())
				continue;

			if (lowerS1.charAt(i - diff) != lowerS2.charAt(i))
				diff++;
		}

		return diff <= 1;
	}

	@Test
	public void test() {

		assertTrue(check("pale", "ple"));
		assertTrue(check("pales", "pale"));
		assertTrue(check("pale", "bale"));
		assertFalse(check("pale", "bae"));
	}
}
