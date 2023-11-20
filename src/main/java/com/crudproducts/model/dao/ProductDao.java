package com.crudproducts.model.dao;

import com.crudproducts.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> {
}