package com.cg.mra.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exceptions.InvalidNumber;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class JUnit {
	AccountDao accountDao = new AccountDaoImpl();
	AccountService accountService = new AccountServiceImpl(accountDao);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws InvalidNumber {
		System.out.println(
				"your account balance is " + accountService.getAccountDetails("1111111111").getAccountBalance());
	}

	@Test
	public void test1() throws InvalidNumber {
		accountService.rechargeAccount("1111111111", 199D);
		System.out.println(
				"your account balance is " + accountService.getAccountDetails("1111111111").getAccountBalance());
	}

	@Test(expected=com.cg.mra.exceptions.InvalidNumber.class)
	public void test2() throws InvalidNumber
	{
		accountService.getAccountDetails("1234567890").getAccountBalance();
	}
}
