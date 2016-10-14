package com.capgemini.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static  org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static  org.mockito.MockitoAnnotations.*;

import com.capgemini.exceptions.InsufficientInitialBalanceException;
import com.capgemini.model.Account;
import com.capgemini.repository.AccountRepository;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;

public class AccountTest {

	AccountService accountService;
	
	@Mock
	AccountRepository accountRepository;
	
	
	@Before
	public void setUp() throws Exception {
		//fake object is created.
		MockitoAnnotations.initMocks(this);
		
		accountService = new AccountServiceImpl(accountRepository);
	}

	/*
	 * test cases for create account
	 * 1. when the amount is less than 500 system should throw exception
	 * 2. when the valid info is passed account should be created successfully
	 * 
	 * https://mvnrepository.com/artifact/org.mockito/mockito-all/2.0.2-beta
	 * 
	 */
	
	@Test(expected = com.capgemini.exceptions.InsufficientInitialBalanceException.class)
	public void whenTheAmountIsLessThan500SystemShouldThrowException() throws InsufficientInitialBalanceException
	{
		    
		
		accountService.createAccount(600,400);
	
	}
	
	@Test
	public void whenTheValidInfoIsPassedAccountShouldBeCreated() throws InsufficientInitialBalanceException{
		
		Account a=new Account();
		a.setAccountNumber(1234);
		a.setAmount(600);
		when(accountRepository.save(a)).thenReturn(true);
		assertEquals(a,accountService.createAccount(1234, 600) );
	}
   
	
}
