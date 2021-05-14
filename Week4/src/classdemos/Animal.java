package classdemos;

public class Animal {
	private String name;
	private String type;
	private int age;
	private int lifeExpectancy;
	
	public Animal() {
		name = "John Doe";
		type = "Unknown";
		age = 0;
		lifeExpectancy = 0;
	}
	
	public Animal(String aName, String aType, int aAge, int lifeExp) {
		name = aName;
		type = aType;
		age = aAge;
		lifeExpectancy = lifeExp;
	}
	
	public static void main(String args[]) {
		Animal a = new Animal("Jeff", "Tiger", 5, 50);
		System.out.println(a.toString());
	}
}
