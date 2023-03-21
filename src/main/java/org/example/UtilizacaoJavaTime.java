package org.example;

import java.time.LocalDate;
import java.time.Month;

public class UtilizacaoJavaTime {
    public void executar(){
        LocalDate dataNascimento = LocalDate.of(2002, Month.AUGUST, 28);
        System.out.println("Ano data nascimento: " + dataNascimento.getYear());
        System.out.println("Mes data nascimento: " + dataNascimento.getMonth());
        System.out.println("Dia data nascimento: " + dataNascimento.getDayOfMonth());
        System.out.println("Dia da semana do nascimento: " + dataNascimento.getDayOfWeek());
        System.out.println("Dia do ano do nascimento: " + dataNascimento.getDayOfYear());

    }
}
