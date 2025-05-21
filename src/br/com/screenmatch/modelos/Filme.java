package br.com.screenmatch.modelos;

public class Filme{
    public String nome;
    public String genero;
    public int ano;
    public String duracao;
    public String sinopse;
    public boolean incluidoNoPlano;
    public double nota;
    private int totalDeAvaliacoes;
    private double somaAvaliacoes;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    //metodos
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Duração: " + duracao);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
        System.out.println("Nota: " + nota);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
        this.nota = somaAvaliacoes / totalDeAvaliacoes;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}