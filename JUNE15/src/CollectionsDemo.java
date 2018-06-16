import Model.City;
import Model.CityTempComparator;

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args){



        City city1=new City("Jalandhar",34.5);
        City city2=new City("Chandigarh",38.5);
        City city3=new City("Ambala",35);


        List<String> list1=new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");

        System.out.print(list1);

        int[] ar={2,3,6,5,4,6,2,4};

        Arrays.sort(ar);

        for (int i:ar) {
            System.out.println(ar[i]);
        }


        City[] cities=new City[3];
        cities[0]=city1;
        cities[1]=city2;
        cities[2]=city3;

       // Arrays.sort(cities);
        CityTempComparator comp=new CityTempComparator();

        Arrays.sort(cities,comp);
        for (Object op:cities) {
            System.out.println(op);
        }


    }

}
