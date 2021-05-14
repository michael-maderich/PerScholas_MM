package maderich.inheritance;

public class Trainee extends Employee {

	public Trainee(long id, String name, String address, Long phone) {
		super(id, name, address, phone);
		// TODO Auto-generated constructor stub
	}
	public Trainee(long id, String name, String address, Long phone, double salary) {
		super(id, name, address, phone);
		super.basicSalary = salary;
		// TODO Auto-generated constructor stub
	}

}
