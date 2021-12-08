package br.com.zup.academy.contadigital.extrato;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransacaoRepository extends PagingAndSortingRepository<Transacao, Long> {
    List<Transacao> findFirst20ByIdClienteOrderByDataDesc(Long idCliente);
}
