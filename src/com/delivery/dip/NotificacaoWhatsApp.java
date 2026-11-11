package com.delivery.dip;

public class NotificacaoWhatsApp implements CanalNotificacao {

    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando WhatsApp para " + destinatario + ": " + mensagem);
    }
}
