public class Types {

  public static void printStudent(Student s) {
      //does something
  }


  public static void main(String[] args) {

    int[] nums = {1, 2, 3}; //ok
    //int[] nums2 = {1, 'f', "hi!"}; //not ok

    //Ok?
    Student[] students = new Student[2];
    students[0] = new Student("eliz", 1);
    students[1] = new CSStudent("cinnabon", 1, "cchow");

    CSStudent css = new CSStudent("cinnabon", 1, "cchow");
    printStudent(css);

    //Ok?
    CSStudent[] csstudents = new CSStudent[2];
    csstudents[0] = new Student("eliz", 1);
    csstudents[1] = new CSStudent("cinnabon", 1, "cchow");

  }

}
