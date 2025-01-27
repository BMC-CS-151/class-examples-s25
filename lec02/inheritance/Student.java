class Student {
  private String name;
  private int id;

  public Student(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public Student() {}

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public String toString() {
    return name+" "+id;
  }

  //main
  //Student s = new Student("eliz", 100);
  //System.outprintln(s); //calls toString
}

