package maderich.implementationDemo;

public class AdultUser extends AbstractLibraryUser {

	public AdultUser(int age) {super(age);}
	
	@Override
	public void registerAccount() {
		if (age > 12) System.out.println("You have successfully registered under an Adult Account.");
		else System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
	}

	@Override
	public void requestBook() {
		if (age > 12) {
			if (bookType.equals("Fiction")) System.out.println("Book Issued successfully, please return the book within 7 days.");
			else System.out.println("Oops, you are allowed to take only adult fiction books.");			
		}
		else System.out.println("Sorry, you are a Kid. Please register as so and only take out Kids books.");
	}

}
