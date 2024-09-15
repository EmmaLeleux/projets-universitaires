package pfc;
import pfc.strategy.*;
import pfc.util.*;

public class Game {
	
	private Player p1;
	private Player p2;
	private int nbround;
	
	public Game(Player p1, Player p2){
		this.p1=p1;
		this.p2=p2;
		this.nbround=0;
		p1.zeroPts();
		p2.zeroPts();}
		
	public int getnbRouds(){
		return this.nbround;}
	
	/**
	 * gives the points for a player or both of them according to the result 
	 * of the function "compare".
	 * @param res an integer which represents the result of the function "compare".*/
	 
	 private void givePoints(int r){
		 if (r>0){
			 this.p1.addPoints(2);
			 System.out.println(p1.getName()+" l'emporte et marque 2 points");
			 }
		else if(r<0){
			this.p2.addPoints(2);
			System.out.println(p2.getName()+" l'emporte et marque 2 points");
			}
		else{
			p1.addPoints(1);
			p2.addPoints(1);
			System.out.println("égalité, les deux joueurs marquent 1 point");
			}
		 }
	
	/**
	 * gives us the winner of the round.
	 * @return a player which represents the winner of the round.*/
	 
	 public Player giveWinner(){
		 if(p1.getPoints()>p2.getPoints()){
			 return p1;}
		else if (p1.getPoints()<p2.getPoints()){
			return p2;
			}
		else{
			return null;
			}
		 }
	/**
	 * lets the two players play one round.*/
	 
	 public void PlayOneRound(){
		 Move m1=this.p1.chooseMove();
		 Move m2=this.p2.chooseMove();
		 try {
		 System.out.println(this.p1.getName()+" a joué "+m1+". "+this.p2.getName()+" a joué "+m2);
		 int result=m1.compare(m2);
		 this.givePoints(result);
		 System.out.println("Le score est maintenant : "+this.p1.getName()+" = "+ this.p1.getPoints()+" points - "+this.p2.getName()+" = "+this.p2.getPoints()+" points");
		 }
		catch(java.lang.NullPointerException e){
			PlayOneRound();
		}}
	/**
	 * lets both of players play the game for a given number of rounds.*/
	 
	 public void play(int nbRounds){
		 this.nbround=nbRounds;
		 for(int i=0;i<nbRounds;i++){
			 PlayOneRound();
		 }
			 Player res=this.giveWinner();
			 if (res==null) {
				 System.out.println("match nul");
			 }
			 else {
				 System.out.println(res.getName()+" gagne le match");}
		 }

	public static void main(String[] args) {
		try {
		Player joueur1= new Player(new Human(),"joueur1");
		Player joueur2= new Player (new RandomStrat(),"joueur2");
		Game g1=new Game(joueur1, joueur2);
		g1.play(Integer.parseInt(args[0]));}
		catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Veuillez indiquer le nombre de rounds à jouer.");
		}

	}
}

