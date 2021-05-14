package maderich.inheritance;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mgr = new Manager(126534L, "Peter", "Chennai India", 237844L, 65000);
		mgr.calculateSalary();
		mgr.calculateTransportAllowance();
		
		Trainee trn = new Trainee(29846L, "Jack", "Mumbai India", 442085L, 45000);
		trn.calculateSalary();
		trn.calculateTransportAllowance();
	}

}
