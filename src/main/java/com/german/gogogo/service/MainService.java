package com.german.gogogo.service;

import com.german.gogogo.model.Product;
import com.german.gogogo.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    MainRepository mainRepository;

    public Product getProductByID(Long productID) {
        //some magic(logic)
        return mainRepository.getProductByID(productID);
    }

    public List<Product> getProductList() {
        //some magic(logic)
        return mainRepository.getProductList();
    }
}
