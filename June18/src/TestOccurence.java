import java.util.HashMap;

public class TestOccurence {

    public static void main(String args[]){

        HashMap<Character,Integer> hash1=new HashMap<>();

        String str="this is a java string";

        for(int i=0;i<str.length();i++){

            int count=0;
            for(int j=0;j<str.length();j++){

                if(str.charAt(i)==str.charAt(j)) {

                    count++;

                }

                hash1.put(str.charAt(i),count);
            }

        }


        System.out.println(hash1);


        for(char key:hash1.keySet()){

            System.out.println(hash1.get(key)+":"+key);
        }


    }



}
