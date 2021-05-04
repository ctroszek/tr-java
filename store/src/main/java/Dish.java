import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Dish extends Category{

    private List<Product> products;
    private Category category = new Category("Dish");

    public Dish(List<Product> products) {
        this.products = products;
    }

    Dish(){}
//    @Override
//    public String toString() {
//        return category + "\n" + StringUtils.join(products, "");
//    }
}