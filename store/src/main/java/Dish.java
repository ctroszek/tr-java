import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Dish extends Category{

    private List<Product> products;

    public Dish(List<Product> products) {
        setCategoryName("Dish");
        this.products = products;
    }
    Dish() {
    }

    @Override
    public String toString() {
        return "*** " + getCategoryName() + " ***\n\n" + StringUtils.join(products, "- ");
    }
}
