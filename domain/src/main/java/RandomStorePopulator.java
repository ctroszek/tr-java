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

    public List<Category> getCategories(List<Product> nameProducts) {
        List<Category> categories = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            categories.add(new Dish(nameProducts));
        }
        return categories;
    }

    public List<Product> getProducts(String name) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(name, randomNumber(30), randomNumber(30)));
        return products;
    }

//    public ArrayList<Category> addProductsToCategories(){
//        List<Category> lists = new ArrayList<>();
//        String nameProducts = getFaker().dish();
//        lists.add(getCategories(getProducts(nameProducts)));
//        return (ArrayList<Category>) lists;
//    }

}