import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of numbers you want to print:");
		int count = sc.nextInt();
		int num1 = 1, num2 = 1;
		System.out.print("Fibonacci Series of " + count + " numbers: ");

		for (int i = 1; i <= count; ++i) {
			System.out.print(num1 + " ");
			int sumOfLastTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfLastTwo;
		}
	}
}
