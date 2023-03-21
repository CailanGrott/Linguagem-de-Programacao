package org.example;

import java.util.ArrayList;
import java.util.List;

public class ImplementacaoJavaList {
    public void executar() {

        List<String> marketList = new ArrayList<String>();

        System.out.println(marketList.add("Leite"));
        System.out.println(marketList.add("Pão"));
        System.out.println(marketList.add("Arroz"));
        System.out.println(marketList.add("Queijo"));
        System.out.println("Tamanho da minha lista: " + marketList.size());
        marketList.remove(1);

        if (marketList.contains("Feijão")) {
            System.out.println("Contém na lista");
        } else {
            System.out.println("Não contém na lista");
        }

        if (marketList.size() > 2) {
            marketList.clear();
        }
        System.out.println("Tamanho da minha lista: " + marketList.size());

    }
}
