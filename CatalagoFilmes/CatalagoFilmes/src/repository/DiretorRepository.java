package repository;

import java.util.List;

import model.ator.Diretor;

public interface DiretorRepository {
    public Diretor inserir(Diretor diretor);

    public Diretor atualizar(Diretor diretor);

    public Diretor excluir(Diretor diretor);

    public List<Diretor> pesquisarPorNome(String nome);
}
