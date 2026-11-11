package com.delivery.ocp;

public class PagamentoCartao implements FormaPagamento {
    private String tipo; // credito ou debito

    public PagamentoCartao(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean processar(double valor) {
        System.out.println("Processando R$ " + valor + " no cartao de " + tipo + "... Aprovado!");
        return true;
    }

    @Override
    public String getNomeMetodo() {
        return "Cartao (" + tipo + ")";
    }
}
