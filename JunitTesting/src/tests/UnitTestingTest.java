package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTestingTest {

	@Test
	void test() {
		UnitTesting obj1 = new UnitTesting();
		int output_f = obj1.square(4);
		assertEquals(16,output_f);
		
	}

}
