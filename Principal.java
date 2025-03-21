package exercicios;
public class Principal {
    public static void main(String[] args) {

    Animal animal01 = new Animal("Blue", 11);
        System.out.println(animal01.getNome() + ", " + animal01.getIdade() + " anos" );
        animal01.emitirSom();

    Cachorro Pipoca = new Cachorro("Pipoca", 3);
    System.out.println(Pipoca.getNome() + ", " + Pipoca.getIdade() + " anos" );
    Pipoca.emitirSom();

    Gato Mabel = new Gato("Mabel", 1);
    System.out.println(Mabel.getNome() + ", " + Mabel.getIdade() + " anos" );
    Mabel.emitirSom();
    }
}

