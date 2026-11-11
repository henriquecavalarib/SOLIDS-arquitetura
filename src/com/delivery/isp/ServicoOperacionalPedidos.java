package com.delivery.isp;

import com.delivery.srp.Pedido;

public class ServicoOperacionalPedidos implements GerenciadorPedidos {

    @Override
    public void criarPedido(Pedido pedido) {
        System.out.println("Criando pedido #" + pedido.getId() + " para " + pedido.getCliente());
    }

    @Override
    public void cancelarPedido(int pedidoId) {
        System.out.println("Cancelando pedido #" + pedidoId);
    }
}
