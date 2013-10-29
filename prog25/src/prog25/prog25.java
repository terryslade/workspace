package prog25;


import java.util.Scanner;

public class prog25 {



	public static void main(String[] args) {


		double grade;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is your numerical grade?");
		grade = keyboard.nextDouble();

		if (grade > 90)
		{
					System.out.println("Your grade is a A.");
		}
		else
			if (grade > 80)
		{
					System.out.println("Your grade is a B.");
		}
		else
			if (grade > 70)
		{
					System.out.println("your grade is a C");
		}
		else
			if (grade > 60)
		{
					System.out.println("Your grade is a D");
		}
		else
			if (grade < 59)
		{
					System.out.println("Unfortunately, your grade is an F. and have failed");
		}

	}
}
