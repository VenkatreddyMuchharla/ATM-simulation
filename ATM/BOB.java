package com.ATM;

import java.util.Scanner;

public class BOB implements Bank {
	Scanner sc= new Scanner(System.in);
	public User u;
	BOB(User u){
		this.u=u;
	}

	public void getBalance() {
			System.out.println("Balance: "+u.getBalance());
		}
		

	@Override
	public void deposit() {
		System.out.println("Please Enter amount to deposit");
		double amount=sc.nextDouble();
		if(amount>0) {
		double old= u.getBalance();
		u.setBalance(old+amount);
		System.out.println("Deposit Successful");
		System.out.println("Balance: "+u.getBalance());
		}
		else {
			System.out.println("Enter amount greater than 0");
		}
		}

	@Override
	public void withdraw() {
			System.out.println("Enter amount to withdraw");
			double amount= sc.nextDouble();
			if(amount<0) {
				System.out.println("Please enter amount greater than 0");
			}else if(amount>u.getBalance()) {
				System.out.println("Insufficient funds");
			}else {
				double oldbal=u.getBalance();
				u.setBalance(oldbal-amount);
				System.out.println("Withdrawl Successful");
				System.out.println("Balance :"+u.getBalance());
			}
		}
	

	@Override
	public void changePassword() {
			while(true) {
				System.out.println("Please Enter Your Old Password");
				String pass=sc.next();
				if(pass.equals(u.getPassword())) {
					System.out.println("Enter your New Password");
					String newpass=sc.next();
					u.setPassword(newpass);
					System.out.println("Password Updated Successfully");
					break;
				}
				else {
					System.out.println("You have enterd Wrong Password!!!Please try Again!! ");
				}
			}
	}

}
