import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;
		int quantity;
		double total = 0;

		do {
			System.out.println("\n----- FOOD MENU -----");
			System.out.println("1. Dosa       - Rs. 50");
			System.out.println("2. Samosa     - Rs. 20");
			System.out.println("3. Idli       - Rs. 40");
			System.out.println("4. Vada       - Rs. 30");
			System.out.println("5. Poha       - Rs. 30");
			System.out.println("6. Tea        - Rs. 15");
			System.out.println("7. Coffee     - Rs. 25");
			System.out.println("8. Misal      - Rs. 60");
			System.out.println("9. Upma       - Rs. 35");
			System.out.println("10. Generate Bill");

			System.out.print("Enter Choice : ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Quantity : ");
				quantity = sc.nextInt();
				total = total + 50 * quantity;
				break;

			case 2:
				System.out.print("Enter Quantity : ");
				quantity = sc.nextInt();
				total = total + 20 * quantity;
				break;

			case 3:
				System.out.print("Enter Quantity : ");
				quantity = sc.nextInt();
				total = total + 40 * quantity;
				break;

			case 4:
				System.out.print("Enter Quantity : ");
				quantity = sc.nextInt();
				total = total + 30 * quantity;
				break;

			case 5:
				System.out.print("Enter Quantity : ");
				quantity = sc.nextInt();
				total = total + 30 * quantity;
				break;

			case 6:
				System.out.print("Enter Quantity : ");
				quantity = sc.nextInt();
				total = total + 15 * quantity;
				break;

			case 7:
				System.out.print("Enter Quantity : ");
				quantity = sc.nextInt();
				total = total + 25 * quantity;
				break;

			case 8:
				System.out.print("Enter Quantity : ");
				quantity = sc.nextInt();
				total = total + 60 * quantity;
				break;

			case 9:
				System.out.print("Enter Quantity : ");
				quantity = sc.nextInt();
				total = total + 35 * quantity;
				break;

			case 10:
				System.out.println("\n----- BILL -----");
				System.out.println("Total Bill : Rs. " + total);
				System.out.println("Thank You!");
				break;

			default:
				System.out.println("Invalid Choice.");
			}

		} while (choice != 10);
	}
}