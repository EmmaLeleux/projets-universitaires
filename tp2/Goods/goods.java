/*
author: Emma Leleux & Romain Le Guen
 */


public class goods{
	private double value;
	private String name;


/*Question 3: le paramètre est de type String*/	
	
	/**
	 * constructeur de goods prenant en compte 1 paramètre
	 * @param nom de type String qui correspond à la valeur d'initialisation de l'attribut name
	 */
	public goods(String nom){
		this.name=nom;
		this.value=0;}
		
		
/*Question 4: le premier paramètre est de type String, le second est de type double*/

	/**
	 * constructeur de goods prenant en compte 2 paramètres
	 * @param nom de type String qui correspond à la valeur d'initialisation de l'attribut name
	 * @param nombre de type double qui correspond à la valeur d'initialisation de l'attribut value
	 */
	public goods(String nom, double nombre){
		this.name=nom;
		this.value=nombre;}
		
	/** fonction getValue permet de retourner la valeur de value*/
	public double getValue(){
		return this.value;}
		
	/**fonction setValue, permet de modifier la valeur de value
	 * @param nb de type double, correspond à la nouvelle valeur à affecter à value*/
	public void setValue(double nb){
		this.value=nb;}
		
	/** fonction getName permet de retourner la valeur de name*/
	public String getName(){
		return this.name;}
		
	/** fonction ToString permet de retourner une chaine de caractère dont la valeur est "the goods name costs value" avec name et value remplacés
	 * par les valeur de leurs attributs respectifs
	 * */
	public String toString(){
		return String.format("the goods %s costs %f", getName(), getValue());}
		
	/** fonction taxeInclus permet de renvoyer la valeur TTC de la marchandise avec une TVA à 20%
	 */
	 public double taxeInclus(){
		 double sansTaxe= getValue();
		 double avecTaxe=sansTaxe+((20*sansTaxe)/100);
		 return avecTaxe;}
		 
		
		
}
		
	
		