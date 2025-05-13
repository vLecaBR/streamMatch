public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "Harry Potter e a Pedra Filosofal";
        filme1.genero = "Fantasia";
        filme1.ano = 2001;
        filme1.duracao = "2h 32m";
        filme1.sinopse = "Harry Potter descobre que é um bruxo e vai para a escola de magia Hogwarts.";
        filme1.incluidoNoPlano = true;
        filme1.nota = 8.6;
        filme1.totalDeAvaliacoes = 1000;

        filme1.exibirDados();

    }
}