abstract class Figure{

    public abstract double area();

}

class Rectangle extends Figure{

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

class Circle extends Figure{

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*(radius*radius);

    }
}

// open for extenison closed for changes
class Picture{

    Figure[] figures=new Figure[10];
    int num=0;

    public void addFigure(Figure f){

        figures[num]=f;
        num++;

    }

    public double totalArea(){

        double total=0.0;

        for(int i=0;i<figures.length;i++)
        total=total+figures[i].area();

        return total;
    }

}


public class AbstractFigure {


    public static void main(String[] agrs){



        // runtime polymorphism
        // we cannot create objects
        // but we can create references
        Figure f1=new Rectangle(2,6);
        System.out.println(f1.area());
        Figure f2=new Circle(5);
        System.out.print(f2.area());

        Picture p=new Picture();

        p.addFigure(f1);
        p.addFigure(f2);
        p.totalArea();

    }

}
