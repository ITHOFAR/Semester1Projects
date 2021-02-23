
public class HarrisExtraCredit1 {

	public static void main(String[] args) {
		
		int[] aArray = {10, 112, 13, 15, 187, 19};
		int[] bArray = {17, 210, 23, 135, 47, 29};
		int[] cArray = {24, 121, 213, 105, 107, 9};
		
		int correctValue = 0;
		int currentLargest = 0;
		
		for(int i = 0; i < aArray.length; i++) {
			if(aArray[i] % 2 == 0) {
				correctValue = correctValue + aArray[i];
			}
			if(bArray[i] < 50 && bArray[i] %2 != 0) {
				correctValue = correctValue + bArray[i];
			}
			if(cArray[i] > currentLargest) {
				currentLargest = cArray[i];
			}
		}
		System.out.println(correctValue);
		

	}

}
