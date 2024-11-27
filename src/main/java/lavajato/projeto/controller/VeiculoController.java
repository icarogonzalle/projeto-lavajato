package lavajato.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.ManyToOne;
import lavajato.projeto.entity.Cliente;
import lavajato.projeto.entity.Veiculo;
import lavajato.projeto.service.ClienteService;
import lavajato.projeto.service.VeiculoService;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;
	
	
	public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }
	
	@GetMapping("/{id}")
    public ResponseEntity<Veiculo> buscarPorId(@PathVariable Long id){
		return ResponseEntity.ok(veiculoService.buscarPorId(id));
	}

	@GetMapping
	public List<Veiculo> listarVeiculos(){
		return veiculoService.listarTodos();
	}
	
}
