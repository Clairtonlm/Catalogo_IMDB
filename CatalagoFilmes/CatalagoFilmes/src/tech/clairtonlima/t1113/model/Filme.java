package tech.clairtonlima.t1113.model;


import java.util.List;


class Filme {
    private String nome;
    private String dataLancamento;
    private String orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores;

    public Filme(String nome, String dataLancamento, String orcamento, String descricao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.diretor = null;
        this.atores = new ArrayList<>();
    }

    public void associarDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public void associarAtor(Ator ator) {
        this.atores.add(ator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome)
                .append("\nData de Lançamento: ").append(dataLancamento)
                .append("\nOrçamento: ").append(orcamento)
                .append("\nDescrição: ").append(descricao)
                .append("\nDiretor: ").append(diretor)
                .append("\nAtores: ");
        for (Ator ator : atores) {
            sb.append(ator).append(", ");
        }
        return sb.toString();
    }
}