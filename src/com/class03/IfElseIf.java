package com.class03;

public class IfElseIf {

	public static void main(String[] args) {
		double num1 = 100.20;
		double num2 = 15.20;

		if (num1 > num2) {
			System.out.println("Double Value" + num1 + "is Larger than" + num2);
		} else if (num1 < num2) {
			System.out.println("Double Value" + num2 + " is larger than" + num1);
		} else {
			System.out.println("Double Value" + num1 + " is Larger than" + num1);

		}
		//
		int day = 8;
		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednseday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println("Put the right value");
			// To format code: Ctrl + Shift+f--> Windows
			//To format code:cme + Shift+f--> Mac

		}
	}
}
