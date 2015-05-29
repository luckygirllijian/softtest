package com.cal;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calcul = new Calculator();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		int result = calcul.add(4, 3);
		Assert.assertEquals(7, result);	}

	@Test
	public void testMinus() {
		int result = calcul.minus(10, 9);
		Assert.assertEquals(1, result);	}

	@Test
	public void testMultiply() {
		int result = calcul.multiply(3, 3);
		Assert.assertEquals(9, result);	}

	@Test
	public void testDivide() {
		int result;
		try {
			result = calcul.divide(12,2);
			Assert.assertEquals(6, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

}
