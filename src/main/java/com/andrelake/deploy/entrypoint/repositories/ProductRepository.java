package com.andrelake.deploy.entrypoint.repositories;

import com.andrelake.deploy.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
