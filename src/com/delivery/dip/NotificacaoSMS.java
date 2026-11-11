package com.delivery.dip;

public class NotificacaoSMS implements CanalNotificacao {

    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando SMS para " + destinatario + ": " + mensagem);
    }
}
