import org.apache.commons.lang3.StringUtils;

import java.util.List;


public class Store {

    public RandomStorePopulator populator = new RandomStorePopulator();
    public List<Category> categories;

    public Store() {
        categories = populator.getCategory();
    }

    public void viewStore() {
        System.out.println(StringUtils.join(categories, " "));    }


}

