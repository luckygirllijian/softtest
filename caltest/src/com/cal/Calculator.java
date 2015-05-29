package com.cal;

public class Calculator {
	public int add(int a, int b) {
		return (a + b);
	}

	public int minus(int a, int b) {
		return (a - b);
	}

	public int multiply(int a, int b) {
		return (a * b);
	}

	public int divide(int a, int b) throws Exception {
		if (b==0) {
			System.out.println("ÇëÊäÈë·ÇÁãÊı×Ö");
		}
		return a / b;
	}
}
