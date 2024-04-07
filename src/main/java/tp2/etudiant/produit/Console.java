package tp2.etudiant.produit;

import tp2.application.AbstractProduit;
import tp2.echange.Descriptible;

import java.security.PrivateKey;
import java.time.LocalDateTime;

public class Console extends Electronic implements Descriptible  {
    private int nombreManettes;


    public Console(String nom, int prix, String couleur,int nombreManettes) {
        super(nom);
        this.prix = prix;
        this.couleur = couleur;
        this.nombreManettes = nombreManettes;

    }

    public int getNombreManettes() {
        return nombreManettes;
    }

    @Override
    public String decrit() {
        return "Console - "+getNom()+ " - Prix - "+getPrix()+ " - Couleur - "+getCouleur()+" - Nombre de manette - "+getNombreManettes()+" - Date - "+getDate();
    }


    @Override
    public int getNumeroCategorie() {
        return 0;
    }
}
