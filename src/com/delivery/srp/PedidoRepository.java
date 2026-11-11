package com.delivery.srp;

import java.util.HashMap;
import java.util.Map;

public class PedidoRepository {
    private Map<Integer, Pedido> pedidos = new HashMap<>();

    public void salvar(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
        System.out.println("Pedido #" + pedido.getId() + " salvo no banco de dados.");
    }

    public Pedido buscarPorId(int id) {
        return pedidos.get(id);
    }
}
