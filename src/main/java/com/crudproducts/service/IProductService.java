package com.crudproducts.service;

import com.crudproducts.model.dto.ProductDto;
import com.crudproducts.model.entity.Product;
import java.util.List;

public interface IProductService {
    List<Product> listAll();
    Product save(ProductDto product);

    Product findById(Integer id);

    void delete(Product product);

    boolean existsById(Integer id);
}
