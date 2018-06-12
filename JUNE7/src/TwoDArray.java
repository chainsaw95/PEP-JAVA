public class TwoDArray {

    public static void main(String[] args) {


        int[][] a = new int[3][4];


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                a[i][j] = j;

            }
            System.out.println(" ");

        }

        int b[] = {1, 6, 5, 9, 3, 5};

        a[1] = b;


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                System.out.println(a[i][j]);

            }

            System.out.println(" ");
        }


    }


}
