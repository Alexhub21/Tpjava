package tp2.etudiant.produit;

import tp2.echange.Descriptible;

public class TelephoneMobile extends Telephone implements Descriptible {
   private String reseau;

    public TelephoneMobile(String nom, String fabricant, double prix, String marque, String systemeExp,String reseau) {
        super(nom, fabricant, prix, marque, systemeExp);
        this.reseau=reseau;
    }

    public String getReseau() {
        return reseau;
    }

    @Override
    public String toString() {
        return "TelephoneMobile{" +
                "reseau='" + reseau + '\'' +
                '}';
    }
}
