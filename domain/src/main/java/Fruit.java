import java.util.List;

class Fruit extends Category{

    private List<Product> products;
    private static String categoryName;

    public Fruit(List<Product> products) {
        categoryName = "Fruit";
        this.products = products;
    }

//    @Override
//    public String toString() {
//        return categoryName + "\n" + StringUtils.join(products, "");
//    }
}