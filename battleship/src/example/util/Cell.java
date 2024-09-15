package example.util;

import example.util.*;
/**
 *  In this version we are going to create a class of board's cells.
 * 
 * @author BENFYALA Marwa & LELEUX Emma 
 * @version 1.0
 */
 
 public class Cell{
	 
	 /**Les attributs privés représentants une cellule.*/
	 private boolean hasbeenHitted;
	 private static final char EMPTY_CHAR='~';
	 private Ship bateau;
	 
	 /** Methodes et constructeurs*/
	 
	 /**
	  * creates a cell with given position.
	  * @param p the given position of the cell.*/
	  
	  public Cell(){
		  this.bateau=null;
		  this.hasbeenHitted=false;
		 }
	  
	  
	  /**
	   * hits the created cell.
	   * @return an Answer.*/
	   
	   public Answer hit(){
		   if (this.IsEmpty()||this.hasBeenHitted()){
			   this.hasbeenHitted=true;
			   return Answer.MISSED;
			   }
		   else{
			   this.getShip().hit();
			   this.hasbeenHitted=true;
			   if(this.getShip().getLifePoints()==0){
				   return Answer.SUNK;}
				else{
					return Answer.HIT;
					}
			   }
		   }
	  
	  /**
	   * checks if the created cell is Empty or not.
	   * @return true if the cell is empty and false otherwise.*/
	   
	   public boolean IsEmpty(){
		   boolean res=false;
		   Ship a=this.bateau;
		   if(a==null){
			   res=true;
			   }
			 return res;
		   }
	   /**
	    * tells us if the created cell has been hitted.
	    * @return a boolean true if the created cell has been hitted and false otherwise.*/
	    
	    public boolean hasBeenHitted(){
			return this.hasbeenHitted;
			}
	   
	   /**
	    * adds a ship in a cell if this latter is empty.
	    * @param s a ship.
	   */
	    
	    public void addShip(Ship s){
			if(this.IsEmpty()){
				this.bateau=s;}
			}
	  
	  
	  /**
	   * give us the content of the cell
	   * @return the bateau's value*/
	  public Ship getShip(){
		  return this.bateau;}
		  
/**
	   * gives us a char which represents the state of a cell for a defender if "b=true" and for the opponent otherwise
	   * @param b a boolean true for the defender and false for the opponent.
	   * @return a character.*/
	  
	  public char getCharacter(boolean b){
		  if (b)/*s'il s'agit d'un defender*/{
			  if(this.IsEmpty()){
				  return this.EMPTY_CHAR;
				  }
			   else if(!this.hasBeenHitted()){
				  return 'B';
				  }
			  
			  else{
				  return '*';
				  }
		  }
		  else/*s'il s'agit d'un attaquant*/{
			  if(!this.hasBeenHitted()){
				  return '.';
				  }
			  else if(this.IsEmpty()){
				  return this.EMPTY_CHAR;
				  }
			  else{
				  return '*';
				  }
			  }  
	 }
	 
 }
