package com.example.algamoney.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.model.interfaces.IDto;
import com.example.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

	@Query(value = "SELECT api.codigo, p.nome, api.descricao, api.data_vencimento FROM ALGAMONEYAPI.lancamento as api\n" + 
			"INNER JOIN ALGAMONEYAPI.pessoa as p ON api.codigo_pessoa = p.codigo  where api.codigo_pessoa = :codigoPessoa" , nativeQuery = true)
	List<IDto> buscarDadosIDto(@Param("codigoPessoa") Long codigoPessoa);
}
