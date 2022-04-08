package jnuit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jnuit.q3.InsufficientFundsExpcetion;

class q3Test {
	q3 bank;
@BeforeEach
void init () {
bank =new q3();	
}


	@Test
	void test() throws InsufficientFundsExpcetion {
		Integer a=bank.withdrawl(1000);
		assertEquals(4000,a);
	}
	@Test
	void test1() throws InsufficientFundsExpcetion {
		
		assertThrows(InsufficientFundsExpcetion.class,()->bank.withdrawl(10000));
	}
}
