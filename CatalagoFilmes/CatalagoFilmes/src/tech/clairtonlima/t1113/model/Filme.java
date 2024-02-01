package tech.clairtonlima.t1113.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Filme {
    private String nome;
    private LocalDate dataLancamento;
    private BigDecimal orcamento;
    private  String descricao;
    private List<Ator> atores;
    private List<Diretor> diretores;

}
