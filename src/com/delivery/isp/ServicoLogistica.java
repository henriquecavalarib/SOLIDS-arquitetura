package com.delivery.isp;

public class ServicoLogistica implements GerenciadorEntregas {

    @Override
    public void despachar(int pedidoId, String endereco) {
        System.out.println("Despachando pedido #" + pedidoId + " para o endereco: " + endereco);
    }

    @Override
    public void atualizarStatus(int pedidoId, String status) {
        System.out.println("Status da entrega #" + pedidoId + ": " + status);
    }
}
