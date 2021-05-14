package maderich.implementationDemo;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		System.out.println("\nKidUser 1: Age 10, BookType 'Kids'");
		KidUser kid1 = new KidUser(10);
		kid1.registerAccount();
		kid1.setBookType("Kids");
		kid1.requestBook();
		System.out.println("\nKidUser 1: Age 10, BookType 'Fiction'");
		kid1.setBookType("Fiction");
		kid1.requestBook();
		
		System.out.println("\nKidUser 2: Age 18, BookType 'Kids'");
		KidUser kid2 = new KidUser(18);
		kid2.registerAccount();
		kid2.setBookType("Kids");
		kid2.requestBook();
		System.out.println("\nKidUser 2: Age 18, BookType 'Fiction'");
		kid2.setBookType("Fiction");
		kid2.requestBook();
		

		System.out.println("\nAdultUser 1: Age 5, BookType 'Kids'");
		AdultUser adult1 = new AdultUser(5);
		adult1.registerAccount();
		adult1.setBookType("Kids");
		adult1.requestBook();
		System.out.println("\nAdultUser 1: Age 5, BookType 'Fiction'");
		adult1.setBookType("Fiction");
		adult1.requestBook();
		
		System.out.println("\nAdultUser 2: Age 23, BookType 'Kids'");
		AdultUser adult2 = new AdultUser(18);
		adult2.registerAccount();
		adult2.setBookType("Kids");
		adult2.requestBook();
		System.out.println("\nAdultUser 2: Age 23, BookType 'Fiction'");
		adult2.setBookType("Fiction");
		adult2.requestBook();

	}

}
