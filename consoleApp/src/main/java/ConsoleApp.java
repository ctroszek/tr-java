import java.lang.reflect.InvocationTargetException;

public class ConsoleApp {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException {
//        Store store = new Store();
//        store.viewStore();

        Store store = new Store();
        store.reflectData();
    }
}