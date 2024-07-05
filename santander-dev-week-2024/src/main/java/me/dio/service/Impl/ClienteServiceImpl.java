package me.dio.service.Impl;

import me.dio.controller.dto.ClienteDto;
import me.dio.model.Cliente;
import me.dio.repository.ClienteRepository;
import me.dio.service.ClienteService;
import me.dio.service.exception.BusinessException;
import me.dio.service.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl implements ClienteService {

    private static final Long UNCHANGEABLE_CLIENTE_ID = 1L;

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ClienteDto> getAllClientes() {
        return clienteRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public ClienteDto createCliente(ClienteDto clienteDto) {
        validateChangeableId(clienteDto.getId(), "created");

        Cliente cliente = convertToEntity(clienteDto);
        return convertToDto(clienteRepository.save(cliente));
    }

    @Override
    @Transactional(readOnly = true)
    public ClienteDto getClienteById(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Cliente não encontrado com o id " + id));
        return convertToDto(cliente);
    }

    @Override
    @Transactional
    public ClienteDto updateCliente(Long id, ClienteDto clienteDto) {
        validateChangeableId(id, "updated");

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Cliente não encontrado com o id " + id));

        cliente.setName(clienteDto.getName());
        cliente.setEmail(clienteDto.getEmail());
        // Adicione outras atualizações conforme necessário

        return convertToDto(clienteRepository.save(cliente));
    }

    @Override
    @Transactional
    public void deleteCliente(Long id) {
        validateChangeableId(id, "deleted");

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Cliente não encontrado com o id " + id));
        clienteRepository.delete(cliente);
    }

    private ClienteDto convertToDto(Cliente cliente) {
        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setId(cliente.getId());
        clienteDto.setName(cliente.getName());
        clienteDto.setEmail(cliente.getEmail());
        // Converta outros campos conforme necessário
        return clienteDto;
    }

    private Cliente convertToEntity(ClienteDto clienteDto) {
        Cliente cliente = new Cliente();
        cliente.setId(clienteDto.getId());
        cliente.setName(clienteDto.getName());
        cliente.setEmail(clienteDto.getEmail());
        // Converta outros campos conforme necessário
        return cliente;
    }

    private void validateChangeableId(Long id, String operation) {
        if (UNCHANGEABLE_CLIENTE_ID.equals(id)) {
            throw new BusinessException("Cliente with ID %d cannot be %s.".formatted(UNCHANGEABLE_CLIENTE_ID, operation));
        }
    }
}
