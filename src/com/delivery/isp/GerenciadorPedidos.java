package com.delivery.isp;

import com.delivery.srp.Pedido;

public interface GerenciadorPedidos {
    void criarPedido(Pedido pedido);
    void cancelarPedido(int pedidoId);
}
