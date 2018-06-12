public class CoveredBox extends Box {

    public CoveredBox(double height, double width, double length) {
        super(height, width, length);
    }


    public void show(){

        System.out.println("Show in derived class");
        System.out.print("height"+height);
        System.out.print("width"+width);
        System.out.println("length"+length);

    }


}
