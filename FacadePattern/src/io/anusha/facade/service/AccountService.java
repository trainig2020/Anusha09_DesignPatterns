package io.anusha.facade.service;

import io.anusha.facade.Account;
import io.anusha.facade.SavingAccount;

public class AccountService {

	public static Account getAccount(String accountId) {
		return new SavingAccount();
	}
}