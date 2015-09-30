package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	String valid = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String invalid = "11234526789912345678891234567789123456678912345567891234456789123345678912234567891";

	@Test
	public void testPositiveDigits() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(true, verifier.verifyPositiveDigits(valid));
	}
	
	@Test
	public void testNegativeDigits() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(false, verifier.verifyPositiveDigits("314124214-123123"));
	}

	@Test
	public void testLength() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(true, verifier.verifyLength(valid));
	}
	
	@Test
	public void testLengthTooLong() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(false, verifier.verifyPositiveDigits(valid + "124"));
	}
	
	@Test
	public void testGlobalGridRows() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(true, verifier.verifyGlobalGridRows(invalid));
	}

}
