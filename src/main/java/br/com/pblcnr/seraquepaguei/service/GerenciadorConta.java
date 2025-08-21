package br.com.pblcnr.seraquepaguei.service;

import br.com.pblcnr.seraquepaguei.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorConta {
    private List<Conta> listaContas;

    public GerenciadorConta() {
        this.listaContas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        listaContas.add(conta);
    }

    public Conta buscarContaPorNome(String nome) {
        for (Conta conta : listaContas) {
            if (conta.getNome().equalsIgnoreCase(nome)) {
                return conta;
            }
        }
        return null;
    }

    public boolean removerConta(String nome) {
        Conta conta = buscarContaPorNome(nome);
        if (conta != null) {
            listaContas.remove(conta);
            return true;
        }
        return false;
    }

    public List<Conta> listarContasPendentes() {
        List<Conta> contasPendentes = new ArrayList<>();
        for (Conta conta : listaContas) {
            if (!conta.getPaga()) {
                contasPendentes.add(conta);
            }
        }
        return contasPendentes;
    }

    public int contarContasPagas() {
        int contasPagas = 0;
        for (Conta conta : listaContas) {
            if (conta.getPaga()) {
                contasPagas++;
            }
        }
        return contasPagas;
    }

    public List<Conta> getListaContas() {
        return listaContas;
    }
}
