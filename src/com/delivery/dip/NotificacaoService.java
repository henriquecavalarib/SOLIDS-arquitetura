package com.delivery.dip;

public class NotificacaoService {
    private CanalNotificacao canal;

    public NotificacaoService(CanalNotificacao canal) {
        this.canal = canal;
    }

    public void setCanal(CanalNotificacao canal) {
        this.canal = canal;
    }

    public void notificar(String destinatario, String mensagem) {
        canal.enviar(destinatario, mensagem);
    }
}
