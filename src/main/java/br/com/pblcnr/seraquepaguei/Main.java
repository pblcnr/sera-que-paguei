package br.com.pblcnr.seraquepaguei;

import br.com.pblcnr.seraquepaguei.model.Conta;
import br.com.pblcnr.seraquepaguei.service.GerenciadorConta;

public class Main {
    public static void main(String[] args) {
        try {
            Conta agua = new Conta("Agua", 2025, 7, 10, 156.2);
            Conta luz = new Conta("Luz", 2025, 8, 15, 60.0);
            Conta internet = new Conta("Internet", 2025, 4, 5, 149.9);
            GerenciadorConta listaDeContas = new GerenciadorConta();

//            System.out.println("Testando conta inválida.");
//            Conta conta = new Conta();
//            conta.setNome("");
//            conta.setValor(-10);

//            System.out.println("Testando contas válidas.");
//            agua.marcarComoPaga();
//            System.out.println(agua);
//            System.out.println(luz);
//            System.out.println(internet);

            listaDeContas.adicionarConta(agua);
            listaDeContas.adicionarConta(luz);
            listaDeContas.adicionarConta(internet);
//
//            System.out.println(listaDeContas.getListaContas());

            // Testando busca
            System.out.println(listaDeContas.buscarContaPorNome("internet"));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
