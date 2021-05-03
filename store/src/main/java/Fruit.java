import org.apache.commons.lang3.StringUtils;
import java.util.List;

class Fruit extends Category{

    private List<Product> products;

    public Fruit(List<Product> products) {
        setCategoryName("Fruit");
        this.products = products;
    }

    Fruit() {
    }

    @Override
    public String toString() {
        return "\n*** " + getCategoryName() + " ***\n\n" + StringUtils.join(products, "- ");
    }
}