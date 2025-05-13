public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "Harry Potter e a Pedra Filosofal";
        filme1.genero = "Fantasia";
        filme1.ano = 2001;
        filme1.duracao = "2h 32m";
        filme1.sinopse = "Harry Potter descobre que é um bruxo e vai para a escola de magia Hogwarts.";
        filme1.incluidoNoPlano = true;



        filme1.exibirDados();
        filme1.avalia(9.0);
        filme1.avalia(6.0);
        filme1.avalia(8.0);
        System.out.println(filme1.somaAvaliacoes);
        System.out.println(filme1.totalDeAvaliacoes);
        System.out.println(filme1.pegaMedia());
    }
}