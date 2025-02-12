public class Memory2 {
   
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

        public void birthday() {
            age += 1;
        }
   } 

   public static void main(String[] args) {
        int x = 28;

        Student c = new Student("Cinna", 4);
        Student e = new Student("Eliz", x);

        c.setBff(e);
        e.setBff(c);

        c.bff.bff.birthday();

        Student x = new Student("Dianna", 35);
        c.bff.setBff(x);

        x.setBff(c);

        c.bff.bff.bff.birthday();
        c.bff.bff.bff.bff.setBff(x);
   }
}
