public class Memory {
   
   public class Student {
        String name;
        int age;
        Student bff;

        public Student(String n, int a) {
            name = n;
            age = a;
        }

        public void setBff(Student s) {
            bff = s;
        }
   } 

   public static void main(String[] args) {
        int x = 28;

        Student c = new Student("Cinna", 4);
        Student e = new Student("Eliz", x);

        c.setBff(e);

        System.out.println("My bff is: " + e.getBff().name);
   }
}
