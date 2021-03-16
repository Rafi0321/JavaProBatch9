package com.class06;

public class NotOperator {

	public static void main(String[] args) {
		boolean boo=!true;
		System.out.println(boo); //false
		
		boolean boo1=!false;
		System.out.println(boo1); // True
		
		boolean traffic=false;
		
		if (!traffic) {
			System.out.println("I will come on time.");
		}
		
		String day="Monday";
		
		if (!day.equals("Friday")) {
			System.out.println("Today is not friday");
		}
		
		System.out.println("-----------------------------------------");
		//Not operator !----> always palced before condition
		boolean homework=false;
		if(!homework) {
			System.out.println("I will be happy");
		}
		

	}

}
