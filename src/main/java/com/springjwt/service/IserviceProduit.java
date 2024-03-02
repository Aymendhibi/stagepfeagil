package com.springjwt.service;

import com.springjwt.entities.Equipement;
import com.springjwt.entities.Produit;

import java.util.List;

public interface IserviceProduit {
    Produit ajouterProduit(Produit produit);
    Produit modifierProduit(Produit produit );

    public Produit supprimerProduit(Long produitId);
    public List<Produit> afficher();

}
