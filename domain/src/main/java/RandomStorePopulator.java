import com.github.javafaker.Faker;
import com.github.javafaker.Food;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStorePopulator {
    Faker faker = new Faker();
    Random random = new Random();
    private String nodeName;


    public Food getFaker() {
        return faker.food();
    }

    public int randomNumber(int number) {
        return random.nextInt(number - 1) + 1;
    }

    public Product getProduct(String name) {
        return new Product(name, randomNumber(30), randomNumber(30));
    }

    public List<Product> listProducts(String nameCategory){
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (nameCategory.equals("dish")){
                productList.add(getProduct(getFaker().dish()));
            } else if (nameCategory.equals("fruit")) {
                productList.add(getProduct(getFaker().fruit()));
            }
        }
        return productList;
    }

    public String  XMLParser() throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("store/src/main/resources/config.xml"));
        NodeList tagsName = document.getChildNodes();
        for (int i = 0; i < tagsName.getLength(); i++) {
            Node tagName = tagsName.item(i);
            if (tagName.getNodeType() != Node.TEXT_NODE) {
                NodeList textBetweenTag = tagName.getChildNodes();
                for (int j = 0; j < textBetweenTag.getLength(); j++) {
                    Node getAllText = textBetweenTag.item(j);
                    if (getAllText.getNodeType() != Node.TEXT_NODE && getAllText.getTextContent().equals("DESC")) {
                        nodeName = getAllText.getNodeName();
                    }
                }
            }
        }
        return nodeName;
    }
}