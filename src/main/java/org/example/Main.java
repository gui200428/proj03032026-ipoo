package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite um numero:\n");
            int a = sc.nextInt();

            System.out.println("Digite outro numero: \n");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Erro: Não da para dividir por zero!");
            // catch generico
        } catch (InputMismatchException ine){
            System.out.println("Digite somente numeros!");
        } catch (Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}