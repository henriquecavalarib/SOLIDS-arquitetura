package com.delivery.lsp;

public class Hamburguer extends Produto {
    private boolean carneDupla;
    private boolean queijoExtra;

    public Hamburguer(String nome, double precoBase, boolean carneDupla, boolean queijoExtra) {
        super(nome, precoBase);
        this.carneDupla = carneDupla;
        this.queijoExtra = queijoExtra;
    }

    @Override
    public double calcularPrecoFinal() {
        double valor = precoBase;
        if (carneDupla) valor += 7.0;
        if (queijoExtra) valor += 3.5;
        return valor;
    }

    @Override
    public String getDescricao() {
        String desc = "Hamburguer artesanal";
        if (carneDupla) desc += " + carne dupla";
        if (queijoExtra) desc += " + queijo extra";
        return desc;
    }
}
