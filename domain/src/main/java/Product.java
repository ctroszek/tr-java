import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Product extends Category {

    private int rate;
    private int price;
    private String name;
    private int result;
    private List<Product> unsortedList;

    public Product(String name, int rate, int price) {
        this.name = name;
        this.rate = rate;
        this.price = price;
    }

//    @SneakyThrows
//    @Override
//    public int compareTo(Product o) {
//        RandomStorePopulator randomStorePopulator = new RandomStorePopulator();
//        if (randomStorePopulator.XMLParser().equals("price")){
//           int result = this.price.compareTo(o.price);
//        } else if (randomStorePopulator.XMLParser().equals("name")){
//            int result = this.name.compareTo(o.name);
//        } else if (randomStorePopulator.XMLParser().equals("rate")){
//            int result = this.rate.compareTo(o.rate);
//        }
//        return result;
//    }

    @Override
    public String toString() {
        return "- " + name + ' ' + price + "$" + ", rate= " + rate + '\n';
    }
}