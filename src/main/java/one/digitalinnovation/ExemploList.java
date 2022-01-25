package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Junior");
        nomes.add("Maria");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(2, "Larissa");
        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Junior");
        System.out.println(nomes);

        String nome = nomes.get(3);
        System.out.println(nome);

        int t = nomes.size();
        System.out.println(t);

        boolean b = nomes.contains("Anderson");
        System.out.println(b);

        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

        int posicao = nomes.indexOf("Anderson");
        System.out.println(posicao);

//        nomes.clear();
//        System.out.println(nomes);

        for (String nomeItem : nomes) {
            System.out.println(nomeItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("--->" + iterator.next());
        }


    }

    

}
