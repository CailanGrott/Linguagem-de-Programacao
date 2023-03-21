package org.example;

public class MetodosJavaLang {
    public void executarMetodoInteger() {
        String numero = "10";
        int valor = Integer.parseInt(numero);
        System.out.println(valor); // saída: 10
        System.out.println(Integer.compare(valor, 5)); // saída: 1
        System.out.println(Integer.toHexString(valor)); // saída: a
        System.out.println(Integer.toBinaryString(valor)); // saída: 1010
        System.out.println(Integer.valueOf("20")); // saída: 20
    }

    public void executarMetodosDaClasseBoolean() {
        boolean valor1 = true, valor2 = false;
        System.out.println(Boolean.logicalAnd(valor1, valor2));
        System.out.println(Boolean.valueOf("true"));
        System.out.println(Boolean.valueOf("false"));
        System.out.println(Boolean.compare(valor1, valor2));
        System.out.println(Boolean.hashCode(valor1));

    }

    public void executarMetodosDaClasseChar() {
        char letra = 'a';
        System.out.println(Character.isLetter(letra));
        System.out.println(Character.isDigit(letra));
        System.out.println(Character.isLowerCase(letra));
        System.out.println(Character.toUpperCase(letra));
        System.out.println(Character.toString(letra));

    }

    public void executarMetodosDaClasseDouble() {
        double valor1 = Double.NaN, valor2 = Double.POSITIVE_INFINITY;
        System.out.println(Double.isNaN(valor1));
        System.out.println(Double.isInfinite(valor2));
        System.out.println(Double.compare(valor1, valor2));
        System.out.println(Double.longBitsToDouble(4607182418800017408L));
        System.out.println(Double.toString(valor1));

    }

    public void executarMetodosDaClasseMath() {
        double angulo = Math.PI/4;
        System.out.println(Math.abs(-10));
        System.out.println(Math.sin(angulo));
        System.out.println(Math.cos(angulo));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.random());

    }
}
