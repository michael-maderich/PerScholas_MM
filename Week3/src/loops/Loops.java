package loops;

public class Loops {

	public static void main(String[] args) {

		// Question 1
		System.out.println("\nQuestion 1:");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// Question 2
		System.out.println("\nQuestion 2:");
		int num = 0;
		while (num <= 100) {
			System.out.println(num);
			num+=10;
		}
		
		// Question 3
		System.out.println("\nQuestion 3:");
		num=1;
		do {
			System.out.println(num++);
		} while (num <= 10);
		
		// Question 4
		System.out.println("\nQuestion 4:");
		for (int i = 1; i <= 100; i++) {
			if (i >= 25 && i <= 75) continue;
			if (i % 5 == 0) System.out.println(i);
		}
		
		// Question 5
		System.out.println("\nQuestion 5:");
		for (int i = 1; i <= 100; i++) {
			if (i > 50) break;
			else if (i % 5 == 0) System.out.println(i);
		}
		
		// Question 6
		System.out.println("\nQuestion 6:\n");
		for (int i = 1; i <= 2; i++) {
			System.out.println("Week "+i+":\n");
			for (int j = 1; j <= 5; j++) {
				System.out.println("Day "+j+"\n");
			}
		}
		
		// Question 7
		System.out.println("Question 7 - Palindromes:");
		for (int x = 10; x <= 200; x++) {
			boolean palindrome = true;
			StringBuffer s = new StringBuffer();
			s.append(String.valueOf(x));
			StringBuffer rev = new StringBuffer();
			rev.append(s);
			rev.reverse();
//			System.out.println(s + " | " + rev);
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != rev.charAt(i)) palindrome = false;
			}
			if (palindrome) System.out.print(x + ", ");
		}
		
		// Question 8
		System.out.println("\n\nQuestion 8 - Fibonacci:");
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1+", ");
		 while (num2 < 50) {
			System.out.print(num2 + ", ");
			int temp = num1;
			num1 = num2;
			num2 += temp;
		}
		 
		 // Question 9
		System.out.println("\nQuestion 9:\n");
		int i = 0; int j = 0;
		for (i = 1; i <= 5; i++) {
			System.out.println("Inner loop: i: " + i + ", j: " + j);
			for (j = 1; j <= 5; j++) {
			}
		}
	}

}
