package org.bank;

public class AxisBank extends BankInfo {

	@Override
	public void deposit(long c) {
		super.deposit(c);
		System.out.println(c);
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit(123);
	}
}
