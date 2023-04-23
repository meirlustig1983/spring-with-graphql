package com.ml.springwithgraphql.data;

import com.ml.springwithgraphql.data.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}