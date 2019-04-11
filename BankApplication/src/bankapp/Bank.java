package bankapp;

import java.util.Scanner;

public class Bank {
	String name;
	String custumer_ID;
	int balance;
	int previous_transaction;
	public Bank(String cname,String cID) {
		name=cname;
		custumer_ID=cID;
	}
	public void deposit(int amount) {
		if(amount!=0) {
		balance=balance+amount;
		previous_transaction=amount;
		}
	}
	public void withdraw(int amount) {
		if(balance>=amount) {
		balance=balance-amount;
		previous_transaction=-amount;
	}
	}
	public void mini_statement() {
		if(previous_transaction>0) {
			System.out.println("Deposited Rs."+" "+previous_transaction);
		}
		else if(previous_transaction<0) {
			System.out.println("Rs."+" "+Math.abs(previous_transaction)+"is withdrawn from your account");
		}
	}
   public void menu() {
	   int options=0;
   
	   System.out.println("Welcome to HDFC Bank");
	   System.out.println("Customer Name:"+ name);
	   System.out.println("Customer ID:"+custumer_ID);
	   System.out.println("***************************************");
	 do{
	   Scanner s=new Scanner(System.in);
	   System.out.println("Choose what you want to do?");
	   System.out.println("***********************************");
	   System.out.println("1) Deposit");
	   System.out.println("2) Withdraw");
	   System.out.println("3) Mini Statement");
	   System.out.println("4) Balance enquiry");
	   System.out.println("***************************************");
	   System.out.println("Enter your option");
	    options=s.nextInt();
	   
	   switch(options) {
	   case 1:
		   System.out.println("Enter the amount to deposit");
		   System.out.println("\n");
		   int amount=s.nextInt();
		   deposit(amount);
		   System.out.println(amount+" "+"deposited successfully");
		   break;
	   case 2:
		   System.out.println("Enter the amount to withdraw");
		   System.out.println("\n");
		   int amountrs=s.nextInt();
		   withdraw(amountrs);
		   System.out.println(amountrs+" "+"withdrawn successfully");
		   break;
	   case 3:
		   System.out.println("Latest transactions done in your account is");
		   System.out.println("*******************************************");
		   System.out.println("\n");
		   mini_statement();
		   break;
	   case 4:
		   System.out.println("Account Balance:="+" "+balance);
		   break;
	   case 5:
		   System.out.println("*******************************************");
		   break;
	   default:
		   System.out.println("Invalid option");
		   break;
	   }
	 }while(options!=5);
   }
}
	   
   

