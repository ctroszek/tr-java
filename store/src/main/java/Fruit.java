import org.apache.commons.lang3.StringUtils;
import java.util.List;

class Fruit extends Category{

    private List<Product> products;
    private Category category = new Category("Fruit");

    public Fruit(List<Product> products) {
        this.products = products;
    }
    Fruit(){}

//    @Override
//    public String toString() {
//        return "\n" + category + "\n" + StringUtils.join(products, "");
//    }
}