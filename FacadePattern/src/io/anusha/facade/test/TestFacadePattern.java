package io.anusha.facade.test;

import io.anusha.facade.service.BankingServiceFacade;
import io.anusha.facade.service.BankingServiceFacadeImpl;

public class TestFacadePattern {
	public static void main(String[] args) {
		BankingServiceFacade serviceFacade = new BankingServiceFacadeImpl();
		serviceFacade.moneyTransfer();
	}

}
