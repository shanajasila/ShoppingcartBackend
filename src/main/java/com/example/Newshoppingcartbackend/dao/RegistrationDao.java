package com.example.Newshoppingcartbackend.dao;

import com.example.Newshoppingcartbackend.model.Product;
import com.example.Newshoppingcartbackend.model.Register;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RegistrationDao extends CrudRepository<Register,Integer> {

    @Query(value = "SELECT `id`, `address`, `confirmpassword`, `email`, `name`, `password`, `phoneno` FROM `signup` WHERE `email`&&`password`= :email,password",nativeQuery = true)
    List<Product> login(@Param("email,password") String email ,String password);
}
