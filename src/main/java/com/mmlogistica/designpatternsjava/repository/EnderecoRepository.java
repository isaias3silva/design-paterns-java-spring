package com.mmlogistica.designpatternsjava.repository;

import com.mmlogistica.designpatternsjava.model.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
