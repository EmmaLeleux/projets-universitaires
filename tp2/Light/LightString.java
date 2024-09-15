/**author: Emma Leleux et Romain Le Guen*/

public class LightString{
 
    
    private int nbAmpoule;
    private boolean on;
    private Lightbulb ampoules[];
    
    public LightString(int nb){
        this.nbAmpoule=nb;
        for (int i=0;i<nb;i++){
            this.ampoules[i]=(new Lightbulb(1,"white"));}}
            
    /**
     * La méthode getUneAmpoule permet d'obtenir une ampoule de la guirlande selon son numéro
     * @return une ampoule de type Lightbulb
     */
    public Lightbulb getUneAmpoule(int numero){
        if (numero>=0 && numero<nbAmpoule){
        return this.ampoules[numero];}
        else{
            return null;}}
            
    
}