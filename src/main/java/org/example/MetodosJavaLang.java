package org.example;

public class MetodosJavaLang {
    public void executarMetodoInteger() {
        String quantidade = "22";
        int valorUnitario = Integer.parseInt(quantidade);
        System.out.println(valorUnitario);
        System.out.println(Integer.compare(valorUnitario, 5));
        System.out.println(Integer.toHexString(valorUnitario));
        System.out.println(Integer.toBinaryString(valorUnitario));
        System.out.println(Integer.valueOf("20"));
    }

    public void executarMetodosDaClasseBoolean() {
        boolean temLeite = true, temPão = false;
        System.out.println(Boolean.logicalAnd(temLeite, temPão));
        System.out.println(Boolean.valueOf("true"));
        System.out.println(Boolean.valueOf("false"));
        System.out.println(Boolean.compare(temLeite, temPão));
        System.out.println(Boolean.hashCode(temLeite));

    }

    public void executarMetodosDaClasseChar() {
        char letra = 'c';
        System.out.println(Character.isLetter(letra));
        System.out.println(Character.isDigit(letra));
        System.out.println(Character.isLowerCase(letra));
        System.out.println(Character.toUpperCase(letra));
        System.out.println(Character.toString(letra));

    }

    public void executarMetodosDaClasseDouble() {
        double precoProduto = Double.NaN, precoFrete = Double.POSITIVE_INFINITY;
        System.out.println(Double.isNaN(precoProduto));
        System.out.println(Double.isInfinite(precoFrete));
        System.out.println(Double.compare(precoProduto, precoFrete));
        System.out.println(Double.longBitsToDouble(4607182418800017408L));
        System.out.println(Double.toString(precoProduto));

    }

    public void executarMetodosDaClasseMath() {
        double angulo = Math.PI / 8;
        System.out.println(Math.abs(-15));
        System.out.println(Math.sqrt(50));
        System.out.println(Math.random());
        System.out.println(Math.sin(angulo));
        System.out.println(Math.cos(angulo));

    }

}
