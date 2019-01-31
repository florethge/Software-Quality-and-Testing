import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class BoundedQueueTest extends TestCase {
	
	private BoundedQueue bq;
	private Object a, b, c;
	
	@Before      
	public void setUp(){
		bq = new BoundedQueue(3);
		a = b = c = new Object();
	}
	
	@Test
	public void capacityUnderZero(){
		BoundedQueue bq2 = new BoundedQueue(-1);
	}
	
	@Test
	public void testEnQueue(){
		bq.enQueue(a);
		bq.enQueue(b);
	}
	
	@Test
	public void testDeQueueEmpty(){
		bq.deQueue();
	}
	
	@Test
	public void testDeQueueNotEmpty(){
		bq.enQueue(a);
		bq.deQueue();
	}
	
	@Test
	public void testIsEmpty(){
		bq.isEmpty();
		bq.enQueue(a);
		bq.isEmpty();
	}
	
	@Test
	public void testToString(){
		bq.enQueue(a);
		bq.enQueue(b);
		bq.toString();
	}
}
