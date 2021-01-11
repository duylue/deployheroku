package abccom.example.demoabc.product;


import abccom.example.demoabc.model.entities.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();
    Optional<Product> findById(int id);
    Product save(Product product);
    boolean remove(int id);
}
