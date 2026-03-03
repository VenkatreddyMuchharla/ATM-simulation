package com.ATM;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User u = new User(01, "Venkat", "Venky@", "Venkat77", 2000);
		Bank b = new BOB(u);
		System.out.println("Welcome " + u.getUsername());
		int attempts = 3;
		boolean login = false;
		while (attempts > 0) {
			System.out.println("Enter Your Password");
			String pass = sc.next();
			if (pass.equals(u.getPassword())) {
				System.out.println("You have Logged in Successfully");
				login=true;
				break;
			} else {
				attempts--;
				if(attempts>0) {
				System.out.println("You have " + attempts + "attempts remaining");
				}
			}
		}
		if (!login) {
			System.out.println("Too Many Failed Attempts!!! Please try after some time");
			System.exit(0);
		}

		boolean status = true;
		while (status) {
		System.out.println("Please Choose an Option :");
		System.out.println("1.Deposit\t2.Withdraw\n3.Check Balance\t4.Change Password\n5.View Details\t6.Exit");
		int opt = sc.nextInt();
			switch (opt) {
			case 1 -> {
				b.deposit();
			}
			case 2 -> {
				b.withdraw();
			}
			case 3 -> {
				b.getBalance();
			}
			case 4 -> {
				b.changePassword();
			}
			case 5->{
				System.out.println(u);
			}
			case 6->{
				System.out.println("Thank you for choosing BOB");
				status=false;
			}
			default -> {
				status = false;
				break;
			}
			}
		}
		sc.close();

	}

}
