package testes;

import static org.junit.Assert.*;
import org.junit.Test;

import com.javacodegeeks.SampleExample;

public class SimpleTest {
	
	@Test
	public void test() {
		SampleExample example = new SampleExample();
		example.addInteger(10);
		example.addInteger(100);
		assertEquals(example.getSize(), 2);
	}
}
