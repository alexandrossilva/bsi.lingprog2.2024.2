package aula10;

public class Morador {

	private String nome;
	private int numeroUnidade;
	private int quantidadeResidentesUnidade;
	private int numeroVotacao;
	private int votos;
    
    public Morador(String nome, int numeroUnidade, int quantidadeResidentesUnidade, int numeroVotacao) {
        this.nome = nome;
        this.numeroUnidade = numeroUnidade;
        this.quantidadeResidentesUnidade = quantidadeResidentesUnidade;
        this.numeroVotacao = numeroVotacao;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroUnidade() {
        return numeroUnidade;
    }

    public int getQuantidadeResidentesUnidade() {
        return quantidadeResidentesUnidade;
    }

    public int getNumeroVotacao() {
        return numeroVotacao;
    }

    public int getVotos() {
        return votos;
    }

    public void adicionarVoto() {
        this.votos = this.votos + 1;
    }
	
}