package abccom.example.demoabc.product;

import abccom.example.demoabc.model.entities.Product;
import abccom.example.demoabc.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public boolean remove(int id) {
        boolean isDelete = false;
         try{
             productRepository.deleteById(id);
             isDelete = true;
         }catch (Exception ex){
             System.out.println(ex);
         }
         return isDelete;
    }
}
