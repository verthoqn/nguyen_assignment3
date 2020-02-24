package nguyen_problem2;

public class SavingsAccountTest {
	
	public static void main(String[] args) {
		SavingsAccount saver1, saver2;
		saver1 = new SavingsAccount(2000.00);
		saver2 = new SavingsAccount(3000.00);
		
		int total = 0;
		
		SavingsAccount.modifyInterestRate(.04);
		System.out.println("Balance for Saver 1 with 4% Interest Rate:");
		
		for(int i=0; i<12; i++) {
			saver1.calculateMonthlyInterest();
			System.out.println("Month " + (i+1) + ": " + String.format("%.2f", saver1.getSavingsBalance()));
		}
		
		System.out.println("Balance for Saver 2 with 4% Interest Rate:");
		
		for (int i=0; i<12; i++) {
			saver2.calculateMonthlyInterest();
			System.out.println("Month " + (i+1) + ": " + String.format("%.2f", saver2.getSavingsBalance()));
		}
		
		SavingsAccount.modifyInterestRate(.05);
		System.out.println("Balance for Saver 1 with 5% Interest Rate:");
		
		for(int i=0; i<12; i++) {
			saver1.calculateMonthlyInterest();
			System.out.println("Month " + (i+1) + ": " + String.format("%.2f", saver1.getSavingsBalance()));
		}
		
		System.out.println("Balance for Saver 2 with 5% Interest Rate:");
		
		for (int i=0; i<12; i++) {
			saver2.calculateMonthlyInterest();
			System.out.println("Month " + (i+1) + ": " + String.format("%.2f", saver2.getSavingsBalance()));
		}
	}
}
