import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Category {

    private String categoryName;

    //реализация под вопросиком((
//    public List<Category> generatingCategory(Category category) {
//        List<Category> categories = new ArrayList<>();
//        categories.add(category);
//        return categories;
//    }
}