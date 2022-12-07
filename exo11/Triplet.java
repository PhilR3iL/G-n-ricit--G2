package exo11;

public class Triplet<T> {
  private T un, deux, trois;

  public Triplet(T un, T deux, T trois) {
    this.un = un;
    this.deux = deux;
    this.trois = trois;
  }

  public T getPremier() {
    return un;
  }

  // Pareil pour getSecond et getTroisieme

  public void afficher() {
    System.out.println("<Triplet (" + un + ", " + deux + ", " + trois + ")>");
  }

}