public class Driver {
  
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(4, 6);

    System.out.printf("Area of %s: %f", circle.getName(), circle.getArea());
    System.out.printf("Area of %s: %f", rectangle.getName(), rectangle.getArea());

  }

}
