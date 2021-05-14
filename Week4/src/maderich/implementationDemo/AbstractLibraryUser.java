package maderich.implementationDemo;

public abstract class AbstractLibraryUser implements LibraryUser {
	protected int age;
	protected String bookType;
	
	public AbstractLibraryUser(int age) {this.age = age;}
	
	public void setAge(int age) {this.age = age;}
	public void setBookType(String bookType) {this.bookType = bookType;}

}
