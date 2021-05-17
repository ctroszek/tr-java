import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {

    private int rate;
    private int price;
    private String name;

    public Product(String name, int rate, int price) {
        this.name = name;
        this.rate = rate;
        this.price = price;
    }

    @Override
    public String toString() {
        return "- " + name + ' ' + price + "$" + ", rate= " + rate + '\n';
    }
}