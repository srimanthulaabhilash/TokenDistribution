package dailyTask;

import java.util.Scanner;

public class LoopProblems {

	static int factorial(int n) {
		int i;
		int r = 1;
		for (i = n; i >= 1; i--) {
			r = r * i;
		}
		return r;

	}

	static void Fibonacci(int N) {
		int num1 = 0, num2 = 1;

		for (int i = 0; i < N; i++) {
			System.out.print(num1 + " ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
//			System.out.println(num3);
		}
		

	}
	public static void armstrongNumber(int number) {

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

	}
	
	

	public static void main(String[] args) {

		System.out.println("Enter a num for factorial  :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));

		System.out.println("Enter a num for Fibonacci : ");
		int N = sc.nextInt();
		Fibonacci(N);
		
		System.out.println("Enter a number for Amstrong :");
    	int num=sc.nextInt();
		armstrongNumber(num);
		
		
	
	}

	
}