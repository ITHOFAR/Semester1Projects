
public class HarrisExam1 {

	public static void main(String[] args) {
		//Task 1
		int[] grades = {10,10,10,10,10,10,10,1000};
		int[] grades2 = {100,100,100,60,60,60};
		System.out.println(gradeAssignment(grades));
		System.out.println(gradeAssignment(grades2));
		System.out.println();
		//Task 2
		System.out.println(randomEvenSumRoot());
		System.out.println();
		//Task 3
		int[][] v1 = {{1,1,1,1,4,3},{4,7,5,3,9,4},{3,3,6,8,2,5},{1,5,7,2,2,6},{3,9,9,2,3,7},{6,3,2,1,0,8}};
		int[][] v2 = {{1,1,6,1,4,3},{4,1,5,3,9,4},{3,3,1,8,2,5},{1,5,7,1,2,6},{3,9,9,2,3,7},{6,3,2,1,0,8}};			
		int[][] v3 = {{1,1,6,1,4,3},{1,1,5,3,9,4},{1,3,2,8,2,5},{1,5,7,2,2,6},{3,9,9,2,3,7},{6,3,2,1,0,8}};
		int[][] v4 = {{1,1,6,1,4,1},{4,1,5,3,1,4},{3,3,3,1,2,5},{1,5,1,1,2,6},{3,2,9,2,3,7},{5,3,2,1,0,8}};

		int[][] v5 = {{1,1,6,1,4,0},{4,1,5,3,1,4},{3,3,3,1,2,5},{1,5,1,1,2,6},{3,2,9,2,3,7},{5,3,2,1,0,8}};
		int[][] v6 = {{1,0,1,1,4,3},{4,7,5,3,9,4},{3,3,6,8,2,5},{1,5,7,2,2,6},{3,9,9,2,3,7},{6,3,2,1,0,8}};
		int[][] v7 = {{1,1,6,1,4,3},{4,1,5,3,9,4},{3,3,0,8,2,5},{1,5,7,1,2,6},{3,9,9,2,3,7},{6,3,2,1,0,8}};
		int[][] v8 = {{1,1,6,1,4,3},{1,1,5,3,9,4},{1,3,2,8,2,5},{9,5,7,2,2,6},{3,9,9,2,3,7},{6,3,2,1,0,8}};
		System.out.println(check4(v1)); //row
		System.out.println(check4(v2)); //left diagonal
		System.out.println(check4(v3)); //column
		System.out.println(check4(v4)); //right diagonal		
		System.out.println();
		System.out.println(check4(v5)); //corrupt row
		System.out.println(check4(v6)); //corrupt left diagonal
		System.out.println(check4(v7)); //corrupt column
		System.out.println(check4(v8)); //corrupt right diagonal
		System.out.println();
		//Task 4
		int[][] W = {{2,3},{4,5}};
		int[][] X = {{8,7},{2,7}};
		int[][] Z = {{12,7},{2,6}};
		System.out.println(matrixSimilarity(W,X)); 
		System.out.println(matrixSimilarity(W,Z)); 
		System.out.println();
		//Task 5
		double[][] H = {{0.82,0.25},{0.18,0.75}};
		double[][] I = {{0.82,0.25},{0.14,0.75}};
		System.out.println(isMarkov(H));
		System.out.println(isMarkov(I));
		System.out.println();
		//Task 6
		int[][] M = {{1,3,2,7,4},{4,7,5,3,9},{3,3,6,8,2},{1,5,7,2,2},{3,9,9,2,3}};
		displayMatrix(evenFirst(M));		
	}
	//Task 1 Helper Method
	public static double mean(int[] array) {
		double currentMean = 0;
		for (int value: array) {
			currentMean += (double) value;
		}
		currentMean = currentMean/((double)array.length);
		return currentMean;
	}
	//Task 1 Method
	public static String gradeAssignment(int[] grades) {
		//array of proper grades to be used, however its the wrong length
		int validGradesWrongLength[] = new int[grades.length];
		//index for enhanced for loop
		int index = 0;
		//counter of the proper length of the array
		int properTermCounter = 0;
		//Initializing letterGrade for later
		String letterGrade;
		//for loop to remove invalid arguments
		for (int value: grades) {
			if (value <= 100 && value >= 0) {
				validGradesWrongLength[index] = value;
				properTermCounter +=1;
			}
			index +=1;
		}
		//creating array with proper length
		int validGrades[] = new int[properTermCounter];
		for (int i = 0; i < properTermCounter; i++) {
			validGrades[i] = validGradesWrongLength[i];
		}
		//using helper method to find meanValue
		//since the department doesn't round up, neither do I
		int meanValue = (int) mean(validGrades);
		//Multiple if statements covering each case, switch would have been preferred but couldn't get it to work 
		if (meanValue >= 95 && meanValue <= 100) {
			letterGrade = "A";
			return letterGrade;
		}
		if (meanValue >= 90 && meanValue <= 94) {
			letterGrade = "A-";
			return letterGrade;
		}
		if (meanValue >= 85 && meanValue <= 89) {
			letterGrade = "B+";
			return letterGrade;
		}
		if (meanValue >= 81 && meanValue <= 84) {
			letterGrade = "B";
			return letterGrade;
		}
		if (meanValue == 80) {
			letterGrade = "B-";
			return letterGrade;
		}
		if (meanValue >= 75 && meanValue <= 79) {
			letterGrade = "C";
			return letterGrade;
		}
		if (meanValue >= 70 && meanValue <= 74) {
			letterGrade = "D";
			return letterGrade;
		}
		else {
			letterGrade = "F";
			return letterGrade;
		}
	}
	
	//task 2 Helper Method
	public static double sum(int[] num) {
		double currentSum = 0;
		for (int value: num) {
			currentSum += (double) value;
		}
		return currentSum;
	}
	//Task 2 Method
	public static double randomEvenSumRoot() {
		int numbers[] = new int[100];
		int evenNumberCount = 0;
		double evenSums = 0;
		double finalValue = 0;
		for (int i = 0; i < 100; i++) {
			//I used (1 + (Math.Random() * 1000)) / 10 since random only goes between 0 (inclusive) and 1 (exclusive). This way I get everything from 0 - 100
			int rand = ((1 + (int)(Math.random() *1000)) /10);
			numbers[i] = rand;
			if (rand % 2 == 0 && (rand <= 49 || rand >= 61)) {
				evenNumberCount +=1;
			}
		}
		//array of only even values that satisfy parameters
		int evenNumbers[] = new int[evenNumberCount];
		int index = 0;
		for (int value: numbers) {
			if (value % 2 == 0 && (value <= 49 || value >= 61)) {
				evenNumbers[index] = value;
				index += 1;
			}
		}
		evenSums = sum(evenNumbers);
		finalValue = Math.sqrt(evenSums);
		return finalValue;
		
	}
	
	//Task 3 helper method
	public static boolean isSquare(int[][] array) {
		int rows = array.length;
		int cols = array[0].length;
		if (rows == cols) {
			return true;
		}
		else {
			return false;
		}
	}
	//Task 3
	public static boolean check4(int[][] array) {
		int indexRow = 0;
		int indexCol = 0;
		if (isSquare(array) == false) {
			return false;
		}
		if (array.length != 6) {
			return false;
		}
		for (int row[]: array) {
			for (int value: row) {
				switch(indexRow) {
				//checking first row to find columns and diagonals 4s
				case 0: switch(indexCol) {
						case 0:
							int firstValueRow1 = value;
							//column
							if (array[indexRow+1][indexCol] == firstValueRow1 && array[indexRow+2][indexCol] == firstValueRow1 && array[indexRow+3][indexCol] == firstValueRow1) {
								return true;
							}
							//diagonal
							if (array[indexRow+1][indexCol+1] == firstValueRow1 && array[indexRow+2][indexCol+2] == firstValueRow1 && array[indexRow+3][indexCol+3] == firstValueRow1) {
								return true;
							}
							//row
							if (array[indexRow][indexCol+1] == firstValueRow1 && array[indexRow][indexCol+2] == firstValueRow1 && array[indexRow][indexCol+3] == firstValueRow1) {
								return true;
							} break;
						//column 2 check
						case 1: int secondValueRow1 = value;
							if (array[indexRow+1][indexCol] == secondValueRow1 && array[indexRow+2][indexCol] == secondValueRow1 && array[indexRow+3][indexCol] == secondValueRow1) {
								return true;
							}break;
						//column 3 check
						case 2: int thirdValueRow1 = value;
							if (array[indexRow+1][indexCol] == thirdValueRow1 && array[indexRow+2][indexCol] == thirdValueRow1 && array[indexRow+3][indexCol] == thirdValueRow1) {
								return true;
							}break;
						//column 4 check
						case 3: int fourthValueRow1 = value;
							if (array[indexRow+1][indexCol] == fourthValueRow1 && array[indexRow+2][indexCol] == fourthValueRow1 && array[indexRow+3][indexCol] == fourthValueRow1) {
								return true;
							}break;
						//column 5 check
						case 4: int fifthValueRow1 = value;
							if (array[indexRow+1][indexCol] == fifthValueRow1 && array[indexRow+2][indexCol] == fifthValueRow1 && array[indexRow+3][indexCol] == fifthValueRow1) {
								return true;
							}break;	
						//column 6 check and diagonal check
						case 5: int lastValueRow1 = value;
							if (array[indexRow+1][indexCol] == lastValueRow1 && array[indexRow+2][indexCol] == lastValueRow1 && array[indexRow+3][indexCol] == lastValueRow1) {
								return true;
							}
							if (array[indexRow+1][indexCol-1] == lastValueRow1 && array[indexRow+2][indexCol-2] == lastValueRow1 && array[indexRow+3][indexCol-3] == lastValueRow1) {
								return true;
							}break;
						}break;
				//row 2 check
				case 1: if (indexCol == 0) {
					int firstValueRow2 = value;
					if (array[indexRow][indexCol+1] == firstValueRow2 && array[indexRow][indexCol+2] == firstValueRow2 && array[indexRow][indexCol+3] == firstValueRow2) {
						return true;
					}break;
				}
				//row 3 check
				case 2: if (indexCol == 0) {
					int firstValueRow3 = value;
					if (array[indexRow][indexCol+1] == firstValueRow3 && array[indexRow][indexCol+2] == firstValueRow3 && array[indexRow][indexCol+3] == firstValueRow3) {
						return true;
					}break;
				}
				//row 4 check
				case 3: if (indexCol == 0) {
					int firstValueRow4 = value;
					if (array[indexRow][indexCol+1] == firstValueRow4 && array[indexRow][indexCol+2] == firstValueRow4 && array[indexRow][indexCol+3] == firstValueRow4) {
						return true;
					}break;
				}
				//row 5 check
				case 4: if (indexCol == 0) {
					int firstValueRow5 = value;
					if (array[indexRow][indexCol+1] == firstValueRow5 && array[indexRow][indexCol+2] == firstValueRow5 && array[indexRow][indexCol+3] == firstValueRow5) {
						return true;
					}break;
				}
				//row 6 check
				case 5: if (indexCol == 0) {
					int firstValueRow6 = value;
					if (array[indexRow][indexCol+1] == firstValueRow6 && array[indexRow][indexCol+2] == firstValueRow6 && array[indexRow][indexCol+3] == firstValueRow6) {
						return true;
					} break;
				}
				}
				indexCol +=1;
				if (indexCol >= row.length) {
					indexRow +=1;
					indexCol = 0;
				}
			}
		}
	return false;
		
	}

	//Task 4 Helper Method
	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		}
		else {return false;}
	}
	public static boolean isOdd(int number) {
		if (number % 2 == 1) {
			return true;
		}
		else {return false;}
	}
	//Task 4
	public static boolean matrixSimilarity(int[][] firstArray, int[][] secondArray) {
		int indexRow = 0;
		int indexCol = 0;
		//testing if either one is not square
		if (isSquare(firstArray) == false || isSquare(secondArray) == false) {
			return false;
		}
		//testing to see if different lengths
		if (firstArray.length != secondArray.length) {
			return false;
		}
		for (int[] row: firstArray) {
			for (int value: row) {
				//temp variables to make it easier on me
				int tempFirst = firstArray[indexRow][indexCol];
				int tempSecond = secondArray[indexRow][indexCol];
				//testing false conditions
				if (((isEven(tempFirst) == false && isEven(tempSecond) == false) || (isOdd(tempFirst) == false && isOdd(tempSecond) == false)) && (Math.abs(tempFirst-tempSecond) >= 10)) {
					return false;
				}
				indexCol +=1;
				if (indexCol >= row.length) {
					indexCol = 0;
					indexRow +=1;
				}
			}
		}
	return true;
	}

	//Task 5 Helper method
	//method overloading for type double
	public static boolean isSquare(double[][] array) {
		int rows = array.length;
		int cols = array[0].length;
		if (rows == cols) {
			return true;
		}
		else {
			return false;
		}
	}
	//stupid function but I didn't want to type more
	public static boolean isPositive(double number) {
		if (number > 0) {
			return true;
		}
		else {return false;}
	}
	//Task 5
	public static boolean isMarkov(double[][] array) {
		int indexRow = 0;
		int indexCol = 0;
		//checking if it is square
		if (isSquare(array) == false) {
			return false;
		}
		for (double[] row: array) {
			for (double value: row) {
				//making sure I don't access an index out of bounds
				if (indexRow < row.length-1) {
					double temp = array[indexRow][indexCol];
					double tempBelow = array[indexRow+1][indexCol];
					if (isPositive(temp) == false || (temp + tempBelow != 1)) {
						return false;
					} 
				}
				else {
					double tempBelow = array[indexRow][indexCol];
					double tempAbove = array[indexRow-1][indexCol];
					if (isPositive(tempBelow) == false || (tempBelow + tempAbove != 1)) {
						return false;
					} 
				}
				indexCol +=1;
				if (indexCol >= row.length) {
					indexCol = 0;
					indexRow +=1;
				}
			}
		}
		return true;
	}

	//Task 6 Helper method
	public static void displayMatrix(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
				if(j == 4) {
					System.out.println("");
		}}}
	}
	//Task 6
	public static int[][] evenFirst(int[][] array) {
		if (isSquare(array) == false) {
			System.out.println("Please Input a Square Array"); 
		}
		//these arrays are not the correct length
		int evenList[] = new int[array.length*array[0].length];
		int oddList[] = new int[array.length*array[0].length];
		
		int evenCount = 0;
		int oddCount = 0;
		//Made with assumption that it is square array
		int newArray[][] = new int[array.length][array[0].length];
		//Separating even and odd values
		for (int[] row: array) {
			for (int value: row) {
				if (isEven(value) == true) {
					evenList[evenCount] = value;
					evenCount +=1;
				
				}
				else {
					oddList[oddCount] = value;
					oddCount +=1;
				}
			}
		}
		int evenIndex = 0;
		int oddIndex = 0;
		int indexRow = 0;
		int indexCol = 0;
		//putting correct values into newArray, with evens first
		for (int value: evenList) {
			if (evenIndex < evenCount) {
				newArray[indexRow][indexCol] = evenList[evenIndex];
				evenIndex +=1;
				indexCol +=1;
				if (indexCol >= newArray.length) {
					indexRow +=1;
					indexCol = 0;
				}
			}
			if (evenIndex >= evenCount && oddIndex <= oddCount) {
				if (indexRow < 5) {
					newArray[indexRow][indexCol] = oddList[oddIndex];
					oddIndex +=1;
					indexCol +=1;
					if (indexCol >= newArray.length) {
						indexRow +=1;
						indexCol = 0;
					}
				} 
			}}
		return newArray;
		
	}
}//class bracket
