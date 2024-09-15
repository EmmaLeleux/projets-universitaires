import org.junit.*;
import static org.junit.Assert.*;
import example.Date;
import example.util.*;

public class tests_Date{
	
	@Test
    public void testTomorrow() {
        Date d1=new Date(6,Month.february,2019);
        Date d2=new Date(7,Month.february,2019); 
        assertEquals(d2,d1.tomorrow());
    }
    
    @Test
    public void nDaysAfterIsOkWhenNPositive(){
		Date d1=new Date (13,Month.february,2019);
		Date d2=new Date (15,Month.march,2019);
		assertEquals(d2,d1.nDaysAfter(30));
		Date d3=new Date (13,Month.february,2020);
		assertEquals(d3,d1.nDaysAfter(365));
		}
	@Test(expected= IllegalArgumentException.class)
	public void nDaysAfterThrowsExceptionWhenNnegative(){
		Date d1= new Date(13,Month.february,2019);
		d1.nDaysAfter(-5);
		
		}
	@Test
	public void diffdate(){
		Date d1=new Date (13,Month.february,2019);
		Date d2=new Date (15,Month.march,2019);
		assertEquals(30,d1.DifferenceInDays(d2));
		Date d3=new Date (3,Month.march,2019);
		Date d4=new Date (15,Month.march,2019);
		assertEquals(12,d3.DifferenceInDays(d4));
		Date d6=new Date (1,Month.september,2020);
		Date d5=new Date (15,Month.march,2019);
		assertEquals(536,d6.DifferenceInDays(d5));
		Date d7=new Date (13,Month.february,2019);
		Date d8=new Date (13,Month.february,2019);
		assertEquals(0,d7.DifferenceInDays(d8));}
    
     // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(tests_Date.class);
    }
	}
