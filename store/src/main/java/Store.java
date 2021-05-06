import org.apache.commons.lang3.StringUtils;

import java.util.List;


public class Store {

    private RandomStorePopulator populator = new RandomStorePopulator();
    private List<Category> categories;

    public Store() {
//        categories = populator.getCategories();
        categories = new Category().addProductsToCategories();
    }

    public void viewStore() {
        System.out.println(StringUtils.join(categories, " "));    }
}