import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Store {
    private List<Category> categories;
    private Category category;
    private Dish dish;
    private Fruit fruit;
    private Product product;
    private RandomStorePopulator randomStorePopulator;

    public Store() {
        Category allProducts = new Category();
//        categories = allProducts.addProductsInCategory();
    }

    public void viewStore() {
        System.out.println(StringUtils.join(categories, " "));
    }

    public void reflectData() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        Class<?> dishh = Class.forName("Dish");
        Field dishName = dishh.getDeclaredField("categoryName");
        Class<?> c = Class.forName("RandomStorePopulator");
        Method method = c.getDeclaredMethod("listOfProducts", String.class);
        Object result = method.invoke(dishName, "products");
        System.out.println(result);
    }


}