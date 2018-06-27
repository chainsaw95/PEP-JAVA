import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);


        while(true){

            System.out.println("Enter regex pattern");
            Pattern pattern=Pattern.compile(sc.nextLine());

            System.out.println("Enter text");
            Matcher matcher=pattern.matcher(sc.nextLine());

            boolean found=false;

            while(matcher.find()){

                System.out.println("i found text "+matcher.group()+"Starting at index"+matcher.start()+"ending at "+matcher.end());
pan 1 is NSGSH4563T AND PAN2 IS MNHUY6785MM
                found=true;
            }


            String replaceall=matcher.replaceAll("c++");
            System.out.println(replaceall);

            if(!found){
                System.out.println("No match found");
            }


        }

    }

}
