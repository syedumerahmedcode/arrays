package com.umer.rotatematrix;

public class RotateMatrixService {

	/**
	 * Given an image represented by an NxN matrix write a method to rotate the
	 * image by 90 degrees. 
	 * [1,2,3]		[7,4,1]		
	 * [4,5,6] 	=>	[8,5,2]
	 * [7,8,9] 		[9,6,3]
	 * 
	 * @param matrixOrImageToRotate
	 * @return
	 */
	public boolean rotateGivenMatrixOrImage(int[][] matrixOrImageToRotate) {
		int rows = matrixOrImageToRotate.length;
		int columns = matrixOrImageToRotate[0].length;
		if (rows == 0 || rows != columns) {
			// This means that this is not a nxn matrix. Hence, we should return false.
			return false;
		}
		// find out the number of layers inside the matrix that we need to rotate. hint:
		// layers=rows/2.
		// Here, we loop through the layers
		for (int layer = 0; layer < rows / 2; layer++) {
			int first = layer;
			int last = rows - 1 - layer;
			// Here we loop through the cells on the current layer
			for (int i = first; i < last; i++) {
				// TODO: Needs further comments for better explanation.
				// Also, needs a visual description on the white board for the readme file.
				int offset = i - first;
				int top = matrixOrImageToRotate[first][i];
				matrixOrImageToRotate[first][i] = matrixOrImageToRotate[last - offset][first];
				matrixOrImageToRotate[last - offset][first] = matrixOrImageToRotate[last][last - offset];
				matrixOrImageToRotate[last][last - offset] = matrixOrImageToRotate[last][last - offset];
				matrixOrImageToRotate[last][last - offset] = matrixOrImageToRotate[i][last];
				matrixOrImageToRotate[i][last] = top;
			}
		}
		return true;
	}

}
