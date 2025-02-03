public class A {
  private String name;
  private B myAccount;

  public class B {
    private int accountNum;
    private int totalFunds;
    private int routingNum;
  }

  public static void main(String[] args) {
    /* 
     * An instance of the inner class cannot be created 
     * without an instance of the outer class 
     */
    A a = new A();
    B b = a.new B();

    //Is this ok?
    B b2 = new B();
  }
}
