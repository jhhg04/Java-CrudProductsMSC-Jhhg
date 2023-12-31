package com.crudproducts.service.impl;

import com.crudproducts.model.dao.ProductDao;
import com.crudproducts.model.dto.ProductDto;
import com.crudproducts.model.entity.Product;
import com.crudproducts.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;;

import java.util.List;

@Service
public class ProductImplService implements IProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public List<Product> listAll() {
        return (List) productDao.findAll();
    }

    @Transactional
    @Override
    public Product save(ProductDto productDto) {
        Product product = Product.builder()
                .idProduct(productDto.getIdProduct())
                .nombre(productDto.getNombre())
                .precio(productDto.getPrecio())
                .build();
        return productDao.save(product);
    }

    @Transactional(readOnly = true)
    @Override
    public Product findById(Integer id) {
        return productDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Product product) {
        productDao.delete(product);
    }

    @Override
    public boolean existsById(Integer id) {
        return productDao.existsById(id);
    }
}
