package exercicios;
public class Pessoa {
    
    String nome;
    int idade;

    void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {

        Pessoa informacoes2 = new Pessoa();
        informacoes2.nome = "Mariazinha";
        informacoes2.idade = 21;
        informacoes2.mostrarInformacoes();

        Pessoa informacoes3 = new Pessoa();
        informacoes3.nome = "Jubileu";
        informacoes3.idade = 75;
        informacoes3.mostrarInformacoes();
    }
}