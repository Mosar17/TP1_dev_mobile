package sn.shop.shopbi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity //Creation pour avoir un bean pour pouvoir le stocker dans la base
@Table(name="produit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProduitEntity {
  @Id //pour specifier une cle primaire
  @Column(name="reference",length = 10)
  private String ref;
  @Column(name="nom",length = 150,nullable = false)
  private String nom;
  @Column(name="quantite_stock")
  private double qtStock;
}
