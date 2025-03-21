package exercicios;

public class SomarArray {
    
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int soma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }
        
        System.out.println(soma);
    }
}

