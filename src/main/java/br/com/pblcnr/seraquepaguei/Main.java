package br.com.pblcnr.seraquepaguei;

import br.com.pblcnr.seraquepaguei.model.Conta;

public class Main {
    public static void main(String[] args) {
        try {
            Conta agua = new Conta("Agua", 2025, 7, 10, 156.2);
            Conta luz = new Conta("Luz", 2025, 8, 15, 60.0);
            Conta internet = new Conta("Internet", 2025, 4, 5, 149.9);

            System.out.println("Testando conta inválida.");
            Conta conta = new Conta();
            conta.setNome("");
            conta.setValor(-10);

            System.out.println("Testando contas válidas.");
            agua.marcarComoPaga();
            System.out.println(agua);
            System.out.println(luz);
            System.out.println(internet);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
