package lavajato.projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lavaja.projeto.exception.ResourceNotFoundException;
import lavajato.projeto.entity.Funcionario;
import lavajato.projeto.entity.Veiculo;
import lavajato.projeto.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}

	public Funcionario buscarPorId(Long id) {
		return funcionarioRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente com ID " + id + " não encontrado."));
	}

	public List<Funcionario> listarTodos(){
		return funcionarioRepository.findAll();
	}
}
