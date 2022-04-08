package jnuit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class q2Test {

	@Test
	void test() {
		   assertAll(
	                () -> assertEquals("Min is 0 Max is 34", q2.findMinMax2(new int[]{0, 1, 2, 34, 5, 6})),
	                () -> assertEquals("Min is 1 Max is 10", q2.findMinMax2(new int[]{1, 2, 10, 5, 6})),
	                () -> assertEquals("Min is 2 Max is 100", q2.findMinMax2(new int[]{ 100, 2, 34, 5, 6})));
	    }
	}