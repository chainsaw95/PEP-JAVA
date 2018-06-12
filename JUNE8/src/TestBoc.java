public class TestBoc {

    public static void main(String[] args){


        Box b=new Box(5,5,5);
        b.show();

        CoveredBox cb=new CoveredBox(2,2,2);
        cb.show();

        showAll(b,b);
        showAll(cb,cb);
        showAll(b,cb);
        showAll(cb,b);

    }

    public static void showAll(Box b1,Box b2){
        b1.show();
        b2.show();
    }







}
