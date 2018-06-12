public class MatrixTest {

    public static void main(String[] args){

        MatrixMul m1=new MatrixMul(3,3);
        m1.getinput();
        m1.print();

        MatrixMul m2=new MatrixMul(3,3);
        m2.getinput();
        m2.print();

        MatrixMul c=m1.multiply(m2);
        c.print();


    }




}
