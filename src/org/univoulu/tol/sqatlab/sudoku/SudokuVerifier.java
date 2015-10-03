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
		
		return false;
	}
	
	public boolean verifyGlobalGridRows(String candidateSolution) {
		/*
		boolean verifyingResult = false;
		int[] candidateArr = new int [candidateSolution.length()];
		for (int x = 0; x < candidateSolution.length(); x++) {
			StringBuilder row = new StringBuilder();
			for (int r = 0; r < candidateSolution.length(); r++) {
				row.append(candidateArr[r]);
			}
		}
		*/
		boolean verifyingResult = false;
		int[] candidateArr = new int [candidateSolution.length()];
		// Row-at-time
		for (int x = 0; x <= 8; x++) {
			// Number-at-time
			//StringBuilder row = new StringBuilder();
			int[] row = {0,0,0,0,0,0,0,0};
			System.out.println(row);
			
		}
		
		/*
		String[] array = candidateSolution.split("");
		int dublicator = 0;
		for (int x = 0; x < array.length; x++) {
			for (int i = x+1; i < array.length; i++) {
				if (x != i && array[i] == array[x]) {
					return false;
				}
			}
		}
		*/
		return true;
	}
	
	public boolean verifyGlobalGridColumns(String candidateSolution) {
		
		return false;
	}
	
}
