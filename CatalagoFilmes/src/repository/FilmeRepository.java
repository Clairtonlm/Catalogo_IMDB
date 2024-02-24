package repository;

import java.util.List;

import model.ator.Filme;

public interface FilmeRepository {
    public Filme inserir(Filme filme);

    public Filme atualizar(Filme filme);

    public Filme excluir(Filme filme);

    public List<Filme> pesquisarPorNome(String nome);
}
