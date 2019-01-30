package com.javaPrac;

public class Test_BankApp {

	public static void main(String[] args) {
		BankApp obj1= new BankApp(), obj2=new BankApp();
		obj1.data_insert(3432, "Bibhu Fox", 1000);
		obj1.deposit(500);
		obj1.withdraw(1200);
		obj1.checkBalance();
		obj1.display();
		obj2.data_insert(1234345, "Petu Fox",2235646);
		obj2.deposit(6473);
		obj2.withdraw(22399999);
		obj2.checkBalance();
		obj2.display();
		
		
	}

}
 class BankApp{
	 int acc_no;
	 String name;
	 float amt;
	  void data_insert(int a , String n , float am)
	  
	  {
		acc_no= a;
		name=n;
		amt=am;
		
	  }
	  float deposit(float am)
	  {
		  amt=amt+am;
		  System.out.println("The deposited amount is   " +am);
		  System.out.println("The available balance is  "+amt);
		return am;
	  }
	  void withdraw(float amount){
		  if(amount>amt)
		  {
			  System.out.println("Insufficient balance  ");
		  }
		  else
		  {
			
			  amt=amt-amount;
			  System.out.println(amount+"    Withdrawn money");
			  System.out.println("The available balance after withdrawal  "+amt);
			 
			  
		  }
	  }
		  
		 void checkBalance()
		 {
			 System.out.println("The current available balance in your account   "+acc_no+" is  "+amt);
		 }
		 
		 void display(){
		System.out.println("name  "+name);
		System.out.println("Account number  "+acc_no);
		System.out.println("Available balance  "+amt);
		}
		 
	  }

