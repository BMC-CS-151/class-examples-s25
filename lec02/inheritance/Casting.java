public class Casting {
  static class A {}
  static class B extends A {}
  static class C extends B {};

  public static void main(String[] args) {
    
    //primitive casting
    int x = 7;
    double y = 1.2;

    x = (int) y;

    A a1 = new A();
    B b1 = new B();
    C c1 = new C();
    A a2 = new C();

    //Are these ok?
    A a3 = (A) b1;
    B b2 = (B) a1; //not allowed (downcasting)
    B b3 = (B) c1;
    A a4 = (A) c1;
    C c2 = (C) a2;

    if (a2 instanceof C ) {
        //cast safely 
    }
  }
}
