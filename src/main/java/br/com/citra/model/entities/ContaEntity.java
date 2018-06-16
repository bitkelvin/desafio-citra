package br.com.citra.model.entities;

import java.math.BigDecimal;
import java.util.Date;

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

	private String id;
	
	private String nome;
	
	private BigDecimal saldo;
	
	private Date dataAberturaConta;
	
}
