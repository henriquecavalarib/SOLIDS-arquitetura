package com.delivery.lsp;

public class Bebida extends Produto {
    private int volumeMl;
    private boolean gelada;

    public Bebida(String nome, double precoBase, int volumeMl, boolean gelada) {
        super(nome, precoBase);
        this.volumeMl = volumeMl;
        this.gelada = gelada;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase;
    }

    @Override
    public String getDescricao() {
        return volumeMl + "ml (" + (gelada ? "gelada" : "natural") + ")";
    }
}
