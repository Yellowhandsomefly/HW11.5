import java.util.Date;

public class Account{
	//Create data fields
	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated;
	
	//Constructor
	Account(){
	}
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	//Mutator methods
	void setId(int id){
		id = (this.id >= 0) ? this.id : 0;	
	}
	void setBalance(double balance){
		balance = (this.balance >= 0) ? this.balance : 0;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	

	//Accessor methods
	int getId(){
		return id;
	}
	double getBalance(){
		return balance;
	}
	double getAnnualInterestRate(){
		return annualInterestRate;
	}
	Date getDateCreated(){
		return dateCreated;		
	}

	//Return monthly interest rate, monthly interest
	double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	double getMonthlyInterest(){
		return balance * annualInterestRate / 12;
	}

	//Change withdraw, deposit
	void setWithdraw(int withdraw){
		balance -= withdraw;
	}
	void setDeposit(int deposit){
		balance += deposit;
	}
}