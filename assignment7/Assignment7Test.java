package assignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Assignment7Test {

	@Test
	void testNone() {
		int expected = 0;
		int result = Assignment7.calc_cost(0, false, false);
		Assert.assertEquals(expected,result);
		} 
		
	
	@Test
	void testOneNoDiscount() {
		int expected = 120;
		int result = Assignment7.calc_cost(1, false, false);
		Assert.assertEquals(expected,result);
		} 

	@Test
	void testOneDiscounts() {
		int expected = 60;
		int result = Assignment7.calc_cost(1, true, true);
		Assert.assertEquals(expected,result);
		} 
	
	@Test
	void testOneStudent() {
		int expected = 102;
		int result = Assignment7.calc_cost(1, false, true);
		Assert.assertEquals(expected,result);
		} 

	
	@Test
	void testTwoNoDiscount() {
		int expected = 108;
		int result = Assignment7.calc_cost(2, false, false);
		Assert.assertEquals(expected,result);
		} 

	@Test
	void testTwoDiscounts() {
		int expected = 48;
		int result = Assignment7.calc_cost(2, true, true);
		Assert.assertEquals(expected,result);
		} 
	
	@Test
	void testNineStudent() {
		int expected = 90;
		int result = Assignment7.calc_cost(9, false, true);
		Assert.assertEquals(expected,result);
		} 
	
	
	@Test
	void testGroupNoDiscount() {
		int expected = 102;
		int result = Assignment7.calc_cost(10, false, false);
		Assert.assertEquals(expected,result);
		} 

	@Test
	void testGroupDiscounts() {
		int expected = 42;
		int result = Assignment7.calc_cost(10, true, true);
		Assert.assertEquals(expected,result);
		} 
	
	@Test
	void testGroupStudent() {
		int expected = 84;
		int result = Assignment7.calc_cost(10, false, true);
		Assert.assertEquals(expected,result);
		} 
}
