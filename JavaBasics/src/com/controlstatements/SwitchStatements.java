package com.controlstatements;

//executes only one statement from multiple conditions

public class SwitchStatements {
	public static void main(String[] args) {
		//int day = 00;
	int month = 8;
	String monthString = "";
		
//		switch(day) {
//		case 10: System.out.println("10");
//		break;
//		
//		case 20: System.out.println("20");
//		break;
//		
//		case 30: System.out.println("30");
//		break;
//		default: System.out.println("Nothing mtches: please provide exact number");
//		}
	
	//switchstatement
		switch(month) {
		//case statement
		case 1: monthString = "1 is January";
		//break
		break;
		case 2: monthString = " 2 is February";
		break;
		case 3: monthString = "3 is March";
		break;
		case 4: monthString = "4 is April";
		break;
		case 5: monthString = "5 is May";
		break;
		case 6: monthString = "6 is June";
		break;
		case 7: monthString = "7 is July";
		break;
		case 8: monthString = "8 is August";
		break;
		case 9: monthString = "9 is September";
		break;
		case 10: monthString = "10 is October";
		break;
		case 11: monthString = "11 is November";
		break;
		case 12: monthString = "12 is December";
		break;
	default: System.out.println("only 12 months are in a year");
		
		}
		System.out.println(monthString);
		
	}

}
