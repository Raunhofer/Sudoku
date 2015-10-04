package org.univoulu.tol.sqatlab.sudoku;
import java.util.HashMap;
import java.util.Map;
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
		boolean verifyResult = true;
		char[] charArray = candidateSolution.toCharArray();
		String girdstr = "";
		for (int i=0; i<=2; i++) {
			for (int x=0; x<=8; x++) {
				for (int r=0; r<=2; r++) {
					girdstr = girdstr + charArray[(x+(i*27))+(r*9)];
				}
			}
		}
		System.out.println(girdstr);
		return false;
	}
	
	public boolean verifyGlobalGridRows(String candidateSolution) {
		boolean verifyResult = true;
		String rows = "";
		for (int x=0; x <= 8; x++) {
			rows = candidateSolution.substring((x*9), Math.min(candidateSolution.length(), 9+(x*9)));
			String str = rows;
			int len = str.length();
			Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));
			
			for (int i = 0; i < len; ++i)
			{
			    char charAt = str.charAt(i);

			    if (!numChars.containsKey(charAt))
			    {
			        numChars.put(charAt, 1);
			    }
			    else
			    {
			        numChars.put(charAt, numChars.get(charAt) + 1);
			        verifyResult = false;
			    }
			}
		}
		return verifyResult;
	}
	
	public boolean verifyGlobalGridColumns(String candidateSolution) {
		boolean verifyResult = true;
		char[] charArray = candidateSolution.toCharArray();
		String columnstr = "";
		for (int x=0; x<=8; x++) {
			for (int r=0; r<=8; r++) {
				columnstr = columnstr + charArray[x+(r*9)];
			}
		}
		
		String columns = "";
		for (int x=0; x <= 8; x++) {
			columns = candidateSolution.substring((x*9), Math.min(candidateSolution.length(), 9+(x*9)));
			String str = columns;
			int len = str.length();
			Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));
			
			for (int i = 0; i < len; ++i)
			{
			    char charAt = str.charAt(i);

			    if (!numChars.containsKey(charAt))
			    {
			        numChars.put(charAt, 1);
			    }
			    else
			    {
			        numChars.put(charAt, numChars.get(charAt) + 1);
			        verifyResult = false;
			    }
			}
		}
		return verifyResult;
	}
	
}
