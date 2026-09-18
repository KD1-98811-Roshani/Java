import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first double value : ");
		if (!sc.hasNextDouble()) {
			System.out.println("Error : First value is not a double.");
			return;
		}
		double num1 = sc.nextDouble();
		System.out.print("Enter second double value : ");
		if (!sc.hasNextDouble()) {
			System.out.println("Error : Second value is not a double.");
			return;
		}
		double num2 = sc.nextDouble();
		double average = (num1 + num2) / 2;
		System.out.println("First Number : " + num1);
		System.out.println("Second Number : " + num2);
		System.out.println("Average : " + average);
	}
}