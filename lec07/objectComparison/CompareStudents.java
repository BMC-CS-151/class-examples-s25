import java.util.Arrays;
class CompareStudents {

  public static void main(String[] args) {

    //TODO 1: which ones of these are equal?
    Student s1 = new Student("Elizabeth", 3.5, "Sage");
    Student s2 = new Student("Cinnabon", 4.0, "Cary");
    Student s3 = new Student("Elizabeth", 4.0, "Sage");
    Student s4 = new Student("Frances", 2.0, "Sage");
    Student s5 = new Student("Elizabeth", 4.0, "Sage");
    Student s6 = s1;

    //TODO 2: What wil this print?
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s5 == s3);
    System.out.println(s6 == s1);

    //TODO 4: Let's compare students by GPA
    
    Student[] students = new Student[5];
    students[0] = s1;
    students[1] = s2; 
    students[2] = s3;
    students[3] = s4;
    students[4] = s5;

    Arrays.sort(students);

    //Student[] students = {s1, s2, s3, s4, s5};

    for (int i=0; i<students.length; i++) {
        System.out.println(students[i]);
    }




  }

}
