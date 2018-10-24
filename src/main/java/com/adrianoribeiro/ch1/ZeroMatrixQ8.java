package com.adrianoribeiro.ch1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Question 8 - Zero Matrix
 * 
 * @author Adriano Ribeiro <adrianomsg@gmail.com>
 */
public class ZeroMatrixQ8 {

	int[][] matrix = new int[4][5];

	@Before
	public void setup() {
		matrix[0][0] = 0;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[0][3] = 4;
		matrix[0][4] = 5;

		matrix[1][0] = 6;
		matrix[1][1] = 7;
		matrix[1][2] = 8;
		matrix[1][3] = 9;
		matrix[1][4] = 1;

		matrix[2][0] = 1;
		matrix[2][1] = 2;
		matrix[2][2] = 2;
		matrix[2][3] = 0;
		matrix[2][4] = 4;

		matrix[3][0] = 5;
		matrix[3][1] = 6;
		matrix[3][2] = 7;
		matrix[3][3] = 8;
		matrix[3][4] = 9;
	}
	
	@Test
	public void test(){
		/*
		Input
			0 2 3 4 5 
			6 7 8 9 1 
			1 2 2 0 4 
			5 6 7 8 9 
		
		Output
			0 0 0 0 0 
			0 7 8 0 1 
			0 0 0 0 0 
			0 6 7 0 9 
		*/
		
		run(matrix);
		
		assertEquals(0, matrix[0][0]);
		assertEquals(0, matrix[0][1]);
		assertEquals(0, matrix[0][2]);
		assertEquals(0, matrix[0][3]);
		assertEquals(0, matrix[0][4]);
		
		assertEquals(0, matrix[1][0]); 
		assertEquals(7, matrix[1][1]);
		assertEquals(8, matrix[1][2]);
		assertEquals(0, matrix[1][3]);
		assertEquals(1, matrix[1][4]);
		
		assertEquals(0, matrix[2][0]);
		assertEquals(0, matrix[2][1]);
		assertEquals(0, matrix[2][2]);
		assertEquals(0, matrix[2][3]);
		assertEquals(0, matrix[2][4]);
		
		assertEquals(0, matrix[3][0]);
		assertEquals(6, matrix[3][1]);
		assertEquals(7, matrix[3][2]);
		assertEquals(0, matrix[3][3]);
		assertEquals(9, matrix[3][4]);
	}
	
	public void run(int[][] matrix) {
		
		boolean[] lineWithZero = new boolean[matrix.length];
		boolean[] colWithZero = new boolean[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == 0) {

					lineWithZero[i] = true;
					colWithZero[j] = true;
				}
			}
		}
		
		fillColWithZero(matrix, colWithZero);
		fillLineWithZero(matrix, lineWithZero);
	}

	private static void fillColWithZero(int[][] matrix, boolean[] colWithZero) {
		
		for (int i = 0; i < colWithZero.length; i++) {
			if(colWithZero[i]) {
				
				for (int j = 0; j < matrix.length; j++) {
					matrix[j][i] = 0;
				}
			}
		}
	}

	private static void fillLineWithZero(int[][] matrix, boolean[] lineWithZero) {
		
		for (int i = 0; i < lineWithZero.length; i++) {
			if(lineWithZero[i]) {
				
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	/*private static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}*/	
}