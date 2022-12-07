package exo11;

public class TripletHeterogene<T, U, V>{
  private T x;
  private U y;
  private V z;

  public TripletHeterogene(T a, U b, V c){
    x = a;
    y = b;
    z = c;
  }

  public T getPremier(){
    return x;
  }
  
  public U getSecond(){
    return y;
  }

  public V getTroisieme(){
    return z;
  }

  @Override
  public String toString(){
    return "<TripletHeterogene (" +x + ","+y+","+z+")>";
  }
}