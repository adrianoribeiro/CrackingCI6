package com.adrianoribeiro.ch1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Question 7 - Rotate Matrix
 * 
 * @author Adriano Ribeiro <adrianomsg@gmail.com>
 */
public class RotateMatrixQ7 {

	public static char[][] rotate90(char[][] matrix) {

		char[][] newMatrix = new char[matrix.length][matrix.length];

		int matrixLen = matrix.length - 1;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {

				newMatrix[j][matrixLen] = matrix[i][j];
			}
			matrixLen--;
		}

		return newMatrix;
	}

	char printLetter = '#';
	char[][] matrix = new char[4][4];

	@Before
	public void setup() {
		matrix[0][0] = printLetter;
		matrix[1][0] = printLetter;
		matrix[2][0] = printLetter;
		matrix[3][0] = printLetter;
		matrix[3][1] = printLetter;
		matrix[3][2] = printLetter;
		matrix[3][3] = printLetter;
		matrix[0][3] = printLetter;
		matrix[1][3] = printLetter;
		matrix[2][3] = printLetter;
	}
	
	@Test
	public void test() {
		/*
		 * Input 
		 * #..# 
		 * #..# 
		 * #..# 
		 * ####
		 * 
		 * Output
		 * #### 
		 * #... 
		 * #... 
		 * ####
		 */
		matrix = rotate90(matrix);
		
		assertEquals(printLetter, matrix[0][0]);
		assertEquals(printLetter, matrix[0][1]);
		assertEquals(printLetter, matrix[0][2]);
		assertEquals(printLetter, matrix[0][3]);

		assertEquals(printLetter, matrix[1][0]);
		assertEquals('\u0000', matrix[1][1]);
		assertEquals('\u0000', matrix[1][2]);
		assertEquals('\u0000', matrix[1][3]);

		assertEquals(printLetter, matrix[2][0]);
		assertEquals('\u0000', matrix[2][1]);
		assertEquals('\u0000', matrix[2][2]);
		assertEquals('\u0000', matrix[2][3]);

		assertEquals(printLetter, matrix[3][0]);
		assertEquals(printLetter, matrix[3][1]);
		assertEquals(printLetter, matrix[3][2]);
		assertEquals(printLetter, matrix[3][3]);
	}

	/*public static void main(String[] args) {
		char[][] matrix = new char[4][4];

		fillMatrix(matrix, '#');

		applyAndTestRotate90(matrix);
	}

	private static void applyAndTestRotate90(char[][] matrix) {
		printMatrix(matrix);
		matrix = rotate90(matrix);
		System.out.println();

		printMatrix(matrix);
		matrix = rotate90(matrix);
		System.out.println();

		printMatrix(matrix);
		matrix = rotate90(matrix);
		System.out.println();

		printMatrix(matrix);
		matrix = rotate90(matrix);
		System.out.println();

		printMatrix(matrix);
		matrix = rotate90(matrix);
		System.out.println();
	}

	private static void fillMatrix(char[][] matrix, char printLetter) {
		matrix[0][0] = printLetter;
		matrix[1][0] = printLetter;
		matrix[2][0] = printLetter;
		matrix[3][0] = printLetter;
		matrix[3][1] = printLetter;
		matrix[3][2] = printLetter;
		matrix[3][3] = printLetter;
		matrix[0][3] = printLetter;
		matrix[1][3] = printLetter;
		matrix[2][3] = printLetter;
	}

	private static void printMatrix(char[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == '\u0000') {

					System.out.print(".");
				} else {

					System.out.print(matrix[i][j]);
				}
			}
			System.out.println();
		}
	}*/

}
