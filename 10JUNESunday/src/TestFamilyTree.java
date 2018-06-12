public class TestFamilyTree {

    public static void main(String[] args){


        Person p1=new Person("x 's grandfather");
        Person p2=new Person("x's father");
        Person p3=new Person("x");
        Person p4=new Person("x's son");

        p1.setSon(p2);
        p2.setFather(p1);
        p2.setSon(p3);
        p3.setSon(p4);


        //p3.printFamily();


        p1.printFamily();







    }




}
