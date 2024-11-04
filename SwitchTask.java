package dailyTask;

import java.util.Scanner;

public class SwitchTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("switch :");
		System.out.println("1.check Even or Odd");
		System.out.println("2.Factorial Number");
		System.out.println("3.Fibonacci Series");
		System.out.println("4.Armstrong Number");
 
		int x = sc.nextInt();
 
		switch (x) {
		case 1:
			System.out.println("Entter a number : ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				System.out.println(num + " is even");
			} else {
				System.out.println(num + " is odd");
			}
			break;
		case 2:
			System.out.println("Enter a number : ");
			int fact = sc.nextInt();
			long factorial = 1;
			for (int i = 1; i <= fact; i++) {
				factorial = factorial * i;
			}
			System.out.println("factorial of " + fact + " is " + factorial);
			break;
		case 3:
			System.out.println("Enter a number :");
			int NumberOfTerms = sc.nextInt();
			int FirstTerm = 0;
			int SecondTerm = 1;
			System.out.println("Fibinocci Series : ");
			System.out.print(FirstTerm + "  " + SecondTerm + "  ");
			for (int i = 2; i < NumberOfTerms; i++) {
				int NextTerm = FirstTerm + SecondTerm;
				System.out.print(NextTerm + "  ");
				FirstTerm = SecondTerm;
				SecondTerm = NextTerm;
 
			}
			break;
 
		case 4:
			System.out.println("Enter a number :");
			int number = sc.nextInt();
			int originalNumber, remainder, result = 0;
			originalNumber = number;
			while (originalNumber != 0) {
				remainder = originalNumber % 10;
				result += Math.pow(remainder, 3);
				originalNumber /= 10;
			}
			if (result == number)
				System.out.println(number + " is an Armstrong number.");
			else
				System.out.println(number + " is not an Armstrong number.");
			sc.close();
			break;
		default:
			System.out.println("Invalid choice");
 
		}
		sc.close();
 
	}
	}


