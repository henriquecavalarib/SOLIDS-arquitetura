package com.delivery.dip;

public class NotificacaoEmail implements CanalNotificacao {

    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando Email para " + destinatario + ": " + mensagem);
    }
}
