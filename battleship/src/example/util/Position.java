/**
 *  In this version we are going to create a class for the position of a cell (the position represents the coordinates of the cell).
 * @author BENFYALA Marwa & LELEUX Emma 
 */

package example.util;

public class Position{
	
	/** Les attributs de la classe Position:*/
	private int x;
	private int y;
	
	
	/**
	  * creates a new position for a given coordinates.*/
	public Position(int x,int y){
		this.x=x;
		this.y=y;}
		
	/**
	 *gives us the absciss of the cell
	 * @return an integer which represents the absciss of the cell. */
	public int getX(){
		return this.x;}
	
	/**
	 * gives us the ordinate of the cell
	 * @return an integer which represents the ordinate of the cell. */
	public int getY(){
		return this.y;}
	
	
	/**
	 * tells us if two cells has the same position (the same cells)
	 * @param o (an Object) which is an instance of the class Position
	 * @return a boolean true if the two positions are equal and false otherwise.*/
	public boolean equals( Object o){
		if (o instanceof Position) {
			Position other = (Position) o;
			return (other.getX()==this.x && other.getY()==this.y);}
		else{
			return false;}}
	/**
	 *@return a string format to gives us both of the absciss and the ordinate of a cell.  */
	public String toString(){
		return "Position du bateau: x: "+this.x+" y: "+this.y;}
	
	}
