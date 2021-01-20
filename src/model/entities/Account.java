package model.entities;

public class Account { 
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
		
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount; 
		System.out.println("New balance: " + String.format("%.2f", balance));
	}
	
	public void withdraw(Double amount) {
		if (amount > withdrawLimit) {
			System.out.println("Withdraw error: The amount(" + String.format("%.2f", amount) + 
					") exceeds withdraw limit(" + String.format("%.2f", withdrawLimit) + ")");
		} else if (amount > balance) {
			System.out.println("Withdraw error: Not enough balance(" + String.format("%.2f", balance) +
					") amount(" + String.format("%.2f", amount));
		} else {
			balance -= amount;
			System.out.println("New balance: " + String.format("%.2f", balance));
		}
	}

}
