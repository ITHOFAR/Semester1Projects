
public class HarrisHw3 {

	public static void main(String[] args) {
		
		//Task 1 Example Code
		System.out.println("Task 1");
		int[][] M1 = {{1,2,3},{4,5,6},{7,8,9}};
		displayMatrix(M1);
		System.out.println();
		
		//Task 2 Example Code
		System.out.println("Task 2");
		int[] V2 = {11,2,13,4,15,6,17,8,19};
		int[][] M2 = buildMatrix(V2);
		displayMatrix(M2);
		System.out.println();
		
		//Task 3 Example Code
		System.out.println("Task 3");
		int[][] M3 = buildRandomMatrix();
		displayMatrix(M3);
		System.out.println();
		
		//Task 4 Example Code
		System.out.println("Task 4");
		int[] a = {10,20,30};
		int[] b = {11,21,31};
		int[] c = {12,22,32};
		int[][] M4 = buildVectorMatrix(a,b,c);
		displayMatrix(M4);
		System.out.println();
		
		//Task 5 Example Code
		System.out.println("Task 5");
		int[][] M5 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] N5 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] P5 = {{11,2,3},{4,5,6},{7,8,19}};
		boolean v = compareMatrices(M5, N5);
		boolean w = compareMatrices(M5, P5);
		System.out.println(v);
		System.out.println(w);
		System.out.println();
		
		//Task 6 Example Code
		System.out.println("Task 6");
		int[][] m6 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] n6 = {{10,20,30},{40,50,60},{70,80,90}};
		int[][] MplusN = addMatrices(m6,n6);
		displayMatrix(MplusN);
		System.out.println();
		
		//Task 7 Example Code
		System.out.println("Task 7");
		int[][] m7 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] n7 = {{10,20,30},{40,50,60},{70,80,90}};
		int[][] MminusN = subtractMatrices(n7,m7);
		displayMatrix(MminusN);
		System.out.println();
		
		//Task 8 Example Code
		System.out.println("Task 8");
		int[][] M8 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] sM = scalarProductMatrix(M8, 10);
		displayMatrix(sM);
		System.out.println();

		//Task 9 Example Code
		System.out.println("Task 9");
		int[][] m9 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] n9 = {{5,2,4},{4,6,6},{7,2,9}};
		int[][] MN = multiplyMatrices(m9, n9);
		displayMatrix(MN);
		System.out.println();
		
		//Task 10 Example Code
		System.out.println("Task 10");
		int[][] m10 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] Mt = transposeMatrix(m10);
		displayMatrix(m10);
		System.out.println();
		displayMatrix(Mt);
		System.out.println();
		
		//Task 11 Example Code
		System.out.println("Task 11");
		int[][] m11 = {{1,7,3},{7,4,5},{3,5,6}};
		int[][] n11 = {{1,2,3},{4,5,6},{7,8,9}};
		boolean sM11 = isSymmetricMatrix(m11);
		System.out.println(sM11);
		boolean sN11 = isSymmetricMatrix(n11);
		System.out.println(sN11);
		System.out.println();
		
		//Task 12 Example Code
		System.out.println("Task 12");
		int[][] n12 = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(traceMatrix(n12));
		System.out.println();
		
		//Task 13 Example Code
		System.out.println("Task 13");
		int[][] n13 = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(determinant3x3Matrix(n13));
		System.out.println();
		
		//Task 14 Example Code
		System.out.println("Task 14");
		int[][] n14 = {{1,2,3},{4,5,6},{7,8,9}};
		displayMatrix(powerNMatrix(n14, 3));
		System.out.println();
		System.out.println("Thank you for working so hard on grading all of our code!");
		System.out.println(":)");
	}//end of main
	//Task 1
	public static void displayMatrix(int[][] matrix) {
		int rowIndex = 0;
		int colIndex = 0;
		//used an enhanced for loop to iterate through each item.
		for (int[] row: matrix) {
			for (int value: row) {
				if (colIndex < row.length) {
					System.out.print(value + " ");
					colIndex +=1;
				}
				if (colIndex >= row.length) {
					System.out.println();
					colIndex = 0;
					rowIndex +=1;
				}
			}
		}
	}

	//Task 2
	public static int[][] buildMatrix(int[] array) {
		if (array.length > 9) {
			System.out.println("This array is too long");
		}
		int matrixDimensions = (int) Math.sqrt(array.length);
		int matrix[][] = new int[matrixDimensions][matrixDimensions];
		int rowIndex = 0;
		int colIndex = 0;
		for (int value: array) {
			matrix[rowIndex][colIndex] = value;
			colIndex +=1;
			if (colIndex >= matrixDimensions) {
				colIndex = 0;
				rowIndex +=1;
			}
		}
		return matrix;
	}
	
	//Task 3
	public static int[][] buildRandomMatrix() {
		//This is kinda hardcoded but that is what the prompt wanted
		int randomArray[] = new int[9];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) ((1 + Math.random() * 1000)/100);
		}
		//used buildMatrix as a helper method
		int newMatrix[][] = buildMatrix(randomArray);
		return newMatrix;
	}
	
	//Task 4
	public static int[][] buildVectorMatrix(int[] vector1, int[] vector2, int[] vector3) {
		int matrix[][] = new int[vector1.length][vector1.length];
		for (int row = 0; row < vector1.length; row++) {
			for (int col = 0; col < vector1.length; col++) {
				switch(row) {
				case 0: matrix[row][col] = vector1[col];
						if (col >= vector1.length) {
							col = 0;
				}break;
				case 1: matrix[row][col] = vector2[col];
						if (col >= vector1.length) {
							col = 0;
				}break;
				case 2: matrix[row][col] = vector3[col];
						if (col >= vector1.length) {
							col = 0;
				}break;
				}
			}
		}
		return matrix;
	}
	
	//Task 5
	public static boolean compareMatrices(int[][] M1, int[][] M2) {
		int rowIndex = 0;
		int colIndex = 0;
		
		for (int[] row: M1) {
			for (int value: row) {
				if (M1[rowIndex][colIndex] != M2[rowIndex][colIndex]) {
					return false;
				}
				colIndex +=1;
				if (colIndex >= row.length) {
					colIndex = 0;
					rowIndex +=1;
				}
			}
		}
		return true;
	}
	
	//Task 6
	public static int[][] addMatrices(int[][] M1, int[][] M2) {
		int rowIndex = 0;
		int colIndex = 0;
		int matrix[][] = new int[M1.length][M1.length];
		for (int[] row: M1) {
			for (int value: row) {
				matrix[rowIndex][colIndex] = M1[rowIndex][colIndex] + M2[rowIndex][colIndex];
				colIndex +=1;
				if (colIndex >= row.length) {
					colIndex = 0;
					rowIndex +=1;
				}
			}
		}
		return matrix;
	}
	
	//Task 7
	public static int[][] subtractMatrices(int[][] M1, int[][] M2) {
		int rowIndex = 0;
		int colIndex = 0;
		int matrix[][] = new int[M1.length][M1.length];
		for (int[] row: M1) {
			for (int value: row) {
				matrix[rowIndex][colIndex] = M1[rowIndex][colIndex] - M2[rowIndex][colIndex];
				colIndex +=1;
				if (colIndex >= row.length) {
					colIndex = 0;
					rowIndex +=1;
				}
			}
		}
		return matrix;
	}
	
	//Task 8
	public static int[][] scalarProductMatrix(int[][] matrix, int scalar) {
		int rowIndex = 0;
		int colIndex = 0;
		int newMatrix[][] = new int[matrix.length][matrix.length];
		for (int[] row: matrix) {
			for (int value: row) {
				newMatrix[rowIndex][colIndex] = matrix[rowIndex][colIndex] * scalar;
				colIndex +=1;
				if (colIndex >= row.length) {
					colIndex = 0;
					rowIndex +=1;
				}
			}
		}
		return newMatrix;
	}
	
	//Task 9
	//I first tried using a switch statement combined with a helper method but that got ugly quick
	public static int[][] multiplyMatrices(int[][] M1, int[][] M2) {
		int[][] matrix = new int[M1.length][M1.length];
		
		for (int row = 0; row < M1.length; row++) {
			for (int col = 0; col < M1[row].length; col++) {
				//third loop used to get an index of how the row and column change in the mult process
				for (int index = 0; index < M1.length; index++) {
					matrix[row][col] += M1[row][index] * M2[index][col];
				}
			}
		}
		return matrix;
	} 
	
	//Task 10
	public static int[][] transposeMatrix(int[][] matrix) {
		int newMatrix[][] = new int[matrix.length][matrix.length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				newMatrix[row][col] = matrix[col][row];
			}
		}
		return newMatrix;
	}
	
	//Task 11
	public static boolean isSymmetricMatrix(int[][] matrix) {
		int magicMatrix[][] = transposeMatrix(matrix);
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] != magicMatrix[row][col]) {
					return false;
				}
			}
		}
		return true;
	}
	
	//Task 12
	public static int traceMatrix(int[][] matrix) {
		int traceyPacey = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				switch(row) {
				case 0: 
					if (col == 0) {
						traceyPacey += matrix[row][col]; 
					}
					break;
				case 1: 
					if (col == 1 ) {
						traceyPacey += matrix[row][col];
					}
					break;
				case 2: 
					if (col == 2) {
						traceyPacey += matrix[row][col];
					}
					break;
				}
			}
		}
		return traceyPacey;
	}
	
	//Task 13 :( 
	//I called the argument m so i don't have to type as much :) 
	public static int determinant3x3Matrix(int[][] m) {
		int val1 = 0;
		int val2 = 0;
		int val3 = 0;
		int val4 = 0;
		int val5 = 0;
		int val6 = 0;
		int determywormy = 0;
		
		for (int row = 0, col = 0; row < m.length; row++) {
			switch(row) {
			case 0: 
				val1 = m[row][col] * m[row+1][col+1] * m[row+2][col+2];
				val6 = m[row][col] * m[row+1][col+2] * m[row+2][col+1];
				break;
			case 1:
				val2 = m[row-1][col+1] * m[row][col+2] * m[row+1][col];
				val5 = m[row-1][col+1] * m[row][col] * m[row+1][col+2];
				break;
			case 2: 
				val3 = m[row-2][col+2] * m[row-1][col] * m[row][col+1];
				val4 = m[row-2][col+2] * m[row-1][col+1] * m[row][col];
			}
		}
		determywormy = (val1 + val2 + val3) - (val4 + val5 + val6);
		return determywormy;
	}
	
	//Task 14
	public static int[][] powerNMatrix(int[][] matrix, int power) {
		int magicMatrix[][] = new int[matrix.length][matrix.length];
		for (int index = 1; index <= power; index++) {
			if (index == 1) {
				magicMatrix = matrix;
			}
			else {
				magicMatrix = multiplyMatrices(magicMatrix, matrix);
			}
		}
		return magicMatrix;
	}
}//end of class 
