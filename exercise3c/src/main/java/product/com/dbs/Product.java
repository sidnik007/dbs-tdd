package product.com.dbs;

public class Product {

	public static int product(int... numbers) {
		int product = 1;
		for (int number : numbers)
			product = product * number; 
		return product;
	}
}
