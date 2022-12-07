package exo31;

public class Exo1{

  public static <T> T alea(T[] tableau){
    return tableau[(int)(Math.random() * (tableau.length - 1))];
  }

  public static <T> T alea(T un, T deux){
    return Math.random() > 0.5? un: deux;
  }

  
}