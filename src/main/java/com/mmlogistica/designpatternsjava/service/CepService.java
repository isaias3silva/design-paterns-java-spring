package com.mmlogistica.designpatternsjava.service;

import com.mmlogistica.designpatternsjava.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCEP</b>.
 *
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 *
 * @author isaias3silva
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface CepService {
    @GetMapping("/{cep}/json")
    Endereco consultarCep(@PathVariable("cep")String cep);
}
