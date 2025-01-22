import java.io.File;

public class Cast {

  public static void main(String[] args) {
    int x = 5;
    double y = 1.2;

    //TODO: What will happen?
    //x = (int) y;
    y = x;

    //System.out.println(x);
    //System.out.println(y);


    //TODO: What about this?
    String s = "Hello!";
    //File f = (File) s;

    //System.out.println(s);
    //System.out.println(f);

    //TODO: Casting String to Primitives

    String age = "19";
    String height = "71.5";

    int ageNum = Integer.parseInt(age);
    double heightNum = Double.parseDouble(height);

    System.out.println(age);
    System.out.println(ageNum);
    System.out.println();

    System.out.println(height);
    System.out.println(heightNum);
      }
  }

