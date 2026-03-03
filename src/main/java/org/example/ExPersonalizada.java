package org.example;

public class ExPersonalizada {
    static void sacar(double saldo, double valor) throws
            SaldoInsuficienteException {
        if (valor > saldo){
            throw new SaldoInsuficienteException
                    ("Saldo Insuficiente! Saldo: "+ saldo);
        }
    }
    public static void main(String[] args) {
        try{
            sacar(100, 500);
        }catch (SaldoInsuficienteException e){
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // sempre executado, se deu erro ou nao
            System.out.println("FIM");
        }
    }
}