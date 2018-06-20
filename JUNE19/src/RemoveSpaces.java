import java.util.*;

public class RemoveSpaces {

    public static void main(String[] args){


        String s1="   without asdu asd  asd    asdsd   asd";

        String s2=removeSpaces(s1);

        System.out.print(s2);

    }

    public static String removeSpacesWithR(String s1){

        String withoutspace=(s1.replaceAll("[ ]{2,}"," ")).trim();
        return withoutspace;
    }


    public static String removeSpaces(String s1){


        StringBuffer str=new StringBuffer("");

        int state=1; // in space state
        int i=0;


        while(i<s1.length()){

            int flag=0;

            if(s1.charAt(i)==' ')
                flag=1;

            switch (flag){

                case 1:
                    // is a space
                    if(state==0) {
                        str=str.append(s1.charAt(i));
                        i++;
                    }
                    state=1;
                    i++;
                    continue;

                case 0:
                    // anything other than a space
                    state=0;
                      str=str.append(s1.charAt(i));
                    i++;
                    break;
            }

        }

        return str.toString();
    }



}
