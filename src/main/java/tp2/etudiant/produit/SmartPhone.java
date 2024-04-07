package tp2.etudiant.produit;

import tp2.echange.Descriptible;
public class SmartPhone extends Telephone  implements Descriptible{
    private double tailleEcran;
    public SmartPhone(String nom, String fabricant, double prix, String marque, String systemeExp,double tailleEcran) {
        super(nom, fabricant, prix, marque, systemeExp);
        this.tailleEcran=tailleEcran;
    }
    public double getTailleEcran() {
        return tailleEcran;
    }
    @Override
    public int getNumSerie() {
        return super.getNumSerie();
    }

    @Override
    public String decrit() {
         return "Smartphone - "+getNom()+ " - NumeroSerie - "+getNumSerie()+ " - Categorie - "+getNumeroCategorie()+ "- Date - "+getDate();
    }

}
