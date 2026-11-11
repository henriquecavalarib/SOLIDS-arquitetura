package com.delivery.ocp;

public class PagamentoDinheiro implements FormaPagamento {
    private double valorEntregue;

    public PagamentoDinheiro(double valorEntregue) {
        this.valorEntregue = valorEntregue;
    }

    @Override
    public boolean processar(double valor) {
        if (valorEntregue < valor) {
            System.out.println("Valor entregue insuficiente para pagar o pedido.");
            return false;
        }
        double troco = valorEntregue - valor;
        System.out.println("Pagamento em dinheiro recebido. Valor: R$ " + valor + " | Troco: R$ " + troco);
        return true;
    }

    @Override
    public String getNomeMetodo() {
        return "Dinheiro";
    }
}
