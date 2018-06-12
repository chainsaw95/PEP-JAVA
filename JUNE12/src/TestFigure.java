/*

    interface
    collection of data members
    data members are public static final
    methods are by default public


    interfaces behave like a base class

    interface is a contract

 */
interface Figure{

    double area();
}


class Rectangle implements Figure {


    double len,wid;

    public Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    @Override
    public double area() {
        return len*wid;
    }


}

public class TestFigure{

public static void main(String[] args){

    Rectangle r1=new Rectangle(10,15);

    Figure f;

    f=r1;

    System.out.print(f.area());


}





        }
