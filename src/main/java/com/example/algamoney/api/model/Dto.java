package com.example.algamoney.api.model;

import java.math.BigInteger;
import java.time.LocalDate;

import lombok.Data;

@Data
public class Dto {

	private BigInteger codigo;
	private String nome;
	private String descricao;
	private java.sql.Date dataPagamento;
	// private LocalDate dataPagamento;
	
	public Dto() {}
	
	public Dto(BigInteger codigo, String nome,String descricao, java.sql.Date dataPagamento) {
		// this.codigo = new Long(codigo.longValue());
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		//this.dataPagamento = new Date(dataPagamento.getTime());
		//this.dataPagamento = dataPagamento.toLocalDate();
		this.dataPagamento = dataPagamento;
	}
}
