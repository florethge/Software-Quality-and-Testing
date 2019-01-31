import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class MinTest
{
   private List<Integer> list;   
   
   @Before      
   public void setUp(){
      list = new ArrayList<Integer>();
   }


   @Test      
   public void testWithNull(){
      list = null; 
   }


   @Test
   public void testWithValues(){
      list.add(1);
      list.add(2);
      list.add(0);
      Min.min (list);
   }
   
   @Test
   public void testWithNullInList(){
	   list.add(1);
	   list.add(null);
	   list.add(2);
   }
   
}