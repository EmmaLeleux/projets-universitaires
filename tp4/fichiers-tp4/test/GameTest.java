import static org.junit.Assert.*;
import org.junit.*;
import pfc.Game;
import pfc.util.*;
import pfc.strategy.*;

public class GameTest{
	
	
	/*Methode de test pour givePoints*/
	@Test
	public void PlayOneRoundTest(){
		Player joueur1= new Player(new Paper(),"player1");
		Player joueur2= new Player (new Rock(),"player2");
		Player joueur3= new Player(new Paper(),"player3");
		Player joueur4= new Player (new Scissor(),"player4");
		Game g1=new Game(joueur1, joueur2);
		g1.PlayOneRound();
		assertEquals(joueur1.getPoints(),2);
		assertEquals(joueur2.getPoints(),0);
		Game g2=new Game(joueur1, joueur3);
		g2.PlayOneRound();
		assertEquals(joueur1.getPoints(),1);
		assertEquals(joueur3.getPoints(),1);
		Game g3=new Game(joueur4, joueur2);
		g3.PlayOneRound();
		assertEquals(joueur4.getPoints(),0);
		assertEquals(joueur2.getPoints(),2);
		}
		
		
	/*Methode de test pour giveWinner*/
	@Test
	public void giveWinnerTest(){
		Player joueur1= new Player(new Paper(),"player1");
		Player joueur2= new Player (new Rock(),"player2");
		Player joueur3= new Player(new Paper(),"player3");
		Player joueur4= new Player (new Scissor(),"player4");
		Game g1=new Game(joueur1,joueur2);
		g1.PlayOneRound();
		assertEquals(joueur1,g1.giveWinner());
		Game g2=new Game(joueur1,joueur4);
		g2.PlayOneRound();
		assertEquals(joueur4,g2.giveWinner());
		Game g3=new Game(joueur1,joueur3);
		g3.PlayOneRound();
		assertNull(g3.giveWinner());
		}
	
	@Test
	public void playTest() {
		Player joueur1= new Player(new Paper(),"joueur1");
		Player joueur2= new Player (new Rock(),"joueur2");
		Game g1=new Game(joueur1, joueur2);
		g1.play(3);
		assertEquals(joueur1.getPoints(),6);
		assertEquals(joueur1,g1.giveWinner());
		assertEquals(3,g1.getnbRouds());
	}
	
	
	public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(GameTest.class);}
        }