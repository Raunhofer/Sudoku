package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	SudokuVerifier verifier = new SudokuVerifier();
	
	@Test
	public void test() {
		verifier.verifyPositiveDigits("417369825632158947958724316825437169791586432346912758289643571573291684164875293");
		
	}

}
