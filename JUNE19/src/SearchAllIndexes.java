import java.util.ArrayList;

public class SearchAllIndexes {

    public static void main(String[] args){


        StringBuilder line=new StringBuilder("this a first and or second and finish");
        String word="and";

        ArrayList<Integer> i=new ArrayList<>();


        while(line.length()>word.length()){

            i.add(line.indexOf(word));
            line.substring(line.indexOf(word)+1,line.length());

        }


        System.out.print(i);

    }


}
