package me.dio.service;

import me.dio.controller.dto.ClienteDto;
import me.dio.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<ClienteDto> getAllClientes();
    ClienteDto createCliente(ClienteDto clienteDto);
    ClienteDto getClienteById(Long id);
    ClienteDto updateCliente(Long id, ClienteDto clienteDto);
    void deleteCliente(Long id);
}
