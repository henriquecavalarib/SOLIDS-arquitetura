package com.delivery.lsp;

public class Pizza extends Produto {
    private String tamanho;
    private boolean bordaRecheada;

    public Pizza(String nome, double precoBase, String tamanho, boolean bordaRecheada) {
        super(nome, precoBase);
        this.tamanho = tamanho;
        this.bordaRecheada = bordaRecheada;
    }

    @Override
    public double calcularPrecoFinal() {
        double valor = precoBase;
        if (tamanho.equalsIgnoreCase("grande")) {
            valor += 15.0;
        } else if (tamanho.equalsIgnoreCase("broto")) {
            valor -= 5.0;
        }
        if (bordaRecheada) {
            valor += 8.0;
        }
        return valor;
    }

    @Override
    public String getDescricao() {
        return "Pizza tamanho " + tamanho + (bordaRecheada ? " com borda recheada" : " sem borda recheada");
    }
}
