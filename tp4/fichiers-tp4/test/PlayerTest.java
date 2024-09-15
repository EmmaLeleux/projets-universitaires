import static org.junit.Assert.*;
import org.junit.*;
import pfc.util.*;
import pfc.strategy.*;


public class PlayerTest{
	
	@Test
	public void differentget(){
		Rock j2= new Rock();
		Player joueur1= new Player(new Paper(),"j1");
		Player joueur2= new Player (j2,"j2");
		assertEquals(0,joueur1.getPoints());
		System.out.println(joueur1.getStrategy().getClass().getName());
		assertEquals("pfc.strategy.Paper",joueur1.getStrategy().getClass().getName());
		assertEquals("pfc.strategy.Rock",joueur2.getStrategy().getClass().getName());}
		
	@Test
	public void addPointsTest(){
		Player joueur= new Player(new Paper(),"solo");
		joueur.addPoints(1);
		assertEquals(1,joueur.getPoints());
		}
	
	@Test
	public void setStrategyTest(){
		Player joueur1= new Player(new Paper(),"Premier");
		Player joueur2= new Player(new Rock(),"Deuxieme");
		Rock s1= new Rock();
		Scissor s2= new Scissor();
		joueur1.setStrategy(s1);
		joueur2.setStrategy(s2);
		assertEquals(s1,joueur1.getStrategy());
		assertEquals("pfc.strategy.Scissor",joueur2.getStrategy().getClass().getName());
		}
	
	@Test
	public void chooseMoveTest(){
		Player joueur1= new Player(new Paper(),"player1");
		Player joueur2= new Player(new Rock(),"player2");
		assertEquals(Move.PAPER,joueur1.chooseMove());
		assertEquals(Move.ROCK,joueur2.chooseMove());
		
		}
		
	 public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(PlayerTest.class);
	}}