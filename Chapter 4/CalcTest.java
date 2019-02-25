import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	@Before
	public void setUp(){
	final int a = 3;
	final int b=2;
	}
	Calc c = new Calc();
	
	@Test
	public void addTest(int a, int b) {
		assertEquals( c.add(a, b), a+b);
	}
	
	@Test
	public void substractTest(int a, int b) {
		assertEquals( c.substract(a, b), a-b);
	}
	
	@Test
	public void multiplyTest(int a, int b) {
		assertEquals( c.multiply(a, b), a*b);
	}
	
	@Test
	public void divideTest(int a, int b) {
		assertEquals( c.divide(a, b), a/b);
	}

}