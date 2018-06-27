import java.util.Scanner;

class ShortPwdException extends Exception{

    public ShortPwdException(String message) {
        super(message);
    }




}

public class shortPasswordException {

    public static void main(String[] args)throws ShortPwdException{


        Scanner sc=new Scanner(System.in);
        String user,pwd;

        System.out.println("Enter the name");
        user=sc.next();

        System.out.println("Enter the password");
        pwd=sc.next();

        if(pwd.length()<6){

            ShortPwdException i1=new ShortPwdException("Your password is too small");
            throw i1;

        }


    }
}
