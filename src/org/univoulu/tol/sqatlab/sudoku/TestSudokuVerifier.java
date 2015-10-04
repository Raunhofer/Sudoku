package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	String valid = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String invalid = "1234526789122345678891234567789123456678912345567891234456789123345678912234567891";
	String duplicates = "111369825632158947958724316825437169791586432346912758289643571573291684164875333";

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
	public void testLengthValid() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(true, verifier.verifyLength(valid));
	}
	
	@Test
	public void testLengthTooLong() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(false, verifier.verifyLength(valid + "1"));
	}
	
	@Test
	public void testGlobalGridRowsValid() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(true, verifier.verifyGlobalGridRows(valid));
	}
	
	@Test
	public void testGlobalGridRowsDuplicates() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(false, verifier.verifyGlobalGridRows(duplicates));
	}
	
	@Test
	public void testGlobalGridColumnsValid() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(true, verifier.verifyGlobalGridColumns(valid));
	}
	
	@Test
	public void testGlobalGridColumnsDuplicates() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(false, verifier.verifyGlobalGridColumns(duplicates));
	}
	
	@Test
	public void testSubGridValid() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(true, verifier.verifySubGrid(valid));
	}
	
	@Test
	public void testSubGridWithDuplicates() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(true, verifier.verifySubGrid(duplicates));
	}

}
