package com.comercialmanagement.Repository;

import com.comercialmanagement.Models.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract,Long> {
}
