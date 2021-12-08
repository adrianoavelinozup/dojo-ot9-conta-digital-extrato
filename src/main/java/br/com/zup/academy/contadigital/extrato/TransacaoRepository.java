package br.com.zup.academy.contadigital.extrato;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends PagingAndSortingRepository<Transacao, Long> {
    Page<Transacao> findByIdCliente(Long idCliente, Pageable pageable);
}
