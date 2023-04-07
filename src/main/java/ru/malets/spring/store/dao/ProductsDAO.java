package ru.malets.spring.store.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.malets.spring.store.database.ProductsDB;
import ru.malets.spring.store.models.Product;

import java.util.List;

@Component
public class ProductsDAO {

    private List<Product> products;

    @Autowired
    public ProductsDAO(ProductsDB productsDB) {
        products = productsDB.getProducts();
    }

    public List<Product> index(int id) {
        return products.stream().filter(product -> product.getCategoryId() == id).toList();
    }
    public Product showProduct(int id1, int id2){
        return products.stream().filter(product -> product.getId() == id1).toList()
                .stream().filter(product -> product.getId() == id2).findAny().orElse(null);
    }
    public List<Product> showAllProducts() {
        return products;
    }
}
