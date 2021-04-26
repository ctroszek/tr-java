import org.apache.commons.lang3.StringUtils;

import java.util.List;

class Fruit extends Category{

    private String fruit;
    public List<Product> products;

    public Fruit(String fruit, List<Product> products) {
        this.fruit = fruit;
        this.products = products;
    }
    public Fruit() {
    }

    @Override
    public String toString() {
        return "\n***Fruit***\n" + StringUtils.join(products, "- ");
    }
}
