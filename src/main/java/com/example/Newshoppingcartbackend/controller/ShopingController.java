package com.example.Newshoppingcartbackend.controller;

import com.example.Newshoppingcartbackend.dao.ProductDao;
import com.example.Newshoppingcartbackend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopingController {

    @Autowired
    private ProductDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addproduct",consumes = "application/json",produces = "application/json")
    public String addproductpage(@RequestBody Product p){
        System.out.println(p.getName().toString());
        System.out.println(p.getCategory());
        System.out.println(p.getDescription());
        System.out.println(p.getPrice());
        System.out.println(p.getImage());
        dao.save(p);
        return "add product";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewproduct")
    public List<Product> viewpage(){
        return(List<Product>)dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchproduct",consumes = "application/json",produces = "application/json")
    public List<Product> searchproduct(@RequestBody Product p){
        String name=String.valueOf(p.getName());
        System.out.println(name);
        dao.searchProduct(p.getName());
        return(List<Product>)dao.searchProduct(p.getName());
    }
}
