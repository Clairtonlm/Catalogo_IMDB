package tech.clairtonlima.t1113.model;

public class Main {
    public static void main(String[] args) {
        SistemaCatalogo sistema = new SistemaCatalogo();

        // Cadastro de filmes
        sistema.cadastrarFilme("O Poderoso Chefão", "24/03/1972", "$6.2 milhões", "Um drama criminal sobre a família Corleone.");

        // Cadastro de atores
        sistema.cadastrarAtor("Marlon Brando", "03/04/1924");

        // Cadastro de diretores
        sistema.cadastrarDiretor("Francis Ford Coppola", "07/04/1939");

        // Associação de diretor ao filme
        Filme filme = sistema.pesquisarFilme("O Poderoso Chefão");
        Diretor diretor = sistema.pesquisarDiretor("Francis Ford Coppola");
        sistema.associarDiretorAFilme(filme, diretor);

        // Associação de ator ao filme
        Ator ator = sistema.pesquisarAtor("Marlon Brando");
        sistema.associarAtorAFilme(filme, ator);

        // Pesquisa de filme
        Filme filmePesquisado = sistema.pesquisarFilme("Poderoso Chefão");
        if (filmePesquisado != null) {
            System.out.println(filmePesquisado);
        } else {
            System.out.println("Filme não encontrado.");
        }
    }
}
