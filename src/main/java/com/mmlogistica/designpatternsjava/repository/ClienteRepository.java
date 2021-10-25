package com.mmlogistica.designpatternsjava.repository;

import com.mmlogistica.designpatternsjava.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends CrudRepository<Cliente, Long> {
}
