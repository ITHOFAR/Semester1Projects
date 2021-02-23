
public class HarrisToday {

	public static void main(String[] args) {
		/*for(int i = 1; i<11; i++) {
			System.out.println(i);
		} */
		
		/*int i = 1;
		while (i <  11) {
			System.out.print(i + " ");
			i++;
		} */
		
		/*int i = 1;
		do {
			if (i < 6) {
				System.out.print(i + " ");
				i++;
			}
			if (i == 6) {
				System.out.println();
				System.out.print(i + " ");
				i++;
			}
			else {
				System.out.print(i + " ");
				i++;
			}
		} while (i<11); */
		
		/*for(int i = 10; i > 0; i--) {
			System.out.println(i);
		} */
		
		/*int i = 10;
		while (i>0) {
			System.out.print(i + " " + "K" + " ");
			i--;
		} */
		/*
		int i = 1;
		do {
			if (i % 2 == 0) {
			System.out.println(i + " ");
			i++;
			}
			else {
				System.out.print(i + " ");
				i++;
			}
		} while(i<11); */
		/*
		int i = 1;
		do {
			if (i == 5 || i == 10) {
				i++;
				continue;
			}
			else {
				System.out.print(i + " ");
				i++;
			}
		} while(i<10); */
		
		System.out.printf("%-15s%-4s%17s%n", "Name:", "Age:", "Gender:");
		//System.out.printf("%5s", "Hour", "%5s", "Current Speed", "%5s", "Distance(Hours)", "%5s", "Total Distance (Hours)", "%5s", "Distance Remaining", "%5s", "Water Consumed", "%5s", "Water Remaining");
		System.out.printf("%-15s%-15s%-15s%-15s,/n,%-15s%-15s%-15s%15sn", "Hour", "Current Speed", "Distance (Hours)", "Total Distance (Hour)", "Distance Remaining", "Water Consumed", "Water Remaining");
	}

}
