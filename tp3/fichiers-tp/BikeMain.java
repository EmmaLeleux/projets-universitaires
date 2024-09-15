/**
 * @author Leleux Emma & Le Guen Romain
 */

public class BikeMain {
	
	public static void main () {
		Bike velo1 = new Bike("b001", BikeModel.CLASSICAL);
		Bike velo2= new Bike("b002", BikeModel.ELECTRIC);
		if(velo1.equals(velo2)){
			System.out.print("les vélos sont les mêmes");}
		else{
			System.out.print("les vélos sont différents");}
		velo1.toString();
	}
}

