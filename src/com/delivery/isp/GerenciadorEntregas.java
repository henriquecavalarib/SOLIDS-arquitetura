package com.delivery.isp;

public interface GerenciadorEntregas {
    void despachar(int pedidoId, String endereco);
    void atualizarStatus(int pedidoId, String status);
}
