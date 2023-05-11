package com.comercialmanagement.Repository;

import com.comercialmanagement.Models.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura,Long> {
}
