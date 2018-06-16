package br.com.citra.model.dto;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ContaDTO {
	
	@Id
	private String id;
	
	private String nome;
	
	private BigDecimal saldo;
	
	@JsonFormat(shape=Shape.STRING, pattern="yyyy-MM-dd")
	private Date dataAberturaConta;
	
}
