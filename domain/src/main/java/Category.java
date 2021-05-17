import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Category {

    private String categoryName;
    private Product products;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public void addProductsInCategory(){
        List<Product> listPr = new ArrayList<>();
        RandomStorePopulator randomStore = new RandomStorePopulator();
        Dish dish = new Dish(randomStore.listProducts("dish"));
        Fruit fruit = new Fruit(randomStore.listProducts("fruit"));
//        boolean b = Collections.addAll(dish,);
        System.out.println(dish);

    }

    @Override
    public String toString() {
        return "*** " + categoryName + " ***" + "\n" + StringUtils.join(products, "");
    }
}