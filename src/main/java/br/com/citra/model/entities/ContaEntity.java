package br.com.citra.model.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContaEntity {

	@NotNull
	private String id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private BigDecimal saldo;
	
	@NotNull
	private Date dataAberturaConta;
	
}
