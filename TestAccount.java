public class TestAccount{
	//Main method
	public static void main(String[] args){
		//Create a account with id 1122, balance $2000, annual interest rate 4.5%
		Account myAccount = new Account(1122,20000);
		myAccount.setAnnualInterestRate(4.5);

		//The date when this account was created
		java.util.Date dateCreated = myAccount.getDateCreated();

		//Withdraw $2500 deposit $3000
		myAccount.setWithdraw(2500);
		myAccount.setDeposit(3000);

		//Print ID, balance, monthly interest, the date 
		System.out.println("ID: " + myAccount.getId());
		System.out.println("Balance: $" + myAccount.getBalance());
		System.out.println("Monthly interest: $" + myAccount.getMonthlyInterest());
		System.out.println("Date: " + dateCreated.toString());
	}
}