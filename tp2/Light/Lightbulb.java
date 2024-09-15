/**author: Leleux Emma et Le Guen Romain*/

public class Lightbulb{
    
    private int power;
    private String couleur;
    private boolean on;
    
    public Lightbulb(int watt, String color){
        this.power=watt;
        this.couleur=color;
        this.on=false;}
    
    /**
     * La méthode getPower permet d'obtenir la puissance de l'ampoule (en Watt)
     * @return un int correspondant à la puissance de l'ampoule
     */
    public int getPower(){
        return this.power;}
        
        
    /**
     * La méthode getCouleur permet d'obtenir la couleur de l'ampoule
     * @return la couleur de l'ampoule
     */  
    public String getCouleur(){
        return this.couleur;}
        
        
    /**
     * La méthode getOn permet de savoir si l'ampoule est allumée ou éteinte
     * @return un boolean valant true si l'ampoule est allumée, false sinon
     */
    public boolean getOn(){
        return this.on;}
        
    /**
     * La méthode setOn permet de modifier la valeur de on, changeant ainsi l'état de l'ampoule de allumée à éteinte ou inversement
     */
    public void setOn(){
        this.on=!this.on;}
    
      /**
       * La méthode toString permet de renvoyer une phrase décrivant l'ampoule
       * @return un String décrivant l'ampoule
       */
        public String toString(){
            String etat="";
            if (getOn()){
                etat="allumée";}
            else{
                etat="éteinte";}
            return String.format("l'ampoule est de couleur %s, à une puissance de %d Watt et est %s",getCouleur(),getPower(),etat);
        }    


    }
