package com.class05;

public class AnotherExample {

	public static void main(String[] args) {
			
		
		/* We have to calculate commission based on salse
		 * 
		 * ask user to enter sale that he made
		 * based on sales we will calculate commission:
		 * is sale is between 10 to 100 --> commission is 10%
		 * is sales is between 101 to 100 --> commission is 20%
		 * if sale is between 501 to 1000 --> commission is 30%
		 * if more than 1000 --> commission is 50%
		 */
		
		Scanner scan;
		double saleAmount, commission;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter your daily sale amount");
		saleAmount = scan.nextDoubl();
		
		if (saleAmount < 10 ) {
			commission = 0;
		} else if (saleAmount >= 10 && saleAmount <=100) {
			commission = saleAmount * 0.1;
		} else if (saleAmount > )
	}

}
