/**
 * @author Leleux Emma & Le Guen Romain
 */


public class BikeStationMain {
	
	public static void main (String[] args) {
		BikeStation station = new BikeStation("Timoleon",10);
		station.dropBike(new Bike("b001", BikeModel.CLASSICAL));
		station.dropBike(new Bike("b002", BikeModel.ELECTRIC));
		if (args.length>0){
		Bike i=station.takeBike(Integer.parseInt(args[0]));
		if(i==null){
			System.out.print("il n'y a pas de vélo à cet emplacement\n");}
		else{
			System.out.print("le vélo choisi est le "+i.getId()+" et son prix de location et de "+i.getPrice()+"\n");}
		}
		else{
			System.out.print("il manque un argument\n");}
			
	}
}

