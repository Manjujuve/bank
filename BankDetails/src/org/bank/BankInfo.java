package org.bank;

public class BankInfo {

	public void savings(int a) {
		System.out.println("Savings Account:"+a);
	}
	public void fixed(int b) {
		System.out.println("Fixed Account:"+b);

	}
	public void deposit(long c) {
		System.out.println("Deposit value:"+c);

	}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.savings(2345);
		b.fixed(78962);
		b.deposit(7890654l);
	}
}
