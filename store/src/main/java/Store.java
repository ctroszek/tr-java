import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Store{
    public List<Product> products;

    public Store() {
        Category allProducts = new Category();
//        products = allProducts.addProductsInCategory();
    }

    public void viewStore(){
        System.out.println(StringUtils.join(products, " "));
    }

    public List<Product> sortList(List<Product> unsortedList) {
        unsortedList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getPrice() - p2.getPrice();
            }
        });
        return unsortedList;
    }
}