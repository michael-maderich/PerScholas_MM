package maderich.inheritance;

public class Employee {
	protected long employeeId;
	protected String employeeName;
	protected String employeeAddress;
	protected Long employeePhone;
	protected double basicSalary;
	protected double specialAllowance = 250.80;
	protected double hra = 1000.50;
	
	public Employee(long id, String name, String address, Long phone) {
		employeeId = id;
		employeeName = name;
		employeeAddress = address;
		employeePhone = phone;
	}
	
	public void calculateSalary() {
		double salary = (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
		java.text.DecimalFormat dFormat = new java.text.DecimalFormat("#.00");
		System.out.println("Salary: $" + dFormat.format(salary));
	}

	public void calculateTransportAllowance() {
		double transportAllowance = .1*basicSalary;
		java.text.DecimalFormat dFormat = new java.text.DecimalFormat("#.00");
		System.out.println("Transport Allowance: $" + dFormat.format(transportAllowance));
	}
	public void calculateTransportAllowance(double allowance) {
		double transportAllowance = allowance*basicSalary/100;
		java.text.DecimalFormat dFormat = new java.text.DecimalFormat("#.00");
		System.out.println("Transport Allowance: $" + dFormat.format(transportAllowance));
		
	}
}
