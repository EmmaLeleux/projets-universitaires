/*
author: Emma Leleux & Romain Le Guen
 */


public class Stock {
		
	private int quantity;
	
	
	/**
	 * La méthode getQuantity permet de consulter le stock.
	 * @return un int correspondant à la valeur de l'attribut quantity
	 */
	public int getQuantity(){
		return this.quantity;
		}
		
	public Stock(){
		this.quantity=0;
		}
		
	/**
	 * La méthode add permet d'ajouter une quantité au stock disponible
	 * @param n un int correspondant à la valeur de la quantité à ajouter à la quantité initiale
	 */
	public void add(int n){
		this.quantity+=n;
		}
	
	/**
	 * La méthode remove permet de retirer une quantité au stock disponible
	 * @param r un int correspondant à la valeur de la quantité à retirer à la quantité initiale
	 * @return la valeur de la quantité retiré
	 */
	 public int remove(int r){
		 if (this.quantity<r){
			 int res=this.quantity;
			 this.quantity=0;
			 return res;
		 }
		 else{
			 this.quantity-=r;
			 return r;}
		 }
		 

	/**
	 * La méthode toString renvoie sous forme de phrase la valeur de quantité disponible.
	 *@return String contenant une phrase comportant la la valeur de quantiy.
	 */ 
	 public String toString(){
		return String.format("The stock's quantity is %d",getQuantity());
		 }
		 
		 
	public Stock(int val){
		this.quantity=val;
		}
}
