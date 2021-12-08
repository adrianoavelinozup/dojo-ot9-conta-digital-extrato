package br.com.zup.academy.contadigital.extrato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/transacoes")
public class TransacaoController {
    @Autowired
    private TransacaoRepository repository;

    @GetMapping("/{idCliente}")
    public ResponseEntity<?> consultar(@PathVariable Long idCliente) {
        List<Transacao> transacoes = repository.findFirst20ByIdClienteOrderByDataDesc(idCliente);
        return ResponseEntity.ok(transacoes.stream().map(TransacaoResponse::new));
    }
}
