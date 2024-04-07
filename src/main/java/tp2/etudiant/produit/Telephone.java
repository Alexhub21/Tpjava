package tp2.etudiant.produit;

public class Telephone extends ProduitElectronique  {
    private String marque;
    private String systemeExp;
    public Telephone(String nom, String fabricant, double prix, String marque, String systemeExp) {
        super(nom, fabricant, prix);
        this.marque = marque;
        this.systemeExp = systemeExp;
    }
    public String getMarque() {
        return marque;
    }

    public String getSystemeExp() {
        return systemeExp;
    }

    @Override
    public int getNumeroCategorie() {
        return 0;
    }
    @Override
    public String decrit() {
        return null;
    }
    

}
