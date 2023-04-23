package com.ml.springwithgraphql.data;

import com.ml.springwithgraphql.data.dto.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
}
