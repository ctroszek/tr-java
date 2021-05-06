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

//    ATTENTION!!! DON'T REPEAT PLS!!!
    public List<Category> addProductsToCategories(){
        RandomStorePopulator randomStore = new RandomStorePopulator();
        List<Category> lists = new ArrayList<>();
        String nameProducts = randomStore.getFaker().dish();
        List<Product> products1 = randomStore.getProducts(nameProducts);
        lists.add(randomStore.getCategories(products1));
        return lists;
    }

    @Override
    public String toString() {
        return "*** " + categoryName + " ***" + "\n" + StringUtils.join(products, "");
    }
}