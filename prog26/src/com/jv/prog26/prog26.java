package com.jv.prog26;


import java.util.Scanner;

public class prog26 {

public static void main(String[] args){

	Scanner Keyboard = new Scanner(System.in);


	int grade;



	System.out.println("What is your numerical grade?");
	grade = Keyboard.nextInt();




	switch (grade){
		case 100:
			System.out.println("Your grade is an A.");
			break;
		case 89:
			System.out.println("Your grade is a B.");
			break;
		case 79:
			System.out.print("Your grade is a C.");
			break;
		case 69:
			System.out.print("Your grade is a D.");
			break;
		case 59:
			System.out.print("Unfortunately, your grade is an F.");
			break;
		default:
			break;

	}

}


}
