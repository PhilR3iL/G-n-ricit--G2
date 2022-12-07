package exo31;

public static class Exo1{

  public static <T> T alea(T[] tableau){
    return tableau[(int)(Math.random() * (tableau.length - 1))];
  }
  
}