package com.app.fruits;

import java.util.Scanner;

abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;

	public Fruit() {

	}

	public Fruit(String name, double weight, String color) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	}

	public abstract String taste();

}

class Apple extends Fruit {

	public Apple() {
		super();
	}

	public Apple(String name, double weight, String color) {
		super(name, weight, color);
	}

	@Override
	public String taste() {
		return "Sweet and sour";
	}
}

class Mango extends Fruit {

	public Mango() {
		super();
	}

	public Mango(String name, double weight, String color) {
		super(name, weight, color);
	}

	@Override
	public String taste() {
		return "sweet";
	}

}

class Orange extends Fruit {

	public Orange() {
		super();
	}

	public Orange(String name, double weight, String color) {
		super(name, weight, color);
	}

	@Override
	public String taste() {
		return "sour";
	}

}

public class FruitBasket {

	public static int menulist(Scanner sc) {

		int choice;

		System.out.println("\n0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple ");
		System.out.println("4.Display names of all fruits");
		System.out.println("5.Display details of all fresh fruits");
		System.out.println("6. Display tastes of all stale fruits");
		System.out.println("7.Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale");

		System.out.println("Enter choice : ");
		choice = sc.nextInt();

		return choice;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the basket size:");
		int n = sc.nextInt();

		Fruit[] basket = new Fruit[n];

		int counter = 0;

		int choice;

		while ((choice = menulist(sc)) != 0) {

			switch (choice) {

			case 0:
				System.out.println("Exit");
				break;

			case 1:

				if (counter >= basket.length) {
					System.out.println("Basket is full.");
					break;
				}

				System.out.println("Enter Mango name : ");
				String mangoName = sc.next();

				System.out.println("Enter Mango weight : ");
				double mangoWeight = sc.nextDouble();

				System.out.println("Enter Mango color : ");
				String mangoColor = sc.next();

				basket[counter++] = new Mango(mangoName, mangoWeight, mangoColor);

				System.out.println("Mango added successfully.");
				break;

			case 2:

				if (counter >= basket.length) {
					System.out.println("Basket is full.");
					break;
				}

				System.out.println("Enter Orange name : ");
				String orangeName = sc.next();

				System.out.println("Enter Orange weight : ");
				double orangeWeight = sc.nextDouble();

				System.out.println("Enter Orange color : ");
				String orangeColor = sc.next();

				basket[counter++] = new Orange(orangeName, orangeWeight, orangeColor);

				System.out.println("Orange added successfully.");
				break;

			case 3:

				if (counter >= basket.length) {
					System.out.println("Basket is full.");
					break;
				}

				System.out.println("Enter Apple name : ");
				String appleName = sc.next();

				System.out.println("Enter Apple weight : ");
				double appleWeight = sc.nextDouble();

				System.out.println("Enter Apple color : ");
				String appleColor = sc.next();

				basket[counter++] = new Apple(appleName, appleWeight, appleColor);

				System.out.println("Apple added successfully.");
				break;

			case 4:

				System.out.println("\nNames of fruits:");

				for (Fruit fruit : basket) {

					if (fruit != null) {
						System.out.println(fruit.getName());
					}
				}

				break;

			case 5:

				System.out.println("\nFresh fruits:");

				for (Fruit fruit : basket) {

					if (fruit != null && fruit.isFresh()) {

						System.out.println(fruit);
						System.out.println("Taste : " + fruit.taste());
					}
				}

				break;

			case 6:

				System.out.println("\nStale fruits:");

				for (Fruit fruit : basket) {

					if (fruit != null && !fruit.isFresh()) {

						System.out.println(fruit.getName());
						System.out.println("Taste : " + fruit.taste());
					}
				}

				break;

			case 7:

				System.out.println("Enter fruit index : ");
				int index = sc.nextInt();

				if (index < 0 || index >= counter) {

					System.out.println("Invalid index.");

				} else {

					basket[index].setFresh(false);
					System.out.println("Fruit marked as stale.");
				}

				break;

			case 8:

				for (Fruit fruit : basket) {

					if (fruit != null && fruit.taste().equals("sour")) {

						fruit.setFresh(false);
		}
				}

				System.out.println("All sour fruits marked as stale.");
				break;

			default:

				System.out.println("Invalid choice.");
			}
		}

		sc.close();

	}

}