package maderich.inheritance;

public class Manager extends Employee {

	public Manager(long id, String name, String address, Long phone) {
		super(id, name, address, phone);
		// TODO Auto-generated constructor stub
	}
	public Manager(long id, String name, String address, Long phone, double salary) {
		super(id, name, address, phone);
		super.basicSalary = salary;
		// TODO Auto-generated constructor stub
	}

	public void calculateTransportAllowance() {
		super.calculateTransportAllowance(15);
	}

}
