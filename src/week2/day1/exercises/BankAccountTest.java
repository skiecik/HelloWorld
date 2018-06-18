package week2.day1.exercises;

import java.math.BigDecimal;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(245632l);
		
		ba.printInfo();
		
		ba.depositCash(new BigDecimal(150));
		ba.printInfo();
		
		ba.withdrawCash(new BigDecimal(200));
		ba.printInfo();
		
		ba.withdrawCash(new BigDecimal(50));
		ba.printInfo();
		
	}
}
