import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Dish extends Category{

    private String dish;
    public List<Product> products = new ArrayList<>();

    public Dish(String dish, List<Product> products) {
        this.dish = dish;
        this.products = products;
    }

    @Override
    public String toString() {
        return "***Dish***\n" + StringUtils.join(products, "- ");
    }
}
