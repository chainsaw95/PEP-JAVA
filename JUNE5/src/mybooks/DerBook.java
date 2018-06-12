package mybooks;

public class DerBook extends PBook {

    public void fun(){

        // in derived class
      //  System.out.println(first);   //private
        System.out.println(second);  //default
        System.out.println(third);   // public
        System.out.println(four);    // protected


    }


}

