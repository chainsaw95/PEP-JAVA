package Book;
public class Book {

    String name;
    String author;
    double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String author, double price) {
        this.author = author;
        this.price = price;
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void show(){
        System.out.println(author);
        System.out.println(name);
        System.out.println(price);
    }


    public Book costlyBook(Book b1){
        // this <- this is the object the method is called with
        if(this.price>b1.price)
            return this;
            else
            return b1;
    }


    public void finalize(){

        System.out.println("Object freed");

    }

}
