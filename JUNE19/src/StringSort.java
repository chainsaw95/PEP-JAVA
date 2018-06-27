import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringSort {

    public static void main(String[] args){


    String[] s1={"abc","xyd","hello","baseball"};
    String[] s2=s1;

    for(int i=0;i<s1.length;i++){
        for(int j=i;j<s1.length-1;j++) {

            if (s1[j].compareTo(s1[j + 1]) > 0) {
                String temp = s1[j];
                s1[j] = s1[j + 1];
                s1[j + 1] = temp;

            }
        }

    }




    for(int i=0;i<s1.length;i++){

        System.out.println(s1[i]);
    }


        Arrays.sort(s2);

        for(int i=0;i<s1.length;i++){

            System.out.println(s1[i]);

        }


    }


}
