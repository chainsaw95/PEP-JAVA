public class Box {
    //runtime polymorphism
    double height;
    double width;
    double length;


    Box(){


    }

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public void show(){

        System.out.print("height"+height);
        System.out.print("width"+width);
        System.out.println("length"+length);

    }
}
