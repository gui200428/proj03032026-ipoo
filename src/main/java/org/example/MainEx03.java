
/*
3. Crie uma exceção SenhaFracaException e valide:
o mínimo 8 caracteres
o deve ter pelo menos 1 número
*/
import java.util.Scanner;

public class MainEx03 {
    static void validarSenha(String senha) throws SenhaFracaException {
        if (senha.length() < 8) {
            throw new SenhaFracaException("Senha menor que 8 caracteres!");
        }
        if (!senha.matches(".*[0-9].*")) {
            throw new SenhaFracaException("Deve conter pelo menos 1 número!");
        }
        System.out.println("Senha válida!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senha;
        System.out.println("Digite a senha: ");
        senha = input.nextLine();
        try {
            validarSenha(senha);
        } catch (SenhaFracaException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Fechando o programa...");
        }
    }
}
