package jnuit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class q1Test {

	@Test
	void main() {
	assertAll(
			
			()->assertArrayEquals(new int[]{1,10},q1.main(new int[] {1,2,3,4,10})),
			()->assertArrayEquals(new int[]{2,10},q1.main(new int[] {7,2,3,4,10})),
			()->assertArrayEquals(new int[]{0,15},q1.main(new int[] {1,2,0,4,10,15}))
);
	}

}
