package com.java.encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		Account account=new Account();
		account.setAccNo(131);
		account.setName("Neo");
		account.setAmount(2300.0);
		System.out.println(account.getAccNo());
		System.out.println(account.getName());
		System.out.println(account.getAmount());

	}

}
