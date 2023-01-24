package brmlab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MynumberTest {

	@Test
	public void test() {
		Mynumber object = new Mynumber();
		assertEquals(3421,object.reverse(1234));
		assertEquals(24,object.sum(18, 6));
	}

}
