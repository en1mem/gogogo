package com.german.gogogo.controller;

import com.german.gogogo.model.Product;
import com.german.gogogo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class MainController {
    @Autowired
    MainService mainService;

    @RequestMapping(value = "/product/{productID}", method = RequestMethod.GET)
    public Product getProductByID(@PathVariable Long productID) {
        Product product = mainService.getProductByID(productID);

        return product;
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getProductList() {
        List<Product> products = mainService.getProductList();

        return products;
    }

}
