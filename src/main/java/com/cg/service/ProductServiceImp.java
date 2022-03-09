package com.cg.service;

import com.cg.model.dto.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImp implements IProductService{
    private List<Product> products = new ArrayList<>();
    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
