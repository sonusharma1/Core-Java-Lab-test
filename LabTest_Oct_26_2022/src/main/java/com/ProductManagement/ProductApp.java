package com.ProductManagement;

import java.util.Scanner;

public class ProductApp {

	// method to print all menu
	public static void menu() {

		System.out.println("\n-----------MENU-----------\n");
		System.out.println("1. Add Product");
		System.out.println("2. Delete Product");
		System.out.println("3. Display Products");
		System.out.println("4. Exit");
	}

	// main method
	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);
			ProductDaoImple productImple = new ProductDaoImple();
			productImple.exsistingProduct();

			int choice = 0;

			do {

				menu();
				System.out.println("\nEnter Your Choice : ");
				choice = sc.nextInt();

				switch (choice) {

				// to add product
				case 1: {
					productImple.addProduct();
					System.out.println("Product added successfully :) ");
					break;
				}

				// to delete product
				case 2: {
					System.out.println("Enter priduct id to be deleted  : ");
					boolean isDeleted = productImple.deleteProduct(sc.nextInt());

					if (isDeleted)
						System.out.println("Product deleted");
					else
						System.out.println("Product not found");

					break;
				}

				// to display product
				case 3: {
					productImple.displayProduct();
					break;
				}

				// to exit
				case 4: {
					System.exit(0);
					break;
				}

				// if user input does not match
				default:
					System.out.println("Worng Input");
					break;
				}

			} while (choice != 4);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
