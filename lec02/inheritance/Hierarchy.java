public class Hierarchy {
    static class A {}
  static class B extends A {}
  static class C extends B {};

  public static void main(String[] args) {
    A a1 = new B();
    B b1 = new A(); //not allowed
    A a2 = new C();
    B b2 = new C();
    C c1 = new B();
    C c2 = new A();
  }
}
