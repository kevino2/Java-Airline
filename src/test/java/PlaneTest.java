import org.junit.Before;
import org.junit.Test;

import javax.smartcardio.Card;

import static org.junit.Assert.assertEquals;

 public class PlaneTest {
  private Plane plane;

 @Before
    public void setUp(){
       plane = new Plane(PlaneType.BOEING747);
 }

 @Test
    public void canGetType() {
     assertEquals(PlaneType.BOEING747, plane.getType());
 }

     @Test
     public void canGetCapacity() {
         assertEquals(300, plane.getEnumCapacity());
     }

     @Test
     public void canGetTotalWeight() {
         assertEquals(30000, plane.getEnumWeight());
     }

     @Test
     public void canGetBaggageAllocation() {
         assertEquals(15000, PlaneType.BOEING747.baggageAllocation());
     }

 }
