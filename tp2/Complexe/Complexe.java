/**author: Emma Leleux et Romain Le Guen*/

public class Complexe
{
    // LES ATTRIBUTS = definition de l'etat de la classe
    
    /**
     * pour la partie réelle du nombre complexe
     */
    private double re;
    /**
     * pour la partie imaginaire du nombre complexe
     */
    private double im;
    
    // LES CONSTRUCTEURS:

    /**
     * Constructeur d'objets de classe Complexe:
     * Construit un objet de cette classe à partir de sa 
     * partie réelle et sa partie imaginaire.
     */
    public Complexe()
    {
        this.re=re;
        this.im=im;
    }
    /**
     * construit un nombre réelle dont la partie 
     * imaginaire est nulle.
     */
    public Complexe(double re, double im)
    {
        this.re=re;
        this.im=0;
    }
    
    //LES METHODES:
    /**
     * Méthode pour récuperer la partie imaginaire 
     * d'un nombre complexe.
     */
    public double getIm()
    {
        return this.im;
    }
    /**
     * Méthode pour récuperer la partie réelle d'un nombre
     * complexe.
     */
    public double getRe()
    {
        return this.re;
    }
    /**
     * Méthode calculant la somme de deux
     * nombres complexes.
     * @return: un Complexe dont la partie réelle est "x"
     * et la partie imaginaire "y".
     */
    public Complexe add(Complexe z)
    {
        double x=this.re+z.getRe();
        double y=this.im+z.getIm();
        return new Complexe(x,y);
    }
    /**
     * Méthode calculant le module dd'un nombre complexe.
     * @return: un (double) le module du nombre complexe.
     */
    public double modulus()
    {
        return java.lang.Math.sqrt(this.re*this.re+this.im*this.im);
    }
    /**
     * Méthode d'affichage en mode "str" d'un nombre 
     * complexe.
     * @return: une chaine (String).
     */
    public String toString()
    {
        return this.re+"i"+this.im;
    }
    /**
     * Méthode déterminant si deux nombres complexes 
     * sont égaux.
     * @return: 0 si les deux complexes sont égaux,
     * et autre nombre dans le cas contraire.
     */
    public boolean equals(Complexe c1, Complexe c2)
    {
        return (java.lang.Math.abs(c1.re-c2.re))==0 && (Math.abs(c1.im-c2.re))==0;
    }
    
}
