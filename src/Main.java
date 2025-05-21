import br.com.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Harry Potter e a Pedra Filosofal");
        filme1.setGenero("Fantasia");
        filme1.setAno(2001);
        filme1.setDuracao("2h 32m");
        filme1.setSinopse("Harry Potter descobre que é um bruxo e vai para a escola de magia Hogwarts.");
        filme1.setIncluidoNoPlano(true);
        


        filme1.exibirDados();
        filme1.avalia(9.0);
        filme1.avalia(6.0);
        filme1.avalia(8.0);
        System.out.println(filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.pegaMedia());
    }
}