package brmlab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MynumberTest {

	@Test
	public void test() {
		Mynumber ob = new Mynumber();
		assertEquals(3421,ob.reverse(1234));
		assertEquals(24,ob.sum(18, 6));
	}

}
