package br.com.citra.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.dsl.BooleanExpression;

import br.com.citra.model.adapters.ContaDTOAdapter;
import br.com.citra.model.dto.ContaDTO;
import br.com.citra.model.entities.ContaEntity;
import br.com.citra.model.entities.QContaEntity;
import br.com.citra.repositories.ContaRepository;
import br.com.citra.services.ContaService;

@Service
public class ContaServiceImpl implements ContaService{
	
	@Autowired
	private ContaRepository contaRepository;

	@Override
	public List<ContaDTO> listarTodos(String nome) {				
		
		QContaEntity qConta = new QContaEntity("conta");
		BooleanExpression filterByNome = qConta.nome.startsWithIgnoreCase(nome);
		
		List<ContaEntity> findAll = (List<ContaEntity>) this.contaRepository.findAll(filterByNome);
		
		List<ContaDTO> contaDTOs = new ArrayList<>();
		
		if(findAll != null) {
			for (ContaEntity conta : findAll) {
				contaDTOs.add(ContaDTOAdapter.toDTO(conta));
			}
			
			return contaDTOs;
		}
				
		return null;
	}

	@Override
	public ContaDTO listarPorId(String id) {
		Optional<ContaEntity> conta = this.contaRepository.findById(id);
		return ContaDTOAdapter.toDTO(conta.get());
	}

	@Override
	public ContaDTO cadastrar(ContaDTO conta) {
		ContaEntity contaEntity = ContaDTOAdapter.toEntity(conta);
		this.contaRepository.save(contaEntity);
		return conta;
	}

	@Override
	public ContaDTO remover(String id) {
		this.contaRepository.deleteById(id);
		return null;
	}

}
