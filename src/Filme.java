public class Filme{
    String nome;
    String genero;
    int ano;
    String duracao;
    String sinopse;
    boolean incluidoNoPlano;
    double nota;
    int totalDeAvaliacoes;
    double somaAvaliacoes;

    void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Duração: " + duracao);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
        System.out.println("Nota: " + nota);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
        this.nota = somaAvaliacoes / totalDeAvaliacoes;
        
    }
}