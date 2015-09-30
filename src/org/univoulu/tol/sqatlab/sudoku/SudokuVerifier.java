package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		return 0;
	}
	
	public boolean verifyPositiveDigits(String candidateSolution) {
		if (candidateSolution.contains("-")) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean verifyLength(String candidateSolution) {
		if (candidateSolution.length() == 81) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verifySubGrid(String candidateSolution) {
		for (int x : candidateSolution.length()) {
			
		}
		return false;
	}
	
	public boolean verifyGlobalGridRows(String candidateSolution) {
		
		return false;
	}
	
	public boolean verifyGlobalGridColumns(String candidateSolution) {
		
		return false;
	}
	
}
