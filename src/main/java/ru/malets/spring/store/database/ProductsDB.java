package ru.malets.spring.store.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.malets.spring.store.database.id.Id;
import ru.malets.spring.store.models.Category;
import ru.malets.spring.store.models.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsDB {

    private List<Product> products;

    private CategoriesDB categoriesDB;


    @Autowired
    public ProductsDB(CategoriesDB categoriesDB) {
        this.categoriesDB = categoriesDB;
    }

    public List<Product> getProducts() {
        products = new ArrayList<>();

        String categoryName = "Выпечка";
        products.add(new Product(++Id.NUM, getId(categoryName), 250, "Батон", "https://avatars.mds.yandex.net/i?id=5e9c940017836f424795f84a80e3ce68ae122731-9266026-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 250, "Багет", "https://avatars.mds.yandex.net/i?id=714cb771c25acc0a37e131a18c141ef8-5668605-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 250, "Ржаной хлеб", "https://avatars.mds.yandex.net/i?id=f02c3b1f13c0e6771e96c8036ed8a608-3740951-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 250, "Бородинский хлеб", "https://avatars.mds.yandex.net/i?id=97d47d7fe47978bf2bb2e9c327d44e0f7ecefafd-7025773-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 250, "Чиабатта", "https://avatars.mds.yandex.net/i?id=60d8b13ade424eb2e592f1ee3a70b57ac89e6fbe-7765566-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 250, "Лепешка", "https://avatars.mds.yandex.net/i?id=c6e1736a6e55a219c10a2d4745f39dd8eaeed1fd-8527116-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 250, "Лаваш", "https://avatars.mds.yandex.net/i?id=ba27b7a66bb562721d0967f48142f0f950a064ef-7866615-images-thumbs&n=13"));

        categoryName = "Овощи";
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Помидоры", "https://avatars.mds.yandex.net/i?id=a7a8c52f432e1f1bfef05154542191af-4829635-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Баклажаны", "https://avatars.mds.yandex.net/i?id=5a614735b6acc370f8fdf39467c0989f19d62602-9151021-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Кабачки", "https://avatars.mds.yandex.net/i?id=706f5afd2e7db190032aaea74b6a7fc8-7065781-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Перец болгарский", "https://avatars.mds.yandex.net/i?id=d88518a1f94a9662f8edc20831f4d2f281628d0a-7823046-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Капуста", "https://avatars.mds.yandex.net/i?id=c201aba2a229469339491e3c6f3ca566e02d6a63-5500333-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Брокколи", "https://avatars.mds.yandex.net/i?id=5c7fdce973d1508be8da69d284524fdd7cb78aac-6429039-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Цветная капуста", "https://avatars.mds.yandex.net/i?id=778c2da99c7768774c76349c0acd0066-5235717-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Тыква", "https://avatars.mds.yandex.net/i?id=2f0333478e06fd6907d44328665edb955f70fc68-4615702-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Картофель", "https://avatars.mds.yandex.net/i?id=83e3444fc272cf81fd51ac8df57700ab6eaa0d5f-5029416-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Лук", "https://avatars.mds.yandex.net/i?id=feb008429278b8bffbbf7e8229bcce4d6a768644-8257645-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Чеснок", "https://avatars.mds.yandex.net/i?id=8c569cc292398b773db38866727c4e0d18cb87a8-4828361-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Морковь", "https://avatars.mds.yandex.net/i?id=9b4af55ee05c9e4312eef54556f10d81085ca012-8289735-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Редис", "https://avatars.mds.yandex.net/i?id=fa8b21bb92477a7808119c6434b513b3-5869826-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 180, "Свекла", "https://avatars.mds.yandex.net/i?id=4a552c407cd62900b9717d8f012732ae90412ab2-8498339-images-thumbs&n=13"));

        categoryName = "Фрукты";
        products.add(new Product(++Id.NUM, getId(categoryName), 220, "Авокадо", "https://avatars.mds.yandex.net/i?id=737eeec2c8b32480e67e65e53c3d44f51e5c0545-8312878-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 220, "Айва", "https://avatars.mds.yandex.net/i?id=b1629952ab6566db2e1ccef1fe309584-5384017-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 220, "Ананас", "https://avatars.mds.yandex.net/i?id=86cfb4600cd9de3d724e56f8e23e13aa1c9d0c6a-7571104-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 220, "Арбуз", "https://avatars.mds.yandex.net/i?id=49badadd70e7433eebc8794e11f07500603e4054-5159066-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 220, "Нектарины", "https://avatars.mds.yandex.net/i?id=693506f2494cda7e7e6d14953fc67438735f3244-4285148-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 220, "Виноград", "https://avatars.mds.yandex.net/i?id=6add05f4b2f15766b2722b0169c2b7281f169df6-7549525-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 220, "Гранаты", "https://avatars.mds.yandex.net/i?id=46b1523abfcfd2b25bc7e0f90f349b0731819ff5-7084676-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 220, "Груши", "https://avatars.mds.yandex.net/i?id=76b9cd46fd9cf5c5ad3a0f376992c7aa641331c2-4343199-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 220, "Киви", "https://avatars.mds.yandex.net/i?id=27eb3e64b67dbec45203a042650ec31c-4273943-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 220, "Апельсины", "https://avatars.mds.yandex.net/i?id=e3a27ecdaaa0637e5e435a2e0767d8175a36edb9-8340522-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 220, "Бананы", "https://avatars.mds.yandex.net/i?id=707e4b255c0a7e025c0359f9c4b2ba577a238ea7-4824023-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 220, "Яблоки", "https://avatars.mds.yandex.net/i?id=8d62045b7996ed3d0bd4da92c7891f9d0ea5b62f-9164755-images-thumbs&n=13"));

        categoryName = "Крупы";
        products.add(new Product(++Id.NUM, getId(categoryName), 335, "Булгур", "https://avatars.mds.yandex.net/i?id=015bd8336a760582ffa328d605d5730db4a03d37-8210262-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 335, "Гречка", "https://avatars.mds.yandex.net/i?id=585312ee772abe5270a2142374239e4222f01803-9182174-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 335, "Овсяная крупа", "https://avatars.mds.yandex.net/i?id=80b0aa71c8b13f8656d81ebee259d9e9-4484124-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 335, "Перловая крупа", "https://avatars.mds.yandex.net/i?id=475eae471ab026c8852d4d31752071ee149218f9-8549383-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 335, "Рис", "https://avatars.mds.yandex.net/i?id=8088daa30a1a3985fb35f9ddeedebac0eb76e0f4-8312878-images-thumbs&n=13"));

        categoryName = "Кондитерские изделия";
        products.add(new Product(++Id.NUM, getId(categoryName), 264, "Шоколад", "https://avatars.mds.yandex.net/i?id=226714d2805af9a83a223b0497b14ca662682399-9221923-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 264, "Конфеты", "https://avatars.mds.yandex.net/i?id=a5e147b0576d04b743b7cad02f7979553ef8e443-8496938-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 264, "Печенье", "https://avatars.mds.yandex.net/i?id=c41a319901b98ae7740f0e3067c9c8f33a7a78c1-8498375-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 264, "Сдоба", "https://avatars.mds.yandex.net/i?id=2955fe07036c7f205fec9ca2f675ffc7ba206fdf-7672646-images-thumbs&n=13"));
        products.add(new Product(++Id.NUM, getId(categoryName), 264, "Мармелад", "https://avatars.mds.yandex.net/i?id=0d2dea08204861f20562143774b2e3c9e3464092-8502968-images-thumbs&n=13"));

        return products;
    }

    private int getId(String categoryName) {
        return categoriesDB.getCategories().stream().filter(category -> category.getName().equals(categoryName)).findAny().get().getId();
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
