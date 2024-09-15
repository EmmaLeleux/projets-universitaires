/**author: Emma Leleux et Romain Le Guen*/

public class Switch{

    private Lightbulb ampoule;
    
    /**
     * le constructeur de la class Switch, permet de définir l'ampoule associée à l'interrupteur
     */
    public Switch(Lightbulb light){
        this.ampoule=light;}
    
        
    /**
     * La méthode putSwitch permet de changer l'état de l'ampoule en appuyant sur l'interrrupteur
     */
    public void putSwitch(){
        ampoule.setOn();}
        

}