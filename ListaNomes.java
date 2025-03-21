package exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaNomes {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Mariana");
        nomes.add("Doriana");
        nomes.add("Ariana");
        nomes.add("Luciana");
        
        for ( nome : nomes) {
            if (nome.startsWith("A")) { 
                nomes.remove(nome);
            }
        }
        
        System.out.println(nomes);
    }
}

