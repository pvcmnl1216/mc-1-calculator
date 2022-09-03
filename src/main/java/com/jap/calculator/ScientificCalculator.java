package com.jap.calculator;

public class ScientificCalculator {

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			scientificCalculator.cielOfANumber(10);
		} catch (CalculatorException exception) {
			throw new RuntimeException(exception);
		}
		//Call all the methods one by one and surround them by try and respective catch blocks.
		try {
			scientificCalculator.cielOfANumber(2.3f);
			scientificCalculator.floorOfANumber(5.4f);
			scientificCalculator.power(2, 2);
			scientificCalculator.squareRoot(4);
		} catch (CalculatorException exception) {
			throw new RuntimeException(exception);
		}
		MathematicalCalculator mathematicalCalculator = new MathematicalCalculator();
		try {
			mathematicalCalculator.add(6, 4);
			mathematicalCalculator.subtract(2, -3);
			mathematicalCalculator.divide(5, 0);
			mathematicalCalculator.modulo(10, 2);

		} catch (ArithmeticException exception) {
			throw new RuntimeException(exception);
		}

	}

	public double cielOfANumber(float num) throws CalculatorException {
		//check if num is equal to or less than 0 than throw the user defined exception with proper message
		//or else call ceil method of Math class and return the value
		if (num <= 0) {
			throw new CalculatorException("there is error try  with different number");

		}
		return Math.ceil(num);
	}

	public double floorOfANumber(float num) throws CalculatorException {
		//check if num is equal to or less than 0 than throw the user defined exception with proper message
		//or else call floor method of Math class and return the value
		if (num <= 0) {
			throw new CalculatorException("there is error try  with different number");
		}
		return Math.floor(num);
	}

	public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the user defined exception with proper message
		//else use Math pow method and return the value
		if (num1 < num2) {
			throw new CalculatorException("there is error, try  with different number");

		}

		return (long) Math.pow(num1, num2);
	}

	public double squareRoot(int num) throws CalculatorException {
		//check if num is equal to or less than 0 than throw the user defined exception with proper message
		//or else call sqrt method of Math class and return the value
		if (num <= 0) {
			throw new CalculatorException("there is error, try  with different number");

		}
		return Math.sqrt(num);
	}
}
