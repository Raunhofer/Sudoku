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
		if (candidateSolution.length() < 81 || candidateSolution.length() > 81) {
			return false;
		} else {
			System.out.println(candidateSolution.length());
			return true;
		}
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
