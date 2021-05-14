package bankingapp;

public class SavingsAccount {

	private double initialBalance;
	private double currentBalance;
	private double interestRate;
	private String currency;
	private double tax;
	private int accountId;
	
	// Constructor with no values passed - make some default values
	public SavingsAccount() {
		this.initialBalance = 0.0;
		this.currentBalance = 0.0;
		this.interestRate = 1.0;
		this.accountId = 0;
	}
	
	//Constructor with initial balance
	public SavingsAccount(double initialBalance) {
		this.initialBalance = initialBalance;
		this.currentBalance = initialBalance;
		this.interestRate = 1.0;
	}
	
	// Constructor with initial balance, interest, and account #
	public SavingsAccount(double initBal, double intRate, int acctId) {
		this.setInitialBalance(initBal);
		this.currentBalance = initBal;
		this.interestRate = intRate;
		this.accountId = acctId;
	}
	
	// Getters and Setters
	public double getInitialBalance() {
		return this.initialBalance;
	}
	public void setInitialBalance(double amt) {
		this.initialBalance = amt;
	}
	
	public double getCurrentBalance() {
		return this.currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	public double getInterest() {
		return this.interestRate;
	}
	public void setInterest(double intRate) {
		this.interestRate = intRate;
	}
	
	// Class methods
	public void addDeposit(double depositAmt) {
		this.currentBalance += depositAmt;
	}
	
	public void withdraw(double withdrawlAmt) {
		this.currentBalance -= withdrawlAmt;
	}
	
	public String displayAcctStats() {
		java.text.DecimalFormat dFormat = new java.text.DecimalFormat("#.00");
		return "\nSavings Account " + this.accountId + ":"
				+ "\nCurrent Balance: $" + dFormat.format(this.getCurrentBalance())
				+ "\nInterest Rate: " + dFormat.format(this.getInterest())+"%";

	}
}
