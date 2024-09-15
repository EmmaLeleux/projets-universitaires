package example;
import example.util.*;

/**
 * Vous trouverez ci dessous l'implementation de la classe Date avec toutes les methodes 
 * ainsi que condtructeurs manipulants des dates (jour,mois et année).
 * @author  LELEUX Emma & Le Guen Romain .
 */
 
 public class Date {
	 
	 private int jour;
	 private Month mois;
	 private int annee;
	 

 /**
 * Methodes et constructeurs de la classe Date:*/
  /**
  * 1/Constructeur de Date:
	* Create the Date à partir from the day , month and the year passed as parameters.
	* @param d: an integer which represents the day.
	* @param m: an integer which represents the month.
	* @param y: an integer which represents the year.
  */
  public Date(int d, Month m, int y){
	  this.jour=d;
	  this.mois=m;
	  this.annee=y;
	  }


 /**
 * 3/Methode renvoyant la date du lendemain:
	* @return the date of the following day, taking into consideration today's date.*/
 
 public Date tomorrow(){
	 if (this.jour==this.mois.getNbDays(this.annee)){
		 if(this.mois == Month.december){
			 return new Date(1,this.mois.next(),this.annee+1);
			 }
			 else{
				 return new Date(1,this.mois.next(),this.annee);
				 }
		 }
	 else{
		 return new Date(this.jour+1,this.mois,this.annee);
		 }
	 }

 /**
 * 4/isLeapYear returns a boolean:
	* @return True if the year passed as a parameter is a leap year.And False otherwise. 
	* @param year: an integer which represents the year.*/
 
 public static boolean isLeapYear(int year){
	 return (year%4==0 && (year%100!=0) || (year%400==0));
	 }

 /**
 * 5/Methode calculant la date atteinte n jours apres: 
	* @param n: an integer which represents the number of days.
	* @return the date got after n days (n the parameter of the method).
	* @exception IllegalArgumentException if n is negative
 */
 
 public Date nDaysAfter(int n){
	 if(n<0){
		 throw new IllegalArgumentException ("n<0");
		 }
	Date d=new Date (this.jour, this.mois, this.annee);
	for(int i=0;i<n;i++){
		d=d.tomorrow();
		}
	return d;
	 }

/**
 * 6/ méthode renvoyant la date la plus petite des deux entrées en paramètres
 * @param d2: a Date object
 * @return the most little date
*/
 public Date PlusPetiteDate( Date d2){
	 if (this.annee< d2.annee){
		 return this;}
	 else if (this.annee> d2.annee){
		 return d2;}
	 else {
		 if (this.mois.ordinal()<d2.mois.ordinal()){
			 return this;}
		else if (this.mois.ordinal()>d2.mois.ordinal()){
			return d2;}
		else{
			if (this.jour<d2.jour){
				return this;}
			else{
				return d2;}}}}
 /**
 * 6/Methode calculant la difference en jours entre deux dates:
	* @param d1: a Date.
	* @param d2: a Date.
	* @return an integer which represents the difference in days between d1 and d2.
	*/
	public int DifferenceInDays(Date d2){
		Date d= this;
		int res=0;
		if (this.PlusPetiteDate(d2).equals(this)){
			while (! this.equals(d2)){
				d=this.tomorrow();
				res++;}}
		else{
			while (! this.equals(d2)){
				d=d2.tomorrow();
				res++;}}
		return res;}
		
		
		

 /**
 * 7/ two dates are equal if they have the same day, month and year.
	 * @param o the object to test equality with. 
	 * @return <code>true</code> if o is a date with the same day, month and year of this object.
	 */
	public boolean equals(Object o) {
		if (o instanceof Date) {
			Date other = (Date) o;
			return (this.jour==other.jour && this.mois==other.mois && this.annee==other.annee);
		}
		else {
			return false;
		}
	}

 /**
* @return a string description of this date. 
*/
	public String toString() {
		return "date day: "+this.jour+", month : "+this.mois+", year :"+this.annee;
	}
  
  public static void main(String[] args){
	  Date Noel= new Date(25, Month.december, 2020);
	  System.out.println("le jour de noël est "+Noel);
	  Date lendemain= Noel.tomorrow();
	  System.out.println("le lendemain de noël est"+lendemain);
	  Date anniversaire= new Date(1, Month.september,2022);
	  System.out.println("Il y a au moins un anniversaire le "+anniversaire);
	  Date jour= anniversaire.nDaysAfter(43);
	  System.out.println("43 jours après le "+anniversaire+" nous serons le "+jour);
	 }}


