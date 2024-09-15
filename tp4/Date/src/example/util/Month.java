package example.util;
import example.Date;

/**
 * The months of the year.
 * 
 * @author Le Guen Romain & LELEUX Emma.
 *
 */

 
public enum Month {
	january(31),february(28),march(31),april(30),may(31),june(30),july(31),august(31),september(30),october(31),november(30),december(31);

private final int nbDays;

/**
 * Constructeurs et Methodes de la classe enum Month:*/
 
 /**
  * Associe le nombre de jours "nb" dans un mois ainsi:*/
 
 private Month (int nb){
	 this.nbDays=nb;
	 }


/**
 * 1/Methode renvoyant le mois prochain:
 * return the following month.*/
 
 public Month next(){
	 int numNext=(this.ordinal()+1)%Month.values().length;
	 return Month.values()[numNext];
	 }


 /**
 *2/Methode renvoyant le nombre de jours:
	* @return the number of days.
	* @param year: an integer which represents the year.*/
 
 public int getNbDays(int year){
	 if(this == Month.february && Date.isLeapYear(year)){
		 return 29;
		 }
	else{
		return this.nbDays;
		}
	 }
	 
}

