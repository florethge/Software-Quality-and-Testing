import org.junit.Before;
import org.junit.Test;

public class InClassTest {
   private EH eh1; private EH eh2; private EH eh3;

   //  Question 1
   @Before public void setUp() {
	   eh1 = new EH(3);
	   eh2 = new EH(5);
	   eh3 = new EH(3); }

   @Test public void noNPE() {
	   eh1.equals(null);
   }          

   @Test public void equalsFalse() {
	   eh1.equals(eh2);
   }    // Question 3

   @Test public void equalsTrue() {
	   eh1.equals(eh3);
   }     // Question 4

   @Test public void hashConsistent() {
	   boolean x = (eh1.hashCode() == eh3.hashCode());
   } // Question 5
}
class EH {
   private int x;
   public EH(int x) { this.x = x; }

   @Override public boolean equals(Object obj) {
      if (!(obj instanceof EH)) return false;
      return ((EH) obj).x == this.x;
   }
   
   public static void main(String[] args){
	   EH eh1 = new EH(1);
	   System.out.println(eh1.equals(null));
   }
    @Override public int hashCode() { return x; }
}