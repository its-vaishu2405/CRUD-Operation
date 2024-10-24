package com.nimapinfotech.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimapinfotech.Crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
