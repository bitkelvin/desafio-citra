package br.com.citra.services;

import java.util.List;

import br.com.citra.model.dto.ContaDTO;

public interface ContaService {

	List<ContaDTO> listarTodos(String nome);
	
	ContaDTO listarPorId(String id);
	
	ContaDTO cadastrar(ContaDTO conta);
		
	ContaDTO remover(String id);
	
}
