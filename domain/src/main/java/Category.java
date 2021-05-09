import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
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

    public List<Category> addProductsInCategory(){
        List<Category> lists = new ArrayList<>();
        RandomStorePopulator randomStore = new RandomStorePopulator();
        Dish dish = new Dish(randomStore.listOfProducts("dish"));
        Fruit fruit = new Fruit(randomStore.listOfProducts("fruit"));
        lists.add(dish);
        lists.add(fruit);
        return lists;
    }

    @Override
    public String toString() {
        return "*** " + categoryName + " ***" + "\n" + StringUtils.join(products, "");
    }
}