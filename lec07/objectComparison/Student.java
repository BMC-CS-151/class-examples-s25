class Student  implements Comparable {
  private String name;
  private double gpa;
  private String dorm;

  public Student(String name, double gpa, String dorm) {
    this.name = name;
    this.gpa = gpa;
    this.dorm = dorm;
  }

  public Student() {}

  public String getName() {
    return name;
  }

  public double getGpa() {
    return gpa;
  }

  public String getDorm() {
    return dorm;
  }

  public String toString() {
    return name + " " + gpa + " " + dorm;
  }

  public boolean equals(Student other) {
    return this.name.equals(other.getName()) && this.gpa == other.getGpa() 
            && this.dorm.equals(other.getDorm());
  }

  public int compareTo(Object o) {
      Student s = (Student) o;
      //this == s
      if (this.gpa == s.getGpa()) {
            return 0;
      //case 2: current gpa is less than input gpa
      } else if (this.gpa < s.getGpa()) {
            return 1;
      } else {
            return -1;
      }

  }
}
