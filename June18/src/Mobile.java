import java.util.Arrays;
import java.util.Comparator;

public class Mobile implements Comparable<Mobile>{

    private int price;
    private double screensize;
    private double resolution;


    public Mobile(int price, double screensize, double resolution) {
        this.price = price;
        this.screensize = screensize;
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getScreensize() {
        return screensize;
    }

    public void setScreensize(double screensize) {
        this.screensize = screensize;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }


    @Override
    public int compareTo(Mobile o) {
       return this.price-o.price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "price=" + price +
                ", screensize=" + screensize +
                ", resolution=" + resolution +
                '}';
    }
}


class CompareScreen implements Comparator<Mobile>{


    @Override
    public int compare(Mobile o1, Mobile o2) {
        return (int )(o1.getScreensize()-o2.getScreensize());
    }
}


class CompareResolution implements Comparator<Mobile>{


    @Override
    public int compare(Mobile o1, Mobile o2) {
        return (int)(o1.getResolution()-o2.getResolution());
    }
}


