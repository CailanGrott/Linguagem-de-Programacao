package org.example.piloto;

public class Piloto {

    private String nome;
    private String nacionalidade;

    public Piloto(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}
