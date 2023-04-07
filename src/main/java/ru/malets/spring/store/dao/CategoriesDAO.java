package ru.malets.spring.store.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.malets.spring.store.database.CategoriesDB;
import ru.malets.spring.store.models.Category;

import java.util.List;

@Component
public class CategoriesDAO {

    private final CategoriesDB categoriesDB;

    public CategoriesDAO(CategoriesDB categoriesDB) {
        this.categoriesDB = categoriesDB;
    }


    public List<Category> index() {
        return categoriesDB.getCategories();
    }

//    public Category showCategory(int id){
//        return categoriesDB.getCategories().stream().filter(category -> category.getId() == id).findAny().orElse(null);
//    }

}
