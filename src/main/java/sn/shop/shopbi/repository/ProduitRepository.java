package sn.shop.shopbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.shop.shopbi.entity.ProduitEntity;

import java.util.Optional;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity,String>{
  @Query("select p from ProduitEntity p where p.ref = ?1 and p.nom= ?2")//permet de rediger le script jpql corespondant
  public Optional<ProduitEntity> findByReferenceAndNom(String reference, String nom);
  //on manipule la table etudiant grace a ProduitEntity

  //trouver un etudiant a travers son matricule
  public Optional<ProduitEntity> findByRef(String ref);//permet d eviter un objet nul

  //trouver un produit a travers son nom
  //public List<ProduitEntity> findBynom(String nom);//List parce que ca peut ne pas retournerrr qu un seul objet

}
