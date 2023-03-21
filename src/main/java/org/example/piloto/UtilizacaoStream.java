package org.example.piloto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UtilizacaoStream {
    public void executar() {

        List<Piloto> pilotosF1 = new ArrayList<Piloto>();

        pilotosF1.add(new Piloto("Schumacher", "Alemão"));
        pilotosF1.add(new Piloto("Massa", "Brasileiro"));
        pilotosF1.add(new Piloto("Senna", "Brasileiro"));
        pilotosF1.add(new Piloto("Hamilton", "Inglês"));

        //Listar Pilotos com a letra M no nome

        List pilotosBrasileiros = new ArrayList<String>();
        for (Piloto pilotoAtual : pilotosF1) {
            if (pilotoAtual.getNacionalidade().equals("Brasileiro")) {
                pilotosBrasileiros.add(pilotoAtual);
            }
        }

        System.out.println(pilotosBrasileiros.size());

        List nomePilotos = new ArrayList<String >();
        for (Piloto pilotoAtual : pilotosF1) {
            nomePilotos.add(pilotoAtual.getNome());
        }

        System.out.println(nomePilotos);

        List<Piloto> pilotosBrasileirosStream = pilotosF1.stream()
                .filter(piloto -> piloto.getNacionalidade().equals("Brasileiros"))
                .collect(Collectors.toList());

        pilotosF1.stream().forEach(
                piloto -> System.out.println(piloto.getNome())
        );

        List<String> nascionalidadesDosPilotos = new ArrayList<>();
        for (Piloto piloto : pilotosF1) {
            nascionalidadesDosPilotos.add(piloto.getNacionalidade());
        }

        System.out.println(nascionalidadesDosPilotos);
    }
}
