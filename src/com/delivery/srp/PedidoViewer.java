package com.delivery.srp;

public class PedidoViewer {

    public void exibir(Pedido pedido) {
        if (pedido == null) {
            System.out.println("Pedido nao encontrado.");
            return;
        }

        System.out.println("--- Resumo do Pedido #" + pedido.getId() + " ---");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Status: " + pedido.getStatus());
        System.out.println("Itens:");
        for (ItemPedido item : pedido.getItens()) {
            System.out.println(" - " + item.getNome() + " x" + item.getQuantidade() + " = R$ " + item.getSubtotal());
        }
        System.out.println("Total: R$ " + pedido.calcularTotal());
    }
}
