package lavajato.projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lavaja.projeto.exception.ResourceNotFoundException;
import lavajato.projeto.entity.Cliente;
import lavajato.projeto.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public  Cliente buscarPorId(Long id) {
		return clienteRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente com ID " + id + " não encontrado."));
	}

	public List<Cliente> listarTodos(){
		return clienteRepository.findAll();
	}

}
