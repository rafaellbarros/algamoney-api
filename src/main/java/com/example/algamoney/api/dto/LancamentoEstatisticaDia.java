package com.example.algamoney.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.algamoney.api.model.enums.TipoLancamento;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LancamentoEstatisticaDia {

	private TipoLancamento tipo;
	private LocalDate dia;
	private BigDecimal total;
}
