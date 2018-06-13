class Person {

    Name name;
    Address add;

    public Person(String fnm, String mdn, String lsn, String bld, String strt, String city, int pin) {
        name = new Name(fnm, mdn, lsn);
        add = new Address(bld, strt, city, pin);
    }

    class Address {

        String building, street, city;
        int pincode;

        public Address(String building, String street, String city, int pincode) {
            this.building = building;
            this.street = street;
            this.city = city;
            this.pincode = pincode;
        }


        @Override
        public String toString() {
            return "Address{" +
                    "building='" + building + '\'' +
                    ", street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", pincode=" + pincode +
                    '}';
        }
    }


    class Name {


        String fname, mname, lname;

        public Name(String fname, String mname, String lname) {
            this.fname = fname;
            this.mname = mname;
            this.lname = lname;
        }


        @Override
        public String toString() {
            return "Name{" +
                    "fname='" + fname + '\'' +
                    ", mname='" + mname + '\'' +
                    ", lname='" + lname + '\'' +
                    '}';
        }
    }


    @Override
    public String toString() {
        return name.toString() + add.toString();
    }

}


public class TestInnerCLass {

    public static void main(String[] args) {


        Person p1 = new Person("Vivek","Singh","Rajput","BH2","Block 48","Phagwara",421001);

        System.out.println(p1);

    }

}
