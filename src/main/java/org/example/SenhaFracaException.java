/*
3. Crie uma exceção SenhaFracaException e valide:
o mínimo 8 caracteres
o deve ter pelo menos 1 número
*/

public class SenhaFracaException extends Exception {
    public SenhaFracaException(String msg) {
        super(msg);
    }
}
