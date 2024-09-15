package pfc.util;
import pfc.strategy.*;

public class Player{
	
	/* Attributs et methodes*/
	
	private int pts;
	private Strategy strat;
	private String Name;
	
	/*Methodes et constructeur*/
	
	/**
	 *Represents a constructor which associates a strategy for the player.
	 * @param  */

	 public Player(Strategy s, String name){
		 this.strat=s;
		 this.pts=0;
		 this.Name=name;
		 }
	
	/**
	 * gives us the number of points for a player.
	 * @return an integer which represents the number of points of a player.*/
	 
		public int getPoints(){
			return this.pts;
		}
		public String getName() {
			return this.Name;
		}
		
	public void zeroPts(){
		this.pts=0;}
	/**
	 * This method adds points for a given player.*/
	 
	public void addPoints(int p){
		this.pts+=p;
		}
	
	/**
	 *This method gives us the strategy of a player.
	 *@return a Strategy which represents a strategy of a player.*/
	 
	 public Strategy getStrategy(){
		 return this.strat;
		 }
		
	/**
	 *This method sets the strategy of a given player into another strategy which is given as a parametre.*/
	 
	 public void setStrategy(Strategy s){
		 this.strat=s;
		 }
	/**
	 * This method choose a move for a player.
	 *@return a Move the move chosen for our player.*/
	 
	 public Move chooseMove(){
		 return this.strat.choose();
		 }
	
	}