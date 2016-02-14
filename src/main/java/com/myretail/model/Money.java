package com.myretail.model;

import java.math.BigDecimal;

public class Money {
	
	private BigDecimal amount;
	private Currency currency;
	private enum Currency{ USD,GBP};
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	};

}
