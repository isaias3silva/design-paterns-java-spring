package com.mmlogistica.designpatternsjava.service;


import com.mmlogistica.designpatternsjava.model.Cliente;
import org.springframework.stereotype.Service;
/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 *
 * @author isaias3silva
 */


@Service
public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente BuscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);

}
