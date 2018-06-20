public class Pattern {

    public static void main(String[] args){


        String hello="hello";


        for(int i=0;i<=hello.length();i++){

            System.out.println(hello.substring(0,i));

        }

        for(int i=hello.length()-1;i>0;i--){

            System.out.println(hello.substring(0,i));


        }



    }



}
