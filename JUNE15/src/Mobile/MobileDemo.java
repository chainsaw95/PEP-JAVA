package Mobile;

import java.util.Arrays;
import java.util.Comparator;

class Mobile implements Comparable<Mobile>{

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
        return 0;
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


public class MobileDemo {

    public static void main(String args[]){

        Mobile m1=new Mobile(1200,6.5,1600);
        Mobile m2=new Mobile(6500,4.5,3847);
        Mobile m3=new Mobile(8000,5.9,4566);


        Mobile[] mymobiles=new Mobile[3];

        mymobiles[0]=m1;
        mymobiles[1]=m2;
        mymobiles[2]=m3;


        System.out.println("Sorting by Price");
        Arrays.sort(mymobiles);

        for (Object o:mymobiles) {
            System.out.println(o);

        }


        System.out.println("Sorting by Size");
        CompareScreen c1=new CompareScreen();

        Arrays.sort(mymobiles,c1);

        for (Object o:mymobiles) {
            System.out.println(o);

        }


        System.out.println("Sorting by Resolution");
        CompareResolution c3=new CompareResolution();
        Arrays.sort(mymobiles,c3);

        for (Object o:mymobiles) {
            System.out.println(o);

        }



    }



}
