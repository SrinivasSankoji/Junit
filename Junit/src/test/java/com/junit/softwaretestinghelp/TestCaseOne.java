package com.junit.softwaretestinghelp;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestCaseOne {

	int x = 36;

	/**
	 * Test Case using JUnit4 
	 */
	@Test
	public void compareInteger() {
		int y = 36;
		Assertions.assertEquals(x, y);
	}

}
