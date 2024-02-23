package model.ator;

public class Diretor {
    private String nome;
    private int idade;
    private String nacionalidade;

  
    public Diretor() {
		super();
	}

	public Diretor(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}
