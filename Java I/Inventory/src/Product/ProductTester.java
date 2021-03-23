package Product;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ProductTester {


	public static void main(String[] args) {

		int tempId;
		String tempName;
		int tempQty;
		double tempPrice;
		int maxSize = -1;

		Scanner in = new Scanner(System.in);

		do {
			try {
				System.out.println("Enter the number of products you would like to add \n" 
						+ "Enter 0 (zero) if you do not wish to add products:");
				maxSize = in.nextInt();
				if (maxSize < 0) {
					System.out.println("Incorrect value entered!");
				}
			} 
			catch (Exception e) {
				if (e instanceof InputMismatchException) {
					System.out.println("Incorrect data type entered!");
				}
				in.nextLine();
			}
		}while (maxSize < 0);

		if (maxSize == 0){
			System.out.println("No products required!");
		}else {
			Product[] products = new Product[maxSize];
			for (int i = 0; i < maxSize; i++) {
				in.nextLine();
				System.out.println("REGISTER YOUR PRODUCT HERE \n"
						+ "Enter the ID:");
				tempId = in.nextInt();
				System.out.println("Enter the name:"); tempName = in.next();
				System.out.println("Enter the quantity:");
				tempQty = in.nextInt();
				System.out.println("Enter the price:");
				tempPrice = in.nextDouble();

				products[i] = new Product(tempId, tempName, tempQty, tempPrice);  
			}
			for (Product product : products) {
				System.out.println(product.toString());
			}
		}

		in.close();	
	}//end method main
}//end ProductTester class
