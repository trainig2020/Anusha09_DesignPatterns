package io.anusha.facade.service;

import io.anusha.facade.Account;

public class BankingServiceFacadeImpl implements BankingServiceFacade {

	@Override
	public void moneyTransfer() {
		if (PaymentService.doPayment()) {
			Account fromAccount = AccountService.getAccount("1");
			Account toAccount = AccountService.getAccount("2");
			TransferService.transfer(1000, fromAccount, toAccount);
		}
	}
}