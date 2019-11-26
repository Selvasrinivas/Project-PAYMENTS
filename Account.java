
public class Account {
private String accountNumber;
private int balance;
int flag;


public Account(String accountNumber,int balance)
{
	this.accountNumber=accountNumber;
	this.balance=balance;
	
}

public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public int getBalance() {
	return balance;
}


public void deposit(int transactionAmount)
{

balance= balance + transactionAmount;
}


public void withdraw(int transactionAmount) 
{
if((balance-transactionAmount)<0)
{
	System.out.println("insufficient balance");
	System.out.println("Your balance after the transaction is"+ balance);

}
else if((balance-transactionAmount)>=0)
	System.out.println("Your balance after the transaction is:"+(balance-transactionAmount));
}
}
