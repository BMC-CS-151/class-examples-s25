public class Compare {
  public static void main(String[] args) {
    int a = 5;
    int b = 5;

    String s = new String("hello");
    String s2 = new String("hello");
    String s3 = new String("animal");


    //TODO 0: What will these print and why?
    System.out.println(a == b);
    System.out.println(s == s2);

    //TODO 1: How do we fix it to work as expected?
    System.out.println(s.equals(s2));

  }
}
