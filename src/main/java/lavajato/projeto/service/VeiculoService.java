package lavajato.projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lavaja.projeto.exception.ResourceNotFoundException;
import lavajato.projeto.entity.Cliente;
import lavajato.projeto.entity.Veiculo;
import lavajato.projeto.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;

	public VeiculoService(VeiculoRepository veiculoRepository) {
		this.veiculoRepository = veiculoRepository;
	}

	public Veiculo buscarPorId(Long id) {
		return veiculoRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Veiculo com ID " + id + " não encontrado."));
	}

	public List<Veiculo> listarTodos(){
		return veiculoRepository.findAll();
	}
	
}
