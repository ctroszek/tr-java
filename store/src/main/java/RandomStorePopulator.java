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
        for (int i = 0; i <= 5; i++){
            categories.add(new Dish(getProduct(getFaker().dish())));
        }
        for (int i = 0; i <= 5; i++){
            categories.add(new Fruit(getProduct(getFaker().fruit())));
        }
        return categories;
    }

    public List<Product> getProduct(String name) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(name, randomNumber(30), randomNumber(30)));
        return products;
    }
}