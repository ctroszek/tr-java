import com.github.javafaker.Faker;
import com.github.javafaker.Food;

import java.util.*;

public class RandomStorePopulator {
    Faker faker = new Faker();
    Random random = new Random();

    public Food getFaker() {
        return faker.food();
    }

    public int randomNumber(int number) {
        return random.nextInt(number - 1) + 1;
    }

    public List<Category> getCategory() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Dish("Dish", getProduct()));
        categories.add(new Fruit("Fruit", getProduct(new Fruit())));
        return categories;
    }
    public List<Product> getProduct(Category category) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            category.getCategoryName();
            if (category instanceof Dish) {
                products.add(new Product(getFaker().dish(), randomNumber(30), randomNumber(30)));
            } else if (category instanceof Fruit) {
                products.add(new Product(getFaker().fruit(), randomNumber(30), randomNumber(30)));
            }
        }
        return products;
    }

//    public List<Product> createByCategory(Category category) {
//        List<Product> products = new ArrayList<>();
//        if (category instanceof Fruit) {
//            products.add(new Product(getFaker().fruit(), randomNumber(30), randomNumber(30)));
//        } else if (category instanceof Dish) {
//            products.add(new Product(getFaker().dish(), randomNumber(30), randomNumber(30)));
//        }
//        return products;
    }