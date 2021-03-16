package com.class06;
import 
public class SwitchWithString {

	public static void main(String[] args) {
		/*we need to identify favorite food
		 * we need to capture country from a user
		 * based on the country identify favorite food 
		 */
		Scanner input;
		String country, food;
		
		input=new Scanner(System.in);
		System.out.println("Please Enter your country");
		
		country = input.nextLline();
		
		Switch (country.toUpperCase()) {
			case "USA":
				food = "burger";
				break;
			case "Afghanistan":
				food = "Kabab";
					break;
			case "Vietnam":
				food = "Pho";
					break;
			case "Poland":
				food= "Pierogi";
					break;
			case "Kazastan":
				food= "horse";
					break;
			case "Mexico":
				food="Taco";
					break;
			case "Belarus":
				food="draniki";
					break;
			case "Tajikistan";
				food="Plov";
					break;
			case
		}
		
	}

}
