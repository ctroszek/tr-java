import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Dish extends Category{

//    private Category category;
//
//    public String getCategory() {
//        return "Dish";
//    }
//
//    @Override
//    public CategoryInterface createCategory() {
//        return new Dish();
//    }
//    Dish(){
//        RandomStorePopulator randomStore = new RandomStorePopulator();
//        System.out.println(randomStore.generatorDishProducts());
//    }

    private List<Product> products;
    private Category category = new Category("Dish");

    public Dish(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return category +"\n" + StringUtils.join(products, "- ");
    }
}
