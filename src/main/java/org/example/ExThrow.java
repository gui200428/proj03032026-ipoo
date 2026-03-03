package org.example;

public class ExThrow {

    static void validarIdade(int idade){
        if(idade <= 10){
            throw new IllegalArgumentException("Idade minima é 18 anos");
        }
        System.out.println("Acesso liberado");
    }

    public static void main(String[] args) {
        validarIdade(10);
    }
}
