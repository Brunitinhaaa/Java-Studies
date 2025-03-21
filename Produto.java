package exercicios;
public class Produto {
    
    String nome;
    double preco;
    int quantidade;

    void calcularValorTotal() {
        System.out.println("Valor total em estoque do " + nome +": R$" + preco);
    }

    public static void main(String[] args) {

        Produto informacoes = new Produto();
        informacoes.nome = "Guaraná Jesus";
        informacoes.preco = 5.99;
        informacoes.quantidade = 7;
        informacoes.calcularValorTotal();

        Produto informacoes1 = new Produto();
        informacoes1.nome = "Dollynho seu amiguinho";
        informacoes1.preco = 5.49;
        informacoes1.quantidade = 25;
        informacoes1.calcularValorTotal();

    }
}
