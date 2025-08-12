package br.com.pblcnr.seraquepaguei.model;

import java.time.LocalDate;

public class Conta {
    private String nome;
    private LocalDate dataVencimento;
    private double valor;
    private boolean isPaga;

    public Conta() {

    }

    public Conta(String nome, int ano, int mes, int dia, Double valor) {
        setNome(nome);
        setDataVencimento(LocalDate.of(ano, mes, dia));
        setValor(valor);
        setPaga(false);
    }

    public void marcarComoPaga() {
        setPaga(true);
    }

    @Override
    public String toString() {
        return "Conta: " + getNome() +
                "\nValor: " + getValor() +
                "\nData de Vencimento: " + getDataVencimento() +
                "\nSituação: " + getPaga();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O nome da conta não pode ser vazio.");
        }
        this.nome = nome;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor da conta não pode ser negativo.");
        }
        this.valor = valor;
    }

    public boolean getPaga() {
        return isPaga;
    }

    public void setPaga(boolean paga) {
        this.isPaga = paga;
    }
}
