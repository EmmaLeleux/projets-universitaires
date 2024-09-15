


public class BikeStation {

    private String name;
    private int capacity;
    private Bike[] velos;

    /**
     * constructeur de BikeStation
     * @param name de type String, le nom de la Station à créer
     * @param capacity de type int, le nombre d'emplacement de la station
     */
	public BikeStation(String name, int capacity) {
	    this.name=name;
	    this.capacity=capacity;
	    this.velos=new Bike[this.capacity];
	}

    /**
     * méthode getName, permet d'obtenir le nom de la station
     * @return de type String, le nom de la station
     */
	public String getName() {
	    return this.name;
	}

    /**
     * méthode getCapacity, permet d'obtenir la capacity maximale de la station
     * @return de type int, la capacity de la station
     */
	public int getCapacity() {
		return this.capacity;
	}

    /**
     * méthode getNumberOfBikes, permet d'obtenir le nombre de vélos présents dans la station
     * @return de type int, le nombre de vélos présents dans la station
     */
	public int getNumberOfBikes() {
		int cmp=0;
	    for(int i=0;i<this.capacity;i++){
			if(this.velos[i]!=null){
				cmp++;}}
		return cmp;
	}

    
    /**
     * méthode firstFreeSlot, permet de connaitre le premier emplacement libre de la station
     * @return de type int, l'indice du premier emplacement de libre, -1 si aucun emplacement n'est libre
     */
	public int firstFreeSlot() {
	    int i=0;
	    boolean libre=false;
	    while (libre==false && this.capacity>i){
			if (this.velos[i]!=null){
			i++;}
			else{
				libre=true;}
			}
		if (libre==true){
			return i;}
		else{
			return -1;}
	}
	
    /**
     * méthode dropBike, permet de déposer un vélo au premier emplacement libre de la station
     * @param bike de type Bike, le vélo à déposer dans la station
     * @return de type boolean, true si le vélo à été déposé, false si il n'y avait pas d'emplacement de libre
     */
	public boolean dropBike(Bike bike) {
	    int res= this.firstFreeSlot();
	    boolean depose=false;
	    if (res!=-1){
			this.velos[res]=bike;
			depose=true;}
		return depose;
	}
	
	
	
    /**
     * méthode takeBike, permet de prendre un vélo de la station à l'emplacement choisi
     * @param i de type int, l'indice de l'emplacement choisi
     * @return le velo choisi si il y avait un vélo à l'emplacement, null si l'emplacement est vide ou n'existe pas
     */
	public Bike takeBike(int i) {
	    if (i>=0 && i<this.capacity && this.velos[i]!=null){
			Bike res= this.velos[i];
			this.velos[i]=null;
			return res;}
		return null;
	}
	
	
}
