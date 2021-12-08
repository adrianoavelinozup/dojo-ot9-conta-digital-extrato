package br.com.zup.academy.contadigital.extrato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/transacoes")
public class TransacaoController {
    @Autowired
    private TransacaoRepository repository;

    @GetMapping("/{idCliente}")
    public ResponseEntity<?> consultar(@PathVariable Long idCliente, Pageable pageable) {
        Page<Transacao> transacoes = repository.findByIdCliente(idCliente, pageable);
        return ResponseEntity.ok(transacoes.map(TransacaoResponse::new));
    }
}
