package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		return 0;
	}
	
	public boolean verifyPositiveDigits(String candidateSolution) {
		String input = candidateSolution;
		if (Double.parseDouble(input)<0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifyLength(String candidateSolution) {
		
		return false;
	}
	
	public boolean verifySubGrid(String candidateSolution) {
		
		return false;
	}
	
	public boolean verifyGlobalGridRows(String candidateSolution) {
		
		return false;
	}
	
	public boolean verifyGlobalGridColumns(String candidateSolution) {
		
		return false;
	}
	
}
