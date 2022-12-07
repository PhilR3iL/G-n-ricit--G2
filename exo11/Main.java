package exo11;

public class Main {
  public static void petitMain() {
    Triplet<String> canards = new Triplet<>("riri", "fifi", "loulou");
    canards.afficher();
  TripletHeterogene<String, String, Integer> philr = new TripletHeterogene<>("Philippe", "ROUSSILLE", 33);
    System.out.println(philr);
      }
}