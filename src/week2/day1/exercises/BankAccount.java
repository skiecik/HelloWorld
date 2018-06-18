package week2.day1.exercises;

import java.math.BigDecimal;

public class BankAccount {

	private long number;
	private BigDecimal cash = new BigDecimal(0);

	public BankAccount(long number) {
		this.number = number;
	}

	public long getNumber() {
		return number;
	}

	public BigDecimal getCash() {
		return cash;
	}
	
	public void depositCash(BigDecimal amount) {
		if (amount.compareTo(new BigDecimal(0)) != -1){
			this.cash = this.cash.add(amount);
		}
	}
	
	public BigDecimal withdrawCash (BigDecimal amount) {
		if (amount.compareTo(this.cash) == 1) {
			System.out.println("Not enough credits on account");
			return new BigDecimal(0);
		} else {
			this.cash = this.cash.subtract(amount);
			return amount;
		}
	}
	
	public void printInfo() {
		System.out.println("Account number: "+ this.getNumber());
		System.out.println("Amount of cash: " + this.getCash());
	}
}
