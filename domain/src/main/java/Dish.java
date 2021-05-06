import java.util.List;

public class Dish extends Category{

    private final List<Product> products;
    private static String categoryName;

    public Dish(List<Product> products) {
        categoryName = "Dish";
        this.products = products;
    }

//    IN MY OPINION THIS METHOD MUST BE WRITTEN IN CATEGORY CLASS(IN CLASS FRUIT THE SAME CASE)
//    @Override
//    public String toString() {
//        return categoryName + "\n" + StringUtils.join(products, "");
//    }
}