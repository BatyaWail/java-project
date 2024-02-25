package com.example.bootspring.services;

import com.example.bootspring.entities.Product;
import com.example.bootspring.entities.TempDB;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts(){return TempDB.productlist;}

    public Product getProductById( int id){
        return TempDB.productlist.stream().filter(x->x.getId()==id).findAny().orElse(null);
    }

    public void addProduct( Product product){
        TempDB.productlist.add(product);
    }

    public void deleteProduct( int id){
        TempDB.productlist.removeIf(p->p.getId()==id);
    }

    public void updateProduct( int id, Product product){
        Product exisProduct= TempDB.productlist.stream().filter(p->p.getId()==id).findAny().orElse(null);
        if(exisProduct==null)
            TempDB.productlist.add(product);
        else exisProduct.setName(product.getName());
    }
}
