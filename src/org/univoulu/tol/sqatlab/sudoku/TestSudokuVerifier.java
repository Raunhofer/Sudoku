package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	String valid = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String invalid = "1-23456789912345678891234567789123456678912345567891234456789123345678912234567891";
	
	
	@Test
	public void test() {
		SudokuVerifier verifier = new SudokuVerifier();
		assertEquals(true, verifier.verifyPositiveDigits(valid));
		
	}

}
