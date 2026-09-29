package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Program {

	public static List<Book> list = new ArrayList<Book>();

	public static Book[] getInstances() {

		Book[] books = new Book[5];

		books[0] = new Book("B06", 199.00, "PO", 45);
		books[1] = new Book("B08", 677.00, "ET", 23);
		books[2] = new Book("B03", 189.00, "MK", 54);
		books[3] = new Book("B02", 125.00, "AK", 65);
		books[4] = new Book("B01", 870.00, "SB", 90);

		return books;
	}

	public static void addBooks(Book[] books) {

		for (int i = 0; i < books.length; i++) {
			list.add(books[i]);
		}
	}

	public static void displayForward() {

		ListIterator<Book> trav = list.listIterator();

		while (trav.hasNext()) {

			Book book = trav.next();

			System.out.println(book);
		}
	}

	public static void displayReverse() {

		ListIterator<Book> trav = list.listIterator(list.size());

		while (trav.hasPrevious()) {

			Book book = trav.previous();

			System.out.println(book);
		}
	}

	public static void acceptRecord(String[] bookid) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Book id : ");

		bookid[0] = scanner.next();
	}

	public static boolean deleteBook(String bookid) {

		Book book = new Book();

		book.setIsbn(bookid);

		if (list.contains(book)) {

			list.remove(book);

			return true;
		}

		return false;
	}

	public static int menuList() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n0. Exit");
		System.out.println("1. Add new books in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Display all books in reverse order");
		System.out.println("4. Delete a book");
		System.out.println("5. Sort all books by price in descending order");
		System.out.print("Enter the choice : ");

		return scanner.nextInt();
	}

	static class SortByPrice implements Comparator<Book> {

		@Override
		public int compare(Book o1, Book o2) {

			return Double.compare(o2.getPrice(), o1.getPrice());
		}
	}

	public static void main(String[] args) {

		int ch;

		String[] bookid = new String[1];

		Book[] books = getInstances();

		while ((ch = menuList()) != 0) {

			switch (ch) {

			case 1:

				addBooks(books);

				System.out.println("Books added successfully.");

				break;

			case 2:

				displayForward();

				break;

			case 3:

				displayReverse();

				break;

			case 4:

				acceptRecord(bookid);

				boolean removed = deleteBook(bookid[0]);

				if (removed)
					System.out.println("Book removed successfully.");
				else
					System.out.println("Book not found.");

				break;

			case 5:

				list.sort(new SortByPrice());

				for (Book book : list) {

					System.out.println(book);
				}

				break;

			default:

				System.out.println("Invalid choice.");

				break;
			}
		}

		System.out.println("Program ended.");
	}
}