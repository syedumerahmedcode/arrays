package com.umer.rotatematrix;

public class RotateMatrixService {

	/**
	 * Given an image represented by an NxN matrix write a method to rotate the
	 * image by 90 degrees. [1,2,3] [7,4,1] [4,5,6] => [8,5,2] [7,8,9] [9,6,3]
	 * 
	 * @param matrix
	 * @return
	 */
	public boolean rotateMatrix(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		if (rows == 0 || rows != columns) {
			// This means that this is not a nxn matrix. Hence, we should return false.
			return false;
		}
		// find out the number of layers inside the matrix that we need to rotate. hint:
		// layers=rows/2.
		// Here, we loop through the laysers
		for (int layer = 0; layer < rows / 2; layer++) {
			int first = layer;
			int last = rows - 1 - layer;
			// Here we loop through the cells on the current layer
			for (int i = first; i < last; i++) {
				// TODO: Needs further comments for better explanation.
				// Also, needs a visual description on the white board for the readme file.
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
		return true;
	}

}
