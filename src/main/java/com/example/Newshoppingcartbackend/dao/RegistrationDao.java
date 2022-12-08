package com.example.Newshoppingcartbackend.dao;

import com.example.Newshoppingcartbackend.model.Product;
import com.example.Newshoppingcartbackend.model.Register;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RegistrationDao extends CrudRepository<Register,Integer> {

    @Query(value = "SELECT `id`, `address`, `confirmpassword`, `email`, `name`, `password`, `phoneno` FROM `signup` WHERE `email`= :email &&`password`= :password",nativeQuery = true)
    List<Register> login(@Param("email") String email ,@Param("password") String password);
}
