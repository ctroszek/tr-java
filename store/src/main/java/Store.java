import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;


public class Store {

//    private final List<Product> products = new ArrayList<>();
    private RandomStorePopulator populator = new RandomStorePopulator();

    public void viewStore() {
        Category fruit = new Fruit();
        Category dish = new Dish();
        System.out.println(fruit.getNameCategory());
        System.out.println(StringUtils.join(populator.createByCategory(new Fruit()), " | "));
        System.out.println(dish.getNameCategory());
        System.out.println(StringUtils.join(populator.createByCategory(new Dish()), " | "));

    }


}

