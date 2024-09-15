import static org.junit.Assert.*;
import org.junit.*;
import pfc.util.*;
import pfc.strategy.*;

public class MoveTest{

	/*Methode de test pour la methode compare*/
	@Test
	public void compareTest(){
		Player joueur1= new Player(new Paper(),"player1");
		Player joueur2= new Player (new Rock(),"player2");
		Player joueur3= new Player(new Paper(),"player3");
		Player joueur4= new Player (new Scissor(),"player4");
		assertEquals(-1,joueur2.chooseMove().compare(joueur1.chooseMove()));
		assertEquals(0,joueur1.chooseMove().compare(joueur3.chooseMove()));
		assertEquals(1,joueur4.chooseMove().compare(joueur1.chooseMove()));
		}



public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(MoveTest.class);
	}}