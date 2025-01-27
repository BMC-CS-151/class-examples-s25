class CSStudent extends Student { //extends keyword
    //new field
    private String username;

    //New constructor
    public CSStudent(String name, int id, String username) {
        super(name, id); //call the parent constructor
        //new field
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String toString() {
        return getName() +  " " + getId( )+ " " + username;
    }

    public static void main(String[] args) {
        CSStudent s1 = new CSStudent("eliz", 6, "edinella");
        System.out.println(s1);

        //Which toString will be called?
        Student s2 = new Student("Cinnabon", 1);
        System.out.println(s2);

        Student s3 = new CSStudent("Hannah", 50101, "hchow");
        System.out.println(s3); 
    }

}
