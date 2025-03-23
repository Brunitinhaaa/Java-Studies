package exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaNomes {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Mariana");
        nomes.add("Doriana");
        nomes.add("Ariana");
        nomes.add("Luciana");
        
        List<String> nomesFiltrados = new ArrayList<>();
        for (String nome : nomes) {
            if (!nome.startsWith("A")) { 
                nomesFiltrados.add(nome);
            }
        }

        System.out.println(nomesFiltrados);
    }
}

