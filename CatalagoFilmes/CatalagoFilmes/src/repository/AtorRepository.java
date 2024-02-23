package repository;

import java.util.List;

import model.ator.Ator;

public interface AtorRepository {
    public Ator inserir(Ator ator);

    public Ator atualizar(Ator ator);

    public Ator excluir(Ator ator);

    public List<Ator> pesquisarPorNome(String nome);
}