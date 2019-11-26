import java.util.*;
public class Main {
public static void main(String[] args)
{
	int flag;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Account Number");
	String s=sc.nextLine();
	System.out.println("Enter the Account Balance");
	int a=sc.nextInt();
	System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
	flag=sc.nextInt();
	
	Account obj=new Account(s,a);
	if(flag==1)
	{
		System.out.println("Enter the amount to deposit");
		int amt=sc.nextInt();

		obj.deposit(amt);
		System.out.println(obj.getBalance());
		
		
	}
	else if(flag==2)
	{
		System.out.println("Enter the amount to withdraw ");
		int amt2=sc.nextInt();

		obj.withdraw(amt2);
		
		
		
	}
}
}
