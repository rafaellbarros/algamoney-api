package com.example.algamoney.api.dto;

import java.math.BigDecimal;

import com.example.algamoney.api.model.Categoria;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LancamentoEstatisticaCategoria {

	private Categoria categoria;
	private BigDecimal total;
}
