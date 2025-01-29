public class Generics {

  public void print(int x) {
    System.out.println(x);
  }

  public void print(double x) {
    System.out.println(x);
  }

  public void print(Student x) {
    System.out.println(x);
  }


  //we could overload print for every possible type ....

  //OR USE GENERICS
  public <T> void print(T x) {
    System.out.println(x);
  }


  public static void main(String[] args) {
    Generics g = new Generics();
    g.print(100);
    g.print(15.5);
    g.print(new Student("Elizabeth", 15));
  }

}
