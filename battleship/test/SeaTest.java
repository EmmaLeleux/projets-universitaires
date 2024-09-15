import static org.junit.Assert.*;
import org.junit.*;
import example.Sea;
import example.util.*;


public class SeaTest{
	
	@Test
	public void hitDecreaseLifePoints(){
		Ship s= new Ship(3);
		assertEquals(3,s.getLifePoints());
		s.hit();
		assertEquals(2,s.getLifePoints());
		}
		
	@Test
	public void firstShootDecreasesLifePoints(){
		Cell c=new Cell();
		Ship s=new Ship(3);
		c.addShip(s);
		assertEquals(3,s.getLifePoints());
		c.hit();
		assertEquals(2,s.getLifePoints());
		}
	
	@Test
	public void SecondShootNoEffect(){
		Cell c=new Cell();
		Ship s=new Ship(3);
		c.addShip(s);
		assertEquals(3,s.getLifePoints());
		c.hit();
		assertEquals(2,s.getLifePoints());
		c.hit();
		assertEquals(2,s.getLifePoints());
		}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void ShootThrowsExceptionWhenPositionNotValid(){
		Sea s=new Sea(5,5);
		Position p=new Position(10,3);
		s.shoot(p);
		}
		
	 public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(SeaTest.class);
	}}
