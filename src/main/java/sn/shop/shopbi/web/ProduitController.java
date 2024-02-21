package sn.shop.shopbi.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.shop.shopbi.repository.ProduitRepository;
import sn.shop.shopbi.entity.ProduitEntity;
import sn.shop.shopbi.service.ProduitService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produits")
@AllArgsConstructor
public class ProduitController {
  private ProduitService produitService;
  //creation
  @PostMapping
  public ProduitEntity save(ProduitEntity produitEntity){
    return produitService.save(produitEntity);
  }
  //lister
  @GetMapping
  public List<ProduitEntity> all(){
    return produitService.getAll().get();
  }
  //suppression
  @DeleteMapping
  public void delete(String ref){
    produitService.delete(ref);
  }
  //modification
  @PutMapping
  public ProduitEntity update(String ref, ProduitEntity produitEntity){
    return produitService.update(ref,produitEntity);
  }
  //recherche
  @GetMapping("/ref")
  public Optional<ProduitEntity> get(String ref){
    return produitService.get(ref);
  }
}
