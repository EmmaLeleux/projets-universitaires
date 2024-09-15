package pfc.util;
import java.util.*;


public enum Move {
	ROCK,PAPER,SCISSORS;
	
	public static final Random RAND=new Random();
	
	
	 public int compare(Move m){
		 if(this==m){
			 return 0;
			 }
		else if((this==Move.ROCK && m==Move.PAPER)||(this==Move.SCISSORS && m==Move.ROCK)||(this==Move.PAPER && m==Move.SCISSORS)){
			return -1;
			}
		else{
			return 1;
			}
		 }

	
}

