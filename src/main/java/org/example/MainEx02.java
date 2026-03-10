
/*
2. Faça um método calcularMedia(int a, int b) que:
o lance IllegalArgumentException se algum for negativo
*/
import java.util.Scanner;

public class MainEx02 {
    static double calcularMedia(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Não colocar valores negativos!");
        }
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("Digite um número:");
        a = input.nextInt();
        System.out.println("Digite mais um número:");
        b = input.nextInt();

        System.out.println("O resultado é: " + calcularMedia(a, b));
    }
}
