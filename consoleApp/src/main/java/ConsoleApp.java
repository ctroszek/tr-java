import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ConsoleApp {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        Store store = new Store();
        store.viewStore();
//        List<Product> unsortList = store.products;
//        store.sortList(unsortList);
//        System.out.println(unsortList);


    }

    public static void top(){

    }

    public static void quit(){
        System.exit(0);
    }

//    public static void userChoice(String choice){
//        Product product = new Product();
//        Category category = new Category();
//        List<Product> unsortedList =  category.addProductsInCategory();
//        if (choice.equals("sort")){ product.sort();}
////        else if (choice.equals("top")) { top(); }
//        if (choice.equals("quit")){ quit(); }
//    }
}