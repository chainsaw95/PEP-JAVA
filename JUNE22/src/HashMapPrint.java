import java.io.*;
import java.util.HashMap;

class Book implements Serializable{

    String tittle,author;
    int bookid;


    public Book(String tittle, String author, int bookid) {
        this.tittle = tittle;
        this.author = author;
        this.bookid = bookid;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", bookid=" + bookid +
                '}';
    }
}


public class HashMapPrint {


    public static void main(String[] args){

        try{

            Book b1=new Book("JK Potter","JK ROWling",101);
            Book b2=new Book("JK LLOasr","First asd",102);
            Book b3=new Book("JLo asdasdr","Kiksad as",103);


            HashMap<Integer,Book> hash1=new HashMap<>();

            hash1.put(b1.bookid,b1);
            hash1.put(b2.bookid,b2);
            hash1.put(b3.bookid,b3);


            FileOutputStream fout=new FileOutputStream("Out.dat");

            ObjectOutput out=new ObjectOutputStream(fout);

            out.writeObject(hash1);

            out.close();


            FileInputStream fin=new FileInputStream("Out.dat");
            ObjectInputStream oin=new ObjectInputStream(fin);

            Object sc1=oin.readObject();

            System.out.println(sc1);

            fin.close();
            oin.close();



        }
        catch (Exception e){

            System.out.println(e);

        }

    }

}
