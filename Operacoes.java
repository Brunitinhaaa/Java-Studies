package exercicios;
public class Operacoes {
   
    int a = 10;
    double b = 20.5;
    boolean c = true;

    void somar () {
        System.out.println("Soma de a e b: "+(a+b));
    }

    void multiplicar () {
        System.out.println("Multiplicação de a e b: "+(a*b));
    }

    void inverter () {
        System.out.println("Valor invertido de c: "+(!c));
    }

    public static void main(String[] args) {
        Operacoes conta = new Operacoes();
        conta.somar();
        conta.multiplicar();
        conta.inverter();
    }
    
}
