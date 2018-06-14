import java.util.*;

class Data {


    int id;
    String name;

    public Data(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        Data d = (Data) obj;
        if (id == d.id)
            return true;
        else
            return false;
    }
}


public class ObjectQeuals {

    public static void main(String[] args) {


        List<Data> l1 = new ArrayList<Data>(15);

        l1.add(new Data(121, "Vivek"));
        l1.add(new Data(122, "Singh"));
        l1.add(new Data(123, "Rajput"));


        System.out.println(l1);

        if (l1.contains(new Data(121, "Vivek")))
            System.out.println("Vivek Present");


    }


}
