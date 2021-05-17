import org.apache.commons.lang3.StringUtils;

import java.util.List;

class Fruit extends Category{

    private List<Product> products;
    private static String categoryName;

    public Fruit(List<Product> products) {
        categoryName = "Fruit";
        this.products = products;
    }

    @Override
    public String toString() {
        return StringUtils.join("       *** "+ categoryName + " ***\n", " ")
                + StringUtils.join(products, " ");
    }
}