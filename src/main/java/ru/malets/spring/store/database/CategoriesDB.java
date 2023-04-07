package ru.malets.spring.store.database;

import org.springframework.stereotype.Component;
import ru.malets.spring.store.database.id.Id;
import ru.malets.spring.store.models.Category;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoriesDB {
    private List<Category> categories;

    {
        categories = new ArrayList<>();

        categories.add(new Category(++Id.NUM, "Выпечка", "img/categories/bakery.png"));
        categories.add(new Category(++Id.NUM, "Овощи", "https://avatars.mds.yandex.net/i?id=37692d51c93941c7b26c2a39d3d8e6de68050efb-3598527-images-thumbs&n=13"));
        categories.add(new Category(++Id.NUM, "Фрукты", "https://avatars.mds.yandex.net/i?id=0a9c7b4b8f4076fc1de492786c3fad80e90b9264-8223286-images-thumbs&n=13"));
        categories.add(new Category(++Id.NUM, "Крупы", "https://avatars.mds.yandex.net/i?id=f4f6653e3a51683f59cbec58836c71565f6b1f65-9154408-images-thumbs&n=13"));
        categories.add(new Category(++Id.NUM, "Кондитерские изделия", "https://avatars.mds.yandex.net/i?id=56da36f8737784d279712bfeeb42b0589bac95b5-4010175-images-thumbs&n=13"));
        categories.add(new Category(++Id.NUM, "Бытовая химия", "https://avatars.mds.yandex.net/i?id=b21eb35fd9ae5744fdbfad8a9aa6159a2281f9ca-8225729-images-thumbs&n=13"));
    }

    public List<Category> getCategories() {
        return categories;
    }
}
