package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the total amount owed: $");
		double totalAmount = input.nextDouble();
		System.out.print("How much money was tendered: $");
		double amountTendered = input.nextDouble();

		System.out.println("\nTotal Amount: $" + totalAmount + " Tendered Amount: $" + amountTendered);

		getChange(totalAmount, amountTendered);

		input.close();
	}

	public static void getChange(double totAmt, double amtTnd) {

		int twentyBill = 0, tenBill = 0, fiveBill = 0, oneBill = 0, quarter = 0, dime = 0, nickel = 0, penny = 0;
		double change = Math.floor((amtTnd - totAmt) * 100 + 0.5);
		
		
		if (change == 0) {
			System.out.println("Exact Amount Tendered, Thank You!");
		} else if (change < 0) {
			System.err.println("Not Enough Money Tendered!");
		} else {
			System.out.print("Change Received: ");
			while (change > 0) {
				if (change >= 2000) {
					twentyBill = (int) (change / 2000);
					change %= 2000;
				}else if (change >= 1000) {
					tenBill = (int) (change / 1000);
					change %= 1000;
				}else if (change >= 500) {
					fiveBill = (int) (change / 500);
					change %= 500;
				}else if (change >= 100) {
					oneBill = (int) (change / 100);
					change %= 100;
				} else if (change >= 25) {
					quarter = (int)(change / 25);
					change %= 25;
				} else if(change >= 10) {
					dime = (int) (change / 10);
					change %= 10;
				}else if(change >= 5) {
					nickel = (int) (change / 5);
					change %= 5;
				}else if(change >= 1) {
					penny = (int) (change / 1);
					change %= 1;
				}
			}
		}


		if (twentyBill != 0 && twentyBill > 1) {
			System.out.print(twentyBill + " $20 Bills ");
		} else if (twentyBill != 0) {
			System.out.print(twentyBill + " $20 Bill ");
		}
		if (tenBill != 0 && tenBill > 1) {
			System.out.print(tenBill + " $10 Bills ");
		} else if (tenBill != 0) {
			System.out.print(tenBill + " $10 Bill ");
		}
		if (fiveBill != 0 && fiveBill > 1) {
			System.out.print(fiveBill + " $5 Bills ");
		} else if (fiveBill != 0) {
			System.out.print(fiveBill + " $5 Bill ");
		}
		if (oneBill != 0 && oneBill > 1) {
			System.out.print(oneBill + " $1 Bills ");
		} else if (oneBill != 0) {
			System.out.print(oneBill + " $1 Bill ");
		}
		if (quarter != 0 && quarter > 1) {
			System.out.print(quarter + " quarters ");
		} else if (quarter != 0) {
			System.out.print(quarter + " quarter ");
		}
		if (dime != 0 && dime > 1) {
			System.out.print(dime + " dimes ");
		} else if (dime != 0) {
			System.out.print(dime + " dime ");
		}
		if (nickel != 0 && nickel > 1) {
			System.out.print(nickel + " nickels ");
		} else if (nickel != 0) {
			System.out.print(nickel + " nickel ");
		}
		if (penny != 0 && penny > 1) {
			System.out.print(penny + " pennies ");
		} else if (penny != 0) {
			System.out.print(penny + " penny ");
		}

	}

}
