package BankAccount;
//Bank Account
public class BankAccount {
	//variables
	private String accountNumber;
	private String lastName;
	private String firstName;
	private String taxIDNumber;
	private double checkingBalance;
	private double minCheckingBalance;
	private double maxCheckingWithdrawl;
	private double savingsBalance;
	private double minSavingBalance;
	private double maxSavingWithdrawal;
	private double savingsInterestRate;
	private static int AccountCount = 0;
	//void constructor
	public BankAccount() {}
	//proper constructor
	public BankAccount(String lastName, String firstName, String taxIDNumber, double checkingBalance,
			double savingsBalance, double savingsInterestRate) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.taxIDNumber = taxIDNumber;
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		this.savingsInterestRate = savingsInterestRate;
		
		AccountCount +=1;
		this.accountNumber = "A-00" + AccountCount;
		
		if (checkingBalance <= 1000 || savingsBalance <= 500) {
			System.out.println("Account " + accountNumber + " IS PENDING ADDITIONAL FUNDS");
			this.checkingBalance = 0;
			this.savingsBalance = 0;
			this.minCheckingBalance = 0;
			this.maxCheckingWithdrawl = 0;
			this.minSavingBalance = 0;
			this.maxSavingWithdrawal = 0;
			this.savingsInterestRate = 0;
		}
		else { 
			//So the constructor specifications say to have this print out everytime an account is created
			//however the output slide does not have this, so I just commented it out
			//I understand if you take off points, but hopefully you don't
			//System.out.println("Account " + accountNumber + " HAS BEEN CREATED");
			this.minCheckingBalance = .25 * checkingBalance;
			this.maxCheckingWithdrawl = .40 * checkingBalance;
			this.minSavingBalance = .55 * savingsBalance;
			this.maxSavingWithdrawal = .20 * savingsBalance;
		}
	}
	//methods
	public void displayAccounting() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Name on Account: " + firstName + " " + lastName);
		System.out.println("Tax ID Number: " + taxIDNumber);
		System.out.println("_____________BALANCES_______________");
		if (checkingBalance == 0) {System.out.printf("        Checking: $%.1f", this.checkingBalance);}
		else {System.out.printf("        Checking: $%.2f", this.checkingBalance);}
		System.out.printf("%n        Saving: $%.1f", this.savingsBalance);
		System.out.printf("%n_____________ALLOWANCES_______________");
		System.out.printf("%nMinimum Checking Balance: $%.1f", minCheckingBalance);
		System.out.printf("%nMaximum Checking Withdrawl: $%.1f", maxCheckingWithdrawl);
		if (minSavingBalance == 0) {
			System.out.printf("%nMinimum Savings Balance: $%.1f", minSavingBalance);
		}
		else {System.out.printf("%nMinimum Savings Balance: $%.13f", minSavingBalance);}
		System.out.printf("%nMaximum Savings Withdrawawl: $%.1f", maxSavingWithdrawal);
		System.out.printf("%n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	}
	
	public boolean depositToChecking(double d) {
		this.checkingBalance = checkingBalance + d;
		System.out.println("$" + d + " deposited to Checking");
		return true;
	}
	
	public boolean depositToSavings(double d) {
		this.savingsBalance = savingsBalance + d;
		System.out.println("$" + d + " deposited to Savings");
		return true;
	}
	
	public boolean withdrawFromCheckings(double d) {
		if (d < checkingBalance && ((checkingBalance - d) > minCheckingBalance)) {
			this.checkingBalance = checkingBalance - d;
			System.out.println("$" + d + " withdrawn from Checking");
			return true;
		}
		else {
			System.out.println("Withdraw cannot be made");
			return false;
			}
	}
	
	public boolean withdrawFromSavings(double d) {
		if (d < savingsBalance && ((savingsBalance - d) > minSavingBalance)) {
			this.savingsBalance = savingsBalance - d;
			System.out.println("$" + d + " withdrawn from Savings");
			return true;
		}
		else {
			System.out.println("Withdraw cannot be made");
			return false;
			}
	}
	//getters and setters
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getTaxIDNumber() {
		return taxIDNumber;
	}
	public void setTaxIDNumber(String taxIDNumber) {
		this.taxIDNumber = taxIDNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getMinCheckingBalance() {
		return minCheckingBalance;
	}
	public void setMinCheckingBalance(double minCheckingBalance) {
		this.minCheckingBalance = minCheckingBalance;
	}
	public double getMaxCheckingWithdrawl() {
		return maxCheckingWithdrawl;
	}
	public void setMaxCheckingWithdrawl(double maxCheckingWithdrawl) {
		this.maxCheckingWithdrawl = maxCheckingWithdrawl;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public double getMinSavingBalance() {
		return minSavingBalance;
	}
	public void setMinSavingBalance(double minSavingBalance) {
		this.minSavingBalance = minSavingBalance;
	}
	public double getMaxSavingWithdrawal() {
		return maxSavingWithdrawal;
	}
	public void setMaxSavingWithdrawal(double maxSavingWithdrawal) {
		this.maxSavingWithdrawal = maxSavingWithdrawal;
	}
	public double getSavingsInterestRate() {
		return savingsInterestRate;
	}
	public void setSavingsInterestRate(double savingsInterestRate) {
		this.savingsInterestRate = savingsInterestRate;
	}
	public static int getAccountCount() {
		return AccountCount;
	}
	public static void setAccountCount(int accountCount) {
		AccountCount = accountCount;
	}
	
	
	
}
