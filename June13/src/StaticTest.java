/*

    static block is like a constructor for static members


 */


import java.util.Scanner;

class Box{




    private int len,wid;
    int id;
    private static int count=0;

    static {

        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();

    }



    public Box(int len, int wid) {
        this.len = len;
        this.wid = wid;
        count++;

    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Box.count = count;
    }

    @Override
    public String toString() {
        return "Length: "+len+" width: "+wid+" id: "+count;
    }
}



public class StaticTest {


    public static void main(String[] args){


        Box b1=new Box(1,2);
        System.out.println(b1);

        Box b2=new Box(4,5);
        System.out.println(b2);


    }


}
