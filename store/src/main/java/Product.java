public class Product {

    private int rate;
    private int price;
    private String name;

    public Product(String name, int rate, int price) {
        this.name = name;
        this.rate = rate;
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "- " + name + ' ' + price + "$" + ", rate= " + rate + '\n';
    }
}