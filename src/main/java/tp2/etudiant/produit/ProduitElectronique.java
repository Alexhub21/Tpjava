package tp2.etudiant.produit;

import tp2.application.AbstractProduit;

public  abstract class ProduitElectronique extends AbstractProduit {
    private String fabricant;
    private double prix;
    public ProduitElectronique(String nom, String fabricant,double prix) {
        super(nom);
        this.fabricant = fabricant;
        this.prix = prix;
    }

    public String getFabricant() {
        return fabricant;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public abstract int getNumeroCategorie();

}
