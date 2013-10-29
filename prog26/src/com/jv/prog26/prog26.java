package com.jv.prog26;


import java.util.Scanner;

public class prog26 {

public static void main(String[] args){

	Scanner Keyboard = new Scanner(System.in);


	int grade;



	System.out.println("What is your numerical grade?");
	grade = Keyboard.nextInt();

	grade = (grade/10);


	switch (grade){
		case 9:
			System.out.println("Your grade is an A.");
			break;
		case 8:
			System.out.println("Your grade is a B.");
			break;
		case 7:
			System.out.print("Your grade is a C.");
			break;
		case 6:
			System.out.print("Your grade is a D.");
			break;
		default:
			System.out.print("Unfortunately, your grade is an F.");
			break;


	}

}


}
