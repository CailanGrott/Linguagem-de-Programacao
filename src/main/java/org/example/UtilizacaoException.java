package org.example;

public class UtilizacaoException {


    public void executar () {
        try {
            int resultado = dividir(10, 0);
        } catch (Exception e) {
            System.out.println("Ocorreu uma exceção: " + e.getMessage());
        }
    }

    public static int dividir(int numerador, int denominador) throws Exception {
        if (denominador == 0) {
            throw new Exception("Não é possível dividir por zero");
        }
        return numerador / denominador;
    }
}
