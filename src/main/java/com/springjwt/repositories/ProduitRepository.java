package com.springjwt.repositories;

import com.springjwt.entities.LigneCommande;
import com.springjwt.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
