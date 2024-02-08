package tech.clairtonlima.t1113.model;

class SistemaCatalogo {
    private List<Filme> filmes;
    private List<Ator> atores;
    private List<Diretor> diretores;

    public SistemaCatalogo() {
        filmes = new ArrayList<>();
        atores = new ArrayList<>();
        diretores = new ArrayList<>();
    }

    public void cadastrarFilme(String nome, String dataLancamento, String orcamento, String descricao) {
        Filme filme = new Filme(nome, dataLancamento, orcamento, descricao);
        filmes.add(filme);
    }

    public void cadastrarAtor(String nome, String dataNascimento) {
        Ator ator = new Ator(nome, dataNascimento);
        atores.add(ator);
    }

    public void cadastrarDiretor(String nome, String dataNascimento) {
        Diretor diretor = new Diretor(nome, dataNascimento);
        diretores.add(diretor);
    }

    public void associarDiretorAFilme(Filme filme, Diretor diretor) {
        filme.associarDiretor(diretor);
    }

    public void associarAtorAFilme(Filme filme, Ator ator) {
        filme.associarAtor(ator);
    }

    public Filme pesquisarFilme(String nome) {
        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null;
    }
}
