package com.ems.productservice1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ems.productservice1.model.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, String> {

}
