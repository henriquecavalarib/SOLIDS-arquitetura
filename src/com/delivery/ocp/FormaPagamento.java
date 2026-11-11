package com.delivery.ocp;

public interface FormaPagamento {
    boolean processar(double valor);
    String getNomeMetodo();
}
