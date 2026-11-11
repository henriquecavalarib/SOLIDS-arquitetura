package com.delivery.ocp;

public class PagamentoPix implements FormaPagamento {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean processar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " confirmado via PIX (chave: " + chavePix + ").");
        return true;
    }

    @Override
    public String getNomeMetodo() {
        return "PIX";
    }
}
