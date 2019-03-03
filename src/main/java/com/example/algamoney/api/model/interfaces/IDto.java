package com.example.algamoney.api.model.interfaces;

import java.time.LocalDate;

public interface IDto {
	Long getCodigo();
	String getNome();
	String getDescricao();
	LocalDate getDataVencimento();
}
