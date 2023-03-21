package org.example;

public class MetodosString {
    public void executar() {
        String nome = "Cailan";
        String sobrenome = " Soares Grott";
        String empty = "";
        String equalsFalse = "Soares Grott";
        String equalsTrue = " Soares Grott";
        int idade = 20;

        System.out.println(nome.toLowerCase().concat(sobrenome.toLowerCase()));
        System.out.println((nome + sobrenome).toUpperCase());
        System.out.println(nome.subSequence(1,4));
        System.out.println(empty.isEmpty());
        System.out.println(equalsFalse.equals(sobrenome));
        System.out.println(equalsTrue.equalsIgnoreCase(sobrenome));
        System.out.println(nome.codePointCount(0, 6));
        System.out.println(nome.contains("ca"));
        System.out.println(nome.replaceAll(nome, "Calian"));
        System.out.println(nome.length());
        System.out.println(nome.charAt(5));
        System.out.println(nome.charAt(nome.length()-1));

    }
}