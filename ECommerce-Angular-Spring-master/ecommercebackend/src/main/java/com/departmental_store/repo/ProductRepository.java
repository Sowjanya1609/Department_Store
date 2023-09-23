package com.departmental_store.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.departmental_store.model.Product;
import com.departmental_store.model.User;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    void deleteById(Long id);
    Optional<Product> findById (Long id);
}
