package Week2_OOPS_Feb242023;

class Account{
	String customerName;
	int acctNo;
	Account(){
		
	}
	Account(String a, int b){
		customerName = a;
		acctNo = b;
	}
	void display() {
		System.out.println("Customer Name : "+ customerName);
		System.out.println("Account Number : "+ acctNo);
	}
}

class CurrentAccount extends Account{
	int currentBal;
	CurrentAccount(){
		
	}
	CurrentAccount(String a, int b, int c){
		super(a,b);
		currentBal = c;
	}
	
	void display() {
		super.display();
		System.out.println("Current Balance : "+currentBal);
	}
}

class AccountDetails extends CurrentAccount{
	int depositAmt;
	int withdrawAmt;
	AccountDetails(String a, int b, int c, int d, int e){
		super(a,b,c);
		depositAmt = d;
		withdrawAmt = e;
	}
	void display() {
		super.display();
		System.out.println("Deposit Amount : "+depositAmt);
		System.out.println("Withdrawl Amount : "+withdrawAmt);
	}
}

public class Challenge11_AccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountDetails ad = new AccountDetails("Hari Gopi",5665465,50000,20000,5000);
		ad.display();
		

	}

}
