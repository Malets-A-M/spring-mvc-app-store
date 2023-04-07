package ru.malets.spring.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.malets.spring.store.dao.CategoriesDAO;
import ru.malets.spring.store.dao.ProductsDAO;

@Controller
@RequestMapping("/categories")
public class ProductsController {

    private final ProductsDAO productsDAO;
    private final CategoriesDAO categoriesDAO;

    @Autowired
    public ProductsController(ProductsDAO productsDAO, CategoriesDAO categoriesDAO) {
        this.productsDAO = productsDAO;
        this.categoriesDAO = categoriesDAO;
    }

    @GetMapping("/{id}")
    public String index(@PathVariable("id") int id, Model model, Model model1, Model model2){
        model.addAttribute("products", productsDAO.index(id));
        model1.addAttribute("categories", categoriesDAO.index());
        model2.addAttribute("allProducts", productsDAO);
        return "products";
    }
//
//    @GetMapping("/{id1}/{id2}")
//    public String showCategory(@PathVariable("id1") int id1,
//                               @PathVariable("id2") int id2,
//                               Model model) {
//        model.addAttribute("product", productsDAO.showProduct(id1, id2));
//        return "showProducts";
//    }
}
