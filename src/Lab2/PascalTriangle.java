package Lab2;

import java.util.Arrays;

public class PascalTriangle {
	// This method is used to display a Pascal triangle based on the parameter n.
	// Where n represents the number of rows
	public static void printPascalTriangle(int row) {
		// TODO
	}

	// get the nth row.
	// For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
	public static int[] getPascalTriangle(int n) {
		if (n == 1) {
			return new int[] { 1 };

		} else {
			int[] prevRow = getPascalTriangle(n - 1);
			int[] currentRow = generateNextRow(prevRow);
			return currentRow;
		}
	}

	// generate the next row based on the previous row
	// Ex. prevRow = {1} ==> nextRow = {1, 1}
	// Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
	public static int[] generateNextRow(int[] prevRow) {
		int[] result = new int[prevRow.length + 1];
		result[0] = 1;
		result[result.length - 1] = 1;
		for (int i = 1; i < result.length - 1; i++) {
			result[i] = prevRow[i - 1] + prevRow[i];
		}
		return result;

	}

	public static void main(String[] args) {
		int a = 4;

		for (int i = 1; i < a + 1; i++) {
			System.out.println(Arrays.toString(getPascalTriangle(i)));
		}
	}

}
