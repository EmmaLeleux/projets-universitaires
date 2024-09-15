package example;
import java.util.*;
import example.util.*;
import example.util.io.*;

/**
 *  In this version we are going to create a class for the board (sea).
 * 
 * @author BENFYALA Marwa & LELEUX Emma 
 * @version 1.0
 */
 
 public class Sea{
	 
	 /**Les attributs privés de sea*/
	 private Cell[][] TheCells;/* board tableau à deux dimensions*/
	 private int TotalLifePoints;
	 
	 
	 /**Methodes & Constructeur*/
	 
	 /**
	  * creates a new board(sea)*/
	 
	 public Sea(int width, int height){
		 this.TheCells= new Cell[width][height];
		 for(int i=0;i<width;i++){
			 for(int j=0;j<height;j++){
				 this.TheCells[i][j]=new Cell();
				 this.TotalLifePoints=0;
				 }
			 }
		 }
	 /**
	  * gives the cell wanted.
	  * @return a Cell. */
	  
	  public Cell getCell(Position p){
		  return this.TheCells[p.getX()][p.getY()];
		  }
	  
	  /**
	   * gives the width of the board.
	   * @return an integer which represents the width of the board.*/
	   
	   public int getWidth(){
		   return this.TheCells[0].length;
		   }
		/**
		 * gives us the total life points .
		 * @return an integer which represents the total life points.*/
		public int getTotalLifePoints(){
			return this.TotalLifePoints;}
		
	   /**
	    * gives the height of the board.
	    * @return an integer which represents the height of the board.*/
	    
	    public int getHeight(){
			return this.TheCells.length;
			}
	
	/**
	 * shoots a cell.
	 * @param p the position of the shooted cell (the cell that we want to shoot).
	 * @return an answer MISSED or HIT or SUNK.
	 * @exception ArrayIndexOutOfBoundException if the cell doesn't exist
	 */
	 
	 public Answer shoot(Position p){
		 if(p.getX()<0||p.getY()<0||p.getX()>=this.getHeight()||p.getY()>=this.getWidth()){
			 throw new ArrayIndexOutOfBoundsException("position invalide");
			 }
			 Cell c= this.getCell(p);
			 Answer a= c.hit();
			 if(a==Answer.HIT||a==Answer.SUNK){
				 this.TotalLifePoints--;
				 }
				 return a;
		 }

	/**
	 * displays the board line by line and cell by cell.
	 * the display changes for the defender or the opponent, defined
	 * by the <code>defender</code> argument
	 * @param defender <code>true</code> if display is for defender ,
	 * <code>false</code> if for opponent.*/
	 
	 public void display(boolean defender){
		 if(defender){
			 for(int i=0;i<this.getWidth();i++){
				 String ligne="";
				for(int j=0;j<this.getHeight();j++){
					Cell c=this.TheCells[j][i];
					char car=c.getCharacter(defender);
					ligne+=car;}
					System.out.println(ligne);
			 
		 }}
		 else{
			 for(int i=0;i<this.getWidth();i++){
				 String ligne="";
				 for(int j=0;j<this.getHeight();j++){
					 Cell c=this.TheCells[j][i];
					char car=c.getCharacter(defender);
					ligne+=car;}
					System.out.println(ligne);
					 
				 }
			 }}
	
	/**
	 * add the ship b vertically down from position p. The number of
	 * cells is dertemined by the ship length.
	 * @param shipToPlace the ship to add.
	 * @param position the position of the first (top) cell occupied by the ship.
	 * @throws IllegalStateException if the ship b can not be placed ont he sea 
	 * (outside of the board or some cell is not empty).*/
	 
	 public void addShipVertically(Ship shipToplace, Position position){
		 try{
			int i=1;
			this.TotalLifePoints+=shipToplace.getLifePoints();
			int taille=shipToplace.getLength();
			while(taille>0){
					 Cell c=this.getCell(position);
					 if(c.IsEmpty()){
					 c.addShip(shipToplace);
					 
					 taille-=1;
					 Position p=new Position(position.getX(),position.getY()+i);
					 position=p;
					 }
					 else{
						 throw new IllegalStateException("place déjà occupée");}
					 }
			 }
		catch (ArrayIndexOutOfBoundsException e){
			throw new IllegalStateException("place inexistance");
			}
		 }
	
	/**
	 * add the ship b horizontally down from position p. The number of
	 * cells is dertemined by the ship length.
	 * @param shipToPlace the ship to add.
	 * @param position the position of the first (left) cell occupied by the ship.
	 * @throws IllegalStateException if the ship b can not be placed ont he sea 
	 * (outside of the board or some cell is not empty).*/
	 
	 public void addShipHorizontally(Ship shipToplace, Position position){
		 try{
			int i=1;
			this.TotalLifePoints+=shipToplace.getLifePoints();
			int taille=shipToplace.getLength();
			while(taille>0){
					 Cell c=this.getCell(position);
					 if(c.IsEmpty()){
					 c.addShip(shipToplace);
					 taille-=1;
					 Position p=new Position(position.getX()-i,position.getY());
					 position=p;
					 }
					 else{
						 throw new IllegalStateException("place déjà occupée");}
					 }
			 }
		catch (ArrayIndexOutOfBoundsException e){
			throw new IllegalStateException("place inexistance");
			}
		 }
		 
	 }
	
	 
