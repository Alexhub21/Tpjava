package tp2.etudiant.produit;

import tp2.application.AbstractProduit;

import java.time.LocalDateTime;

public abstract class Electronic extends AbstractProduit {
    protected double prix;
    protected String couleur;
    protected LocalDateTime date = LocalDateTime.now();

    public Electronic(String nom ) {
        super(nom);

    }

    public double getPrix() {
        return prix;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public LocalDateTime getDate() {
        return date;
    }
}
