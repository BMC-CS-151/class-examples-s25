class CSStudent_bad {
  private String name;
  private int id;

  //new field
  private String username;

  //Changed constructor name and signature
  public CSStudent_bad(String name, int id, String username) {
    this.name = name;
    this.id = id;
    //new field
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public String toString() {
    return name;
  }
}

