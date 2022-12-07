package com.example.Newshoppingcartbackend.dao;

import com.example.Newshoppingcartbackend.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer>{

}
