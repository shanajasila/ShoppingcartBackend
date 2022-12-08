package com.example.Newshoppingcartbackend.controller;

import com.example.Newshoppingcartbackend.dao.ProductDao;
import com.example.Newshoppingcartbackend.dao.RegistrationDao;
import com.example.Newshoppingcartbackend.model.Product;
import com.example.Newshoppingcartbackend.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ShopingController {

    @Autowired
    private ProductDao dao;
    @Autowired
    private RegistrationDao d;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addproduct",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> addproductpage(@RequestBody Product p){
        System.out.println(p.getName().toString());
        System.out.println(p.getCategory());
        System.out.println(p.getDescription());
        System.out.println(p.getPrice());
        System.out.println(p.getImage());
        dao.save(p);
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
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

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/register",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> userRegistration(@RequestBody Register r){
        System.out.println(r.getName());
        System.out.println(r.getAddress());
        System.out.println(r.getEmail());
        System.out.println(r.getPhoneno());
        System.out.println(r.getPassword());
        System.out.println(r.getConfirmpassword());
        d.save(r);
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewregister")
    public List<Register> viewsignuppage(){
        return(List<Register>)d.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/login",consumes = "application/json",produces = "application/json")
    public List<Register> login(@RequestBody Register r){
        String email=String.valueOf(r.getEmail());
        String password=String.valueOf(r.getPassword());
        System.out.println(email);
        System.out.println(password);
        return(List<Register>)d.login(r.getEmail(),r.getPassword());
    }
}
