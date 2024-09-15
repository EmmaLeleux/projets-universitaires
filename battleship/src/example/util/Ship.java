package example.util;



/**
 *  In this version we are going to create a class of ships.
 * 
 * @author BENFYALA Marwa & LELEUX Emma 
 * @version 1.0
 */
 
 public class Ship{
	 
	 /** Les attributs privés représentant un bateau*/
	 private int LifePoints;
	 private final int length;
	 
	 /**Methodes & Constructeur*/
	 
	 /**
     * creates a ship with given length.
     * @param length: the length of the created ship. */
    
    public Ship(int length){
        this.length = length;
        this.LifePoints=length;
    }
    
    /**
     * gives the ship's life points.
     * @return an integer wich represents the ship's life points.
     */
     
     public int getLifePoints(){
		 return this.LifePoints;
		 }
	
	/**
	 * gives the length of the created ship.
	 * @return an integer which represents the ship's length
	 */
	 
	 public int getLength(){
		 return this.length;
		 }
	
	/**
	 * hites the created ship, and decreases the life points.
	 * @return an integer which represents the ship's life points.
	 */
	 
	 public void hit(){
		 this.LifePoints-=1;
		 }
	
	/**
	 * tels us if the created ship is sunked or not.So it returns true if that is the case and false otherwise.
	 * @return a boolean, true if the created ship was sunked and false otherwise.
	 */
	 
	 public boolean IsSunked(){
		 boolean sunk=false;
		 if(this.getLifePoints()==0){
			 return true;
			 }
		return sunk;
		 }
	
	 }

