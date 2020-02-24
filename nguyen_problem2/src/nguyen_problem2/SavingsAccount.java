package nguyen_problem2;

public class SavingsAccount {
	
	static private double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance) {
		this.savingsBalance=savingsBalance;
	}
	
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	public void calculateMonthlyInterest() {
		double interest;
		interest = (double)((this.savingsBalance*annualInterestRate)/12);
		this.savingsBalance += interest;
	}
	
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
}
