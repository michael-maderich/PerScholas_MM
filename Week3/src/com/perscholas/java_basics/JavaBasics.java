package com.perscholas.java_basics;

public class JavaBasics {

	public static void main(String[] args) {
		// Question 1
		System.out.println("\nQuestion 1:");
		int x, y;
		x = 2; y = 6;
		int sum = x+y;
		System.out.println(sum);

		// Question 2
		System.out.println("\nQuestion 2:");
		double m = 1.2, n = 5.4;
		double doubleSum = m+n;
		System.out.println(doubleSum);

		// Question 3
		System.out.println("\nQuestion 3:");
		int i = 1;
		double j = 2.2;
		double mixedSum = i + j;
		System.out.println(mixedSum);
		
		// Question 4
		System.out.println("\nQuestion 4:");
		int a = 23432, b = 2432;
		int div = a/b;
		System.out.println(div);
		double c = 23432.3;
		double ddiv = c/b;
		System.out.println(ddiv);

		// Question 5
		System.out.println("\nQuestion 5:");
		double h = 10.5, k = 24.1;
		double dddiv = k/h;
		System.out.println(dddiv);
		int l = (int) dddiv;
		System.out.println(l);

		// Question 6
		System.out.println("\nQuestion 6:");
		x = 5; y = 6;
		int q = y/x;
		System.out.println(q);
		// Cast y to a double and assign to q? Can't do that....
		// q = (double) y; // Sure can't
		
		// Question 7
		System.out.println("\nQuestion 7:");
		final int FINALINT = 7;
		int p = FINALINT*3;
		System.out.println(p);
		
		// Question 8
		System.out.println("\nQuestion 8:");
		double coffee = 2.25;
		double cappuccino = 5.99;
		double espresso = 4.50;
		double subtotal, totalSale;
		subtotal = 3*coffee + 4*cappuccino + 2*espresso;
		final double SALES_TAX = 0.06;
		totalSale = subtotal*(1+SALES_TAX);
		System.out.println("Coffee:\t\t$"+coffee);
		System.out.println("Cappuccino:\t$"+cappuccino);
		System.out.println("Espresso:\t$"+espresso);
		System.out.println("\nOrder of 3 coffee, 4 cappucino, and 2 espresso:");
		System.out.println("\nSubtotal:\t$"+subtotal);
		System.out.println("Tax:\t\t$"+((int)((subtotal*SALES_TAX)*100))/100.0 );
		System.out.println("----------------------------");
		System.out.printf("Total:\t$"+((int)(totalSale*100))/100.0);
	}
}
