package exercicios;

import java.util.ArrayList;

public class RmvPares {
        public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        ArrayList<Integer> impares = new ArrayList<>();

        for (int num : numeros) {
            if (num % 2 != 0) { 
                impares.add(num);
            }
        }

        System.out.println(impares);
    }
}
