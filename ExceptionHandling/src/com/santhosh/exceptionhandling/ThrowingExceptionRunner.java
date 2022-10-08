package com.santhosh.exceptionhandling;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	public String toString() {
		return amount + " " + currency;
	}

	public void add(Amount that) throws CurrenciesDoNotMatchException {
		if (!this.currency.equals(that.currency)) {
			throw new CurrenciesDoNotMatchException("Currencies don't match " + this.currency + " & " + that.currency);
		}
		this.amount = this.amount + that.amount;
	}
}

class CurrenciesDoNotMatchException extends Exception {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amount amount1 = new Amount("USD", 20);
		Amount amount2 = new Amount("INR", 10);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
