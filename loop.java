package com.dagnachew.assignment2;

public class loop {
	public static void main (String[] args) {
		byte firstNumber = 0;
		while (firstNumber < 101) {
			System.out.println(firstNumber);
			firstNumber += 2;
		}
		byte lastNumber = 100;
		while (lastNumber >= 0) {
			System.out.println(lastNumber);
			lastNumber -= 3;
		}
		for (int i=1; i <=100; i+=2) {
			System.out.println(i);
		}
		for (int i=0; i<=100; i++) {
			boolean isDivisibleBy3 = (i%3) == 0;
			boolean isDivisibleBy5 = (i%5) == 0;
			boolean isDivisibleBy3And5 = (i%3) == 0 && (i%5) == 0;
			if (isDivisibleBy3And5) {
				System.out.println("HelloWorld");
			}else if (isDivisibleBy3) {
				System.out.println("Hello");
			}else if (isDivisibleBy5) {
				System.out.println("World");
			}else {
				System.out.println(i);
			}
		}
	}
	

}
