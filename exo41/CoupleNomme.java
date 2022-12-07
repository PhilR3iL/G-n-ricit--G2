package exo41;

public class CoupleNomme<T> extends Couple<T>{
  private String nom;
  public CoupleNomme(T premier, T second, String nom){
    super(premier, second)  ;
    this.nom = nom;
  }
  @Override
  public void affiche(){
    System.out.println("nom : " + nom);
    super.affiche();
  }
}