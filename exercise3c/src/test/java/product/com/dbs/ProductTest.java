package product.com.dbs;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProductTest {
	@Test
	public void productOfNothing() {
		assertThat(Product.product(), is(1));
	}
	
	@Test
	public void productOfOne() {
		assertThat(Product.product(1), is(1));
	}
	
	@Test
	public void productOfTwo() {
		assertThat(Product.product(3, 1), is(3));
	}
	
	@Test
	public void productOfThree() {
		assertThat(Product.product(3, 1, 2), is(6));
	}
	
	@Test
	public void productOfFive() {
		assertThat(Product.product(3, 1, 2, 4, 2), is(48));
	}
}
