import org.apache.commons.lang3.StringUtils;
import java.util.List;

class Fruit extends Category{

//    public String getCategory() {
//        return "Fruit";
//    }
//
//    public CategoryInterface createCategory(){
//        return new Fruit();
//    }
//    @Override
//    public Categor createCategory() {
//        return new Fruit();
//    }

        private List<Product> products;
        private RandomStorePopulator randomStore;
        private Category category = new Category("Fruit");

    public Fruit(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "\n" + category + "\n" + StringUtils.join(products, "- ");
    }
}