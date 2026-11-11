package com.delivery.ocp;

import com.delivery.srp.Pedido;

public class ProcessadorPagamento {

    public boolean processar(Pedido pedido, FormaPagamento formaPagamento) {
        double valor = pedido.calcularTotal();
        boolean sucesso = formaPagamento.processar(valor);

        if (sucesso) {
            pedido.setStatus("PAGO");
            System.out.println("Pedido #" + pedido.getId() + " pago via " + formaPagamento.getNomeMetodo());
        } else {
            System.out.println("Nao foi possivel concluir o pagamento do pedido #" + pedido.getId());
        }

        return sucesso;
    }
}
