public class SimplePerson {

    private String name;
    //Notice this - Address Type!
    /*
    private String state;
    private String ....
    */
    private Address address;

    public Person(String name, String street, String city, String state) {
        this.name = name;
        this.address = new Address(street, city, state);
    }

    //we can access private member variables of the inner class
    public String getState() {
        return this.address.state;
    }

    private class Address { 

        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

}
