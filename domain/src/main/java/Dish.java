import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Dish extends Category{

    private List<Product> products;
    private static String categoryName;

    public Dish(List<Product> products) {
        categoryName = "Dish";
        this.products = products;
    }

    @Override
    public String toString() {
        return StringUtils.join("        *** "+ categoryName + " ***\n", " ")
                + StringUtils.join(products, " ");
    }
}