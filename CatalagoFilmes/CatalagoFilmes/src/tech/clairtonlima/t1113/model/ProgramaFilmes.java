package tech.clairtonlima.t1113.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* 1. Separe a classe Filme em uma nova classe
2. Teste novamente o programa
3. Adicione um novo atributo a classe
4. Altere o programa para pedir ao usuario esse atributo
5. Altere o programa para inserir esse atributo na instancia de Filme
* */

public class ProgramaFilmes {
    public static void main(String[] args) {
        List<Filme> listaFilmes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    inserirFilme(listaFilmes, scanner);
                    break;
                case 2:
                    editarFilme(listaFilmes, scanner);
                    break;
                case 3:
                    excluirFilme(listaFilmes, scanner);
                    break;
                case 4:
                    listarFilmes(listaFilmes);
                    break;
                case 5:
                    pesquisarFilme(listaFilmes, scanner);
                    break;
                case 6:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    static void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Inserir um filme");
        System.out.println("2. Editar um filme");
        System.out.println("3. Excluir um filme");
        System.out.println("4. Listar todos os filmes");
        System.out.println("5. Pesquisar um filme");
        System.out.println("6. Sair");
    }

    static void inserirFilme(List<Filme> listaFilmes, Scanner scanner) {
        System.out.println("Digite o ID do filme:");
        int idInserir = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha
        System.out.println("Digite o título do filme:");
        String tituloInserir = scanner.nextLine();
        listaFilmes.add(new Filme(idInserir, tituloInserir));
        System.out.println("Filme inserido com sucesso!");
    }

    static void editarFilme(List<Filme> listaFilmes, Scanner scanner) {
        System.out.println("Digite o ID do filme a ser editado:");
        int idEditar = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha
        Filme filmeEditar = encontrarFilmePorID(listaFilmes, idEditar);
        if (filmeEditar != null) {
            System.out.println("Digite o novo título do filme:");
            String novoTitulo = scanner.nextLine();
            filmeEditar.setTitulo(novoTitulo);
            System.out.println("Filme editado com sucesso!");
        } else {
            System.out.println("Filme não encontrado.");
        }
    }

    static void excluirFilme(List<Filme> listaFilmes, Scanner scanner) {
        System.out.println("Digite o ID do filme a ser excluído:");
        int idExcluir = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha
        Filme filmeExcluir = encontrarFilmePorID(listaFilmes, idExcluir);
        if (filmeExcluir != null) {
            listaFilmes.remove(filmeExcluir);
            System.out.println("Filme excluído com sucesso!");
        } else {
            System.out.println("Filme não encontrado.");
        }
    }

    static void listarFilmes(List<Filme> listaFilmes) {
        System.out.println("Lista de todos os filmes:");
        for (Filme filme : listaFilmes) {
            System.out.println(filme);
        }
    }

    static void pesquisarFilme(List<Filme> listaFilmes, Scanner scanner) {
        System.out.println("Digite a palavra-chave para pesquisar:");
        String palavraChave = scanner.nextLine();
        System.out.println("Filmes encontrados:");
        for (Filme filme : listaFilmes) {
            if (filme.getTitulo().toLowerCase().contains(palavraChave.toLowerCase())) {
                System.out.println(filme);
            }
        }
    }

    static Filme encontrarFilmePorID(List<Filme> lista, int id) {
        for (Filme filme : lista) {
            if (filme.getId() == id) {
                return filme;
            }
        }
        return null;
    }

    public static class Filme {
        private int id;
        private String titulo;

        public Filme(int id, String titulo) {
            this.id = id;
            this.titulo = titulo;
        }

        public int getId() {
            return id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Título: " + titulo;
        }
    }
}
