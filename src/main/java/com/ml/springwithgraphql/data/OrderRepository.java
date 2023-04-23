package com.ml.springwithgraphql.data;

import com.ml.springwithgraphql.data.dto.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}