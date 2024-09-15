package pfc.util;

import java.util.*;

public enum Move{
	
	/*definition du type enuméré des move*/
	
	ROCK,PAPER,SCISORS;
	
	private static final Random RAND=new Random();
	
	/**Définition des methodes*/
	
	/**
	 * this method compares two given moves for two players.
	 * @param m a Move.
	 * @return an integer which helps us to determine our winner*/
	 
	 public int compare(Move m){
		 if(this==m){
			 return 0;
			 }
		else if((this==Move.ROCK && m==Move.PAPER)||(this==Move.SCISORS && m==Move.ROCK)||(this==Move.PAPER && m==Move.SCISORS)){
			return -1;
			}
		else{
			return 1;
			}
		 }
	
	/**
	 * gives us a randomly move.
	 * @return a Move ( a randomly one).*/
	 
	 public static Move randomMove(){
		 
		 int alea=RAND.nextInt(Move.values() .length);
		 return Move.values()[alea];
		 }
	}