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
        categories.add(new Dish(getDish()));
        categories.add(new Fruit(getFruit()));
        return categories;
    }

    public List<Product> getDish() {
        List<Product> dishs = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            dishs.add(new Product(getFaker().dish(), randomNumber(30), randomNumber(30)));
        }
        return dishs;
    }

    public List<Product> getFruit() {
        List<Product> fruits = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            fruits.add(new Product(getFaker().fruit(), randomNumber(30), randomNumber(30)));
        }
        return fruits;
    }
}