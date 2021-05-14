package bankingapp;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount sAcct = new SavingsAccount();
		
		System.out.println(sAcct.displayAcctStats());
		
		sAcct.addDeposit(50.00);
		System.out.println(sAcct.displayAcctStats());

		sAcct.withdraw(25.00);
		System.out.println(sAcct.displayAcctStats());

	}

}
