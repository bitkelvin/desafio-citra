package br.com.citra.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.citra.model.dto.ContaDTO;
import br.com.citra.services.ContaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/api")
@Api(value = "ContaControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContaController {
	
	@Autowired
	private ContaService contaService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation("Retoan a lista de todas as contas")
	public List<ContaDTO> listarTodas(
			@RequestParam(required = false, name = "nome", defaultValue = "") final String nome) {
		return this.contaService.listarTodos(nome);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ApiOperation("Retorna uma conta buscada por ID")
	public ResponseEntity<ContaDTO> listarPorId(@PathVariable(name = "id") String id) {
		return ResponseEntity.ok(this.contaService.listarPorId(id));
	}
	
	
	@RequestMapping(method= RequestMethod.POST)
	@ApiOperation("Cadastra uma conta")
	public ResponseEntity<ContaDTO> cadastrar(ContaDTO conta){
		return ResponseEntity.ok(this.contaService.cadastrar(conta));
	}
	
	@RequestMapping(value = "{id}", method=RequestMethod.DELETE)
	@ApiOperation("Exclui uma conta")
	public ResponseEntity<Integer> remover(@PathVariable(name = "id") String id){
		this.contaService.remover(id);
		return ResponseEntity.ok(1);
	}
	
}
