package com.controlstatements;


public class IfAndElse {

	public static void main(String[] args) {
	// if and else if the statement is true it wont go to else statement
		//if statement is not true it will go to else statement
  	int age = 16;
		int age1 = 18;

			
		if (age<=21) {
			System.out.println("you are not eligible to drive!!!!");
		}
		else {
			System.out.println("Congrats you are eligible for liscence!!!");
		}
		
		if (age1<=18) {
			System.out.println("your are eligible to vote to vote");
		}
		else {
			System.out.println("don't go for waiting");
		}
		
	}

}
