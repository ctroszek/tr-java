import org.apache.commons.lang3.StringUtils;

import java.util.List;


public class Store {
    private List<Category> categories;

    public Store() {
        Category allProducts = new Category();
        categories = allProducts.addProductsInCategory();
    }

    public void viewStore() {
        System.out.println(StringUtils.join(categories, " "));
      }
}