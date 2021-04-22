import java.util.ArrayList;
import java.util.List;

public class Category {

    protected String nameCategory;
    public ArrayList<String> list;

    Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public ArrayList<String> addInListCategory(String nameCategory) {
        list = null;
        list.add(nameCategory);
        return  list;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public String setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
        return nameCategory;
    }

    @Override
    public String toString() {
        return "***" + nameCategory + "***";
    }
}