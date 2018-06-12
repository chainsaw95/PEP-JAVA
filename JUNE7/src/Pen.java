public class Pen {

    String type;
    String brand;
    int price;
    Student s1;
    public Pen(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public Pen(String type, String brand, int price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }


    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
