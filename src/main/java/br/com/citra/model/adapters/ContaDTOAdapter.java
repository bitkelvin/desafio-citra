package br.com.citra.model.adapters;

import br.com.citra.model.dto.ContaDTO;
import br.com.citra.model.entities.ContaEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ContaDTOAdapter {

	public static ContaDTO toDTO(ContaEntity contaEntity) {
		if (contaEntity == null) {
			return null;
		}
		return ContaDTO
				.builder()
				.id(contaEntity.getId())
				.nome(contaEntity.getNome())
				.saldo(contaEntity.getSaldo())
				.dataAberturaConta(contaEntity.getDataAberturaConta())
				.build();
	}
	
	public static ContaEntity toEntity(ContaDTO contaDTO) {
		if (contaDTO == null) {
			return null;
		}
		return ContaEntity
				.builder()
				.id(contaDTO.getId())
				.nome(contaDTO.getNome())
				.saldo(contaDTO.getSaldo())
				.dataAberturaConta(contaDTO.getDataAberturaConta())
				.build();
	}
}
