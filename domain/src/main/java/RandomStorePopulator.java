import com.github.javafaker.Faker;
import com.github.javafaker.Food;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStorePopulator {
    Faker faker = new Faker();
    Random random = new Random();


    public Food getFaker() {
        return faker.food();
    }

    public int randomNumber(int number) {
        return random.nextInt(number - 1) + 1;
    }

    public Product getProduct(String name) {
        return new Product(name, randomNumber(30), randomNumber(30));
    }

    public List<Product> listOfProducts(String nameCategory){
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (nameCategory.equals("Dish")){
                productList.add(getProduct(getFaker().dish()));
            } else if (nameCategory.equals("Fruit")) {
                productList.add(getProduct(getFaker().fruit()));
            }
        }
        return productList;
    }
}