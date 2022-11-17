package com.ProductManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductDaoImple implements ProductDao {

	Scanner sc = new Scanner(System.in);

	// creating ArrayList
	ArrayList<Product> productList = new ArrayList<>();

	// adding products
	public void exsistingProduct() {
		productList.add(new Product(101, "Dimond Chips", 20, 15));
		productList.add(new Product(102, "Parle G", 45, 25));
		productList.add(new Product(103, "Sprite", 10, 45));
		productList.add(new Product(104, "Maza", 32, 68));
		productList.add(new Product(105, "Sev Bhujiya", 12, 78));
		productList.add(new Product(106, "Dairy Milk", 42, 30));
		productList.add(new Product(107, "Amul Cool", 50, 27));
	}

	// adding products through user
	@Override
	public void addProduct() {

		Product product = new Product();

		// taking input
		System.out.println("Enter Product ID : ");
		product.setProductId(sc.nextInt());

		System.out.println("Enter Product Name : ");
		product.setProductName(sc.next());

		System.out.println("Enter Product Quantity : ");
		product.setQuantity(sc.nextInt());

		System.out.println("Enter Product Price : ");
		product.setPrice(sc.nextDouble());

		// adding product to ArrayList
		productList.add(product);
	}

	// to delete products from ArrayList
	@Override
	public boolean deleteProduct(int id) {

		Product foundProduct = null;
		boolean isDeleted = false;

		// finding product in ArrayList
		for (Product product : productList) {
			if (product.getProductId() == id) {
				foundProduct = product;
			}
		}

		// deleting product from ArrayList
		if (foundProduct != null) {
			productList.remove(foundProduct);
			isDeleted = true;
		}

		return isDeleted;
	}

	// to sort and display products
	@Override
	public void displayProduct() {

		System.out.println("\n1. sort by name");
		System.out.println("2. sort by quantity");
		System.out.println("3. sort by price");

		// sort by name using comparator interface
		Comparator<Product> sortByName = (o1, o2) -> {
			return o1.getProductName().compareTo(o2.getProductName());
		};

		// taking input
		int choice = sc.nextInt();

		// sorting
		switch (choice) {

		// sort by name using comparator interface
		case 1:
			Collections.sort(productList, sortByName);
			break;

		// sort by quantity
		case 2:
			Collections.sort(productList, (o1, o2) -> {
				Integer i1 = (Integer) o1.getQuantity();
				Integer i2 = (Integer) o2.getQuantity();
				return i1.compareTo(i2);
			});
			break;

		// sort by price
		case 3:
			Collections.sort(productList, (o1, o2) -> {
				Double i1 = (Double) o1.getPrice();
				Double i2 = (Double) o2.getPrice();
				return i1.compareTo(i2);
			});
			break;

		default:
			System.out.println("worng input");
			break;
		}

		// displaying
		productList.forEach(p -> System.out.println(p));
	}

}
