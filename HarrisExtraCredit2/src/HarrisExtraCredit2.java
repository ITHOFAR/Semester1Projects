public class HarrisExtraCredit2 {

	public static void main(String[] args) {
		//arrays to pass into method
		//this is the array of cost per shoe
		double costWeekly[] = {12.50, 13.75, 11.00, 9.25};
		//this is the array of sales per day for the week
		double week1Sales[][] = {	{10, 5, 8, 9},
									{9, 6, 8, 7},
									{8, 8, 5, 5},
									{3, 9, 6, 5},
									{6, 7, 1, 4} };
		//method being called
		weeklySalesReport(week1Sales, 1, "Isaac Harris", costWeekly);
	}
	
	//my method to handle creating the table
	public static void weeklySalesReport(double weekSales[][], int week, String creator, double costWeekly[]) {
		//all of my variables that I will use in my two for loops
		double blueTotal = 0;
		double redTotal = 0;
		double greenTotal = 0;
		double orangeTotal = 0;
		
		double mondayTotal = 0;
		double tuesdayTotal = 0;
		double wednesdayTotal = 0;
		double thursdayTotal = 0;
		double fridayTotal = 0;
		
		double monSales = 0;
		double tueSales = 0;
		double wedSales = 0;
		double thurSales = 0;
		double friSales = 0;
		
		double blueMoney = blueTotal * costWeekly[0];
		double redMoney = redTotal * costWeekly[1];
		double greenMoney = greenTotal * costWeekly[2];
		double orangeMoney = orangeTotal * costWeekly[3];
		double weekTotal = mondayTotal + tuesdayTotal + wednesdayTotal + thursdayTotal + fridayTotal;
		double totalMoney = blueMoney + redMoney + greenMoney + orangeMoney;
		
		//my two for loops to run through the weekly sales
		for (int i = 0; i < weekSales.length; i++) {
			for (int j = 0; j < weekSales[i].length; j++) {	
				
				//handling everything dealing with blue shoes
				if (j == 0) {
					blueTotal += weekSales[i][j];
					blueMoney = blueTotal * costWeekly[0];
				}
				//handling everything dealing with red shoes
				if (j == 1) {
					redTotal += weekSales[i][j];
					redMoney = redTotal * costWeekly[1];
				}
				//handling everything dealing with green shoes
				if (j == 2) {
					greenTotal += weekSales[i][j];
					greenMoney = greenTotal * costWeekly[2];
				}
				//handling everything dealing with orange shoes
				if (j == 3) {
					orangeTotal += weekSales[i][j];
					orangeMoney = orangeTotal * costWeekly[3];
				}
				
				//handling everything dealing with Monday
				if (i == 0) {
					mondayTotal += weekSales[i][j];
					//switch statement to handle each type of shoe on Monday
					switch(j) {
					case 0: monSales += weekSales[i][j] * costWeekly[0]; 
							//initial set up for the table
							//I can do this since Monday case 0 is the first iteration through the loop that prints anything
							System.out.println("");
							System.out.println("                               WEEK" + " " + week + " Sales");
							System.out.println("____________________________________________________________________");
							System.out.println("           \t Blue \t Red \t Green \t Orange     Total    Sales \t  ");
							//printing the first numeral values to the table
							System.out.printf("Monday:     \t %.0f \t ", weekSales[i][j]);
							break;
					case 1: monSales += weekSales[i][j] * costWeekly[1]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							break;
					case 2: monSales += weekSales[i][j] * costWeekly[2]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							break;
					case 3: monSales += weekSales[i][j] * costWeekly[3]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							System.out.printf("   %.0f       $%.1f  ", mondayTotal, monSales);
							break;
					}

				}
				//handling everything dealing with Tuesday
				if (i == 1) {
					tuesdayTotal += weekSales[i][j];
					//switch statement to deal with each type of shoe on Tuesday
					switch(j) {
					case 0: tueSales += weekSales[i][j] * costWeekly[0]; 
							System.out.printf("%nTuesday:    \t %.0f \t ", weekSales[i][j]);
							break;
					case 1: tueSales += weekSales[i][j] * costWeekly[1]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							break;
					case 2: tueSales += weekSales[i][j] * costWeekly[2]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							break;
					case 3: tueSales += weekSales[i][j] * costWeekly[3]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							System.out.printf("   %.0f       $%.2f  ", tuesdayTotal, tueSales);
							break;
					}
				}
				//handling everything dealing with Wednesday
				if (i == 2) {
					wednesdayTotal += weekSales[i][j];
					//switch statement to deal with each type of shoe on Wednesday
					switch(j) {
					case 0: wedSales += weekSales[i][j] * costWeekly[0]; 
							System.out.printf("%nWednesday:  \t %.0f \t ", weekSales[i][j]);
							break;
					case 1: wedSales += weekSales[i][j] * costWeekly[1]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
						break;
					case 2: wedSales += weekSales[i][j] * costWeekly[2]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							break;
					case 3: wedSales += weekSales[i][j] * costWeekly[3]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							System.out.printf("   %.0f \t     $%.2f  ", wednesdayTotal, wedSales);
							break;
					}
				}
				//handling everything dealing with Thursday
				if (i == 3) {
					thursdayTotal += weekSales[i][j];
					//switch statement to deal with each type of shoe on Thursday
					switch(j) {
					case 0: thurSales += weekSales[i][j] * costWeekly[0]; 
							System.out.printf("%nThursday:   \t %.0f \t ", weekSales[i][j]);
							break;
					case 1: thurSales += weekSales[i][j] * costWeekly[1]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							break;
					case 2: thurSales += weekSales[i][j] * costWeekly[2]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							break;
					case 3: thurSales += weekSales[i][j] * costWeekly[3]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							System.out.printf("   %.0f \t     $%.1f  ", thursdayTotal, thurSales);
							break;
					}
				}
				//handling everything dealing with Friday
				if (i == 4) {
					fridayTotal += weekSales[i][j];
					//since Friday is the last day/iteration through the loop
					//I decided to update the weekly money and item count here
					weekTotal = mondayTotal + tuesdayTotal + wednesdayTotal + thursdayTotal + fridayTotal;
					totalMoney = blueMoney + redMoney + greenMoney + orangeMoney;
					//switch statement to deal with each type of shoe on Friday
					switch(j) {
					case 0: friSales += weekSales[i][j] * costWeekly[0]; 
							System.out.printf("%nFriday:     \t %.0f \t ", weekSales[i][j]);
							break;
					case 1: friSales += weekSales[i][j] * costWeekly[1]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							break;
					case 2: friSales += weekSales[i][j] * costWeekly[2]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							break;
					case 3: friSales += weekSales[i][j] * costWeekly[3]; 
							System.out.printf("%.0f \t ", weekSales[i][j]);
							System.out.printf("   %.0f \t     $%.2f  ", fridayTotal, friSales);
							//since case 3 on Friday is the last iteration through the loop,
							//I decided that here was where I would print the rest of the table
							System.out.printf("%nWeekly Total: \t %.0f \t %.0f \t %.0f \t %.0f \t         %.0f", blueTotal, redTotal, greenTotal, orangeTotal, weekTotal);
							System.out.printf("%nWeekly Price: \t $%.1f \t $%.2f  $%.1f \t $%.2f \t        $%.2f", costWeekly[0], costWeekly[1] ,costWeekly[2], costWeekly[3], totalMoney);
							System.out.printf("%nSales by Shoe:   $%.1f  $%.2f $%.1f  $%.1f", blueMoney, redMoney, greenMoney, orangeMoney);
							System.out.printf("%n____________________________________________________________________");
							System.out.printf("%nReport Created by " + creator);
							break;
					}
				}
			}
		}
	
	}

}