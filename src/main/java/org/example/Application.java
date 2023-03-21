package org.example;

import org.example.piloto.UtilizacaoStream;

public class Application {
    public static void main(String[] args) {
        UtilizacaoStream utilizacaoStream = new UtilizacaoStream();
        UtilizacaoJavaTime utilizacaoJavaTime = new UtilizacaoJavaTime();
        MetodosString metodosString = new MetodosString();
        MetodosJavaLang metodosJavaLang = new MetodosJavaLang();
        UtilizacaoException utilizacaoException = new UtilizacaoException();
        ImplementacaoJavaList implementacaoJavaList = new ImplementacaoJavaList();

        utilizacaoStream.executar();
        utilizacaoJavaTime.executar();
        metodosString.executar();
        metodosJavaLang.executarMetodoInteger();
        metodosJavaLang.executarMetodosDaClasseBoolean();
        metodosJavaLang.executarMetodosDaClasseChar();
        metodosJavaLang.executarMetodosDaClasseDouble();
        metodosJavaLang.executarMetodosDaClasseMath();
        utilizacaoException.executar();
        implementacaoJavaList.executar();

    }
}