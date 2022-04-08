package jnuit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jnuit.q3.InsufficientFundsExpcetion;

class q4Test {
	q3 bank;
@BeforeEach
void init () {
bank =new q3();	
System.out.println("trying before each.....");
}
@BeforeAll
static void beforeall() {
	System.out.println("trying before all.....");
}
@AfterEach
void cleanup() {
	System.out.println("cleaning up ......");
}
@AfterAll
static void afterall() {
	System.out.println("trying after all.....");
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
