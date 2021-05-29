package operators;

public class Operators {

	public static void main(String[] args) {
		// Question 1 - Integers to binary
		System.out.println("Question 1 - Integers to Binary:\n" +
		"1 =                    1\n" +
		"8 =                 1000\n" +
		"33 =              100001 = 32+1\n" +
		"78 =             1001110 = 64+8+4+2\n" +
		"787 =         1100000011 = 512+256+2+1\n" +
		"33987 = 1000010011000011 = 32768+1024+128+64+2+1");
		
		// Question 2 - Binary to Decimal
		System.out.println("\nQuestion 2 - Binary to Decimal\n" +
		 "                0010 = 2\n" +
		 "                1001 = 9\n" +
		 "           0011 0100 = 32+16+4=52\n" +
		 "           0111 0010 = 64+32+16+2=114\n" +
		 "      0010 0001 1111 = 512+16+8+4+2+1 = 543\n" +
		 " 0010 1100 0110 0111 = 8192+2048+1024+64+32+4+2+1= 11367");
		
		// Question 3
		System.out.println("\nQuestion 3:");
		int x = 2;
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = x << 1;
		System.out.println("I think x = x << 1 will make x decimal 4 and binary 100..");
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = 9;
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = x << 1;
		System.out.println("I think x = x << 1 will make x decimal 18 and binary 10010..");
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = 17;
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = x << 1;
		System.out.println("I think x = x << 1 will make x decimal 34 and binary 100010..");
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = 88;
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = x << 1;
		System.out.println("I think x = x << 1 will make x decimal 176 and binary 10110000..");
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		
		// Question 4
		System.out.println("\nQuestion 4:");
		x = 150;	// Binary 10010110 = 128+16+4+2
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = x >> 2;
		System.out.println("I think x = x >> 2 will make x decimal 37 and binary 100101..");
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = 225;	// Binary 11100001 128+64+32+0+0+0+0+1
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = x >> 2;
		System.out.println("I think x = x >> 2 will make x decimal 56 and binary 111000..");
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = 1555;	// 1024+512+0+0+0+0+16+0+0+2+1	11000010011
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = x >> 2;													//256+128+4
		System.out.println("I think x = x >> 2 will make x decimal 388 and binary 110000100..");
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = 32456;	// 2048 4096 8192 16384 111111011001000
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		x = x >> 2;											// 4096+2048+1024+512+256+128+32+16+2
		System.out.println("I think x = x >> 2 will make x decimal 8114 and binary 1111110110010..");
		System.out.println("x = " + x + " in decimal and " + Integer.toBinaryString(x) + " in binary.");
		
		// Question 5
		System.out.println("\nQuestion 5:");
		x = 7;				// 00111
		int y = 17;			// 10001
		System.out.println("Bitwise & on 7 & 17 is.... 00001, so 1?");
		int z = 7 & 17;
		System.out.println("Let's see.... it's " + z + " decimal and " + Integer.toBinaryString(z) + " in binary.");
		System.out.println("I think bitwise | will be 10111 so 23");
		z = 7 | 17;
		System.out.println("Let's see.... it's " + z + " decimal and " + Integer.toBinaryString(z) + " in binary.");
		
		// Question 6
		System.out.println("\nQuestion 6:");
		x = 5;
		System.out.print("x = " + x + " and x++ = ");
		x++;
		System.out.println(x);
		
		// Question 7
		System.out.println("\nQuestion 7:");
		x = 0; System.out.println(  "x:     " + x);
		x = x+1; System.out.println("x=x+1: " + x);
		x += 1; System.out.println( "x+=1:  " + x);
		++x; System.out.println(    "++x:   " + x);
		x++; System.out.println(    "x++:   " + x);

		// Question 8
		System.out.println("\nQuestion 8:");
		x = 5; y = 8;
		int sum = ++x + y;
		System.out.println("x=5, y=8. ++x + y=" + sum);
		sum = x+++y;
		System.out.println("x=6, y=8. x++ + y=" + sum);		
	}

}
