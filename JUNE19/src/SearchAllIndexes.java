import java.util.ArrayList;

public class SearchAllIndexes {

    public static void main(String[] args){


        String line="this a line and the other and and this and";
        String word="and";

        ArrayList<Integer> i=new ArrayList<>();


        while(line.length()>word.length()){

            i.add(line.indexOf(word));
            line=line.substring(line.indexOf(word)+1,line.length());


        }


        System.out.print(i);






    }


}
