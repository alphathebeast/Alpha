package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
	private Map<String, String> contacts;

	public PhoneBook() {
		contacts = new HashMap<>();
	}

	public void addContact(String name, String phoneNumber) {
		contacts.put(name, phoneNumber);
		System.out.println("Contact added: " + name + " - " + phoneNumber);
	}

	public void searchContact(String name) {
		if (contacts.containsKey(name)) {
			String phoneNumber = contacts.get(name);
			System.out.println("Contact found: " + name + " - " + phoneNumber);
		} else {
			System.out.println("Contact not found for: " + name);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneBook phoneBook = new PhoneBook();

		while (true) {
			System.out.println("Phonebook Menu:");
			System.out.println("1. Add Contact");
			System.out.println("2. Search Contact");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				System.out.print("Enter name: ");
				String name = scanner.nextLine();
				System.out.print("Enter phone number: ");
				String phoneNumber = scanner.nextLine();
				phoneBook.addContact(name, phoneNumber);
				break;
			case 2:
				System.out.print("Enter name to search: ");
				String searchName = scanner.nextLine();
				phoneBook.searchContact(searchName);
				break;
			case 3:
				System.out.println("Exiting...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid option.");

			}
		}
	}
}
