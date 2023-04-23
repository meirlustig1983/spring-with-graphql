package com.ml.springwithgraphql.data;

import com.ml.springwithgraphql.data.dto.Salesperson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalespersonRepository extends JpaRepository<Salesperson, Long> {
    Salesperson findSalespersonByEmail(String email);
}