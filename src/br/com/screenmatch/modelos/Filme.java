package br.com.screenmatch.modelos;

public class Filme{
    private String nome;
    private String genero;
    private int ano;
    private String duracao;
    private String sinopse;
    private boolean incluidoNoPlano;
    private double nota;
    private int totalDeAvaliacoes;
    private double somaAvaliacoes;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setNota(double nota) {
        this.nota = nota;
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