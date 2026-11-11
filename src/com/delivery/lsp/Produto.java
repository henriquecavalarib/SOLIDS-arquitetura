package com.delivery.lsp;

public abstract class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPrecoFinal();

    public abstract String getDescricao();

    @Override
    public String toString() {
        return nome + " - Total: R$ " + calcularPrecoFinal() + " (" + getDescricao() + ")";
    }
}
