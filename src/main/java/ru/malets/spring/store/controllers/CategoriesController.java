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
public class CategoriesController {

    private final CategoriesDAO categoriesDAO;
    private final ProductsDAO productsDAO;


    @Autowired
    public CategoriesController(CategoriesDAO categoriesDAO, ProductsDAO productsDAO) {
        this.categoriesDAO = categoriesDAO;
        this.productsDAO = productsDAO;
    }


    @GetMapping
    public String index(Model model){
        model.addAttribute("categories", categoriesDAO.index());
        return "categories";
    }
}
