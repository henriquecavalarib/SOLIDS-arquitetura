package com.delivery;

import com.delivery.dip.*;
import com.delivery.isp.*;
import com.delivery.lsp.*;
import com.delivery.ocp.*;
import com.delivery.srp.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== ATIVIDADE PRATICA SOLID ===");
        System.out.println();

        // 1. Single Responsibility Principle (SRP)
        System.out.println("1. Testando SRP:");
        Pedido pedido = new Pedido(1, "Henrique");
        pedido.adicionarItem(new ItemPedido("Pizza Calabresa", 45.0, 1));
        pedido.adicionarItem(new ItemPedido("Coca-Cola 2L", 12.0, 1));

        PedidoRepository repo = new PedidoRepository();
        repo.salvar(pedido);

        PedidoViewer viewer = new PedidoViewer();
        viewer.exibir(pedido);
        System.out.println();

        // 2. Open/Closed Principle (OCP)
        System.out.println("2. Testando OCP:");
        ProcessadorPagamento processador = new ProcessadorPagamento();

        Pedido pCartao = new Pedido(2, "Joao");
        pCartao.adicionarItem(new ItemPedido("Hamburguer", 28.0, 1));
        processador.processar(pCartao, new PagamentoCartao("credito"));

        Pedido pPix = new Pedido(3, "Maria");
        pPix.adicionarItem(new ItemPedido("Pizza", 50.0, 1));
        processador.processar(pPix, new PagamentoPix("maria@email.com"));

        Pedido pDinheiro = new Pedido(4, "Carlos");
        pDinheiro.adicionarItem(new ItemPedido("Bebida", 10.0, 1));
        processador.processar(pDinheiro, new PagamentoDinheiro(20.0));
        System.out.println();

        // 3. Liskov Substitution Principle (LSP)
        System.out.println("3. Testando LSP:");
        List<Produto> cardapio = new ArrayList<>();
        cardapio.add(new Pizza("Mussarela", 40.0, "grande", true));
        cardapio.add(new Hamburguer("X-Bacon", 25.0, true, true));
        cardapio.add(new Bebida("Suco de Laranja", 8.0, 500, true));

        for (Produto p : cardapio) {
            System.out.println(p);
        }
        System.out.println();

        // 4. Interface Segregation Principle (ISP)
        System.out.println("4. Testando ISP:");
        GerenciadorPedidos balcao = new ServicoOperacionalPedidos();
        balcao.criarPedido(pedido);

        GerenciadorEntregas entrega = new ServicoLogistica();
        entrega.despachar(1, "Rua Quintino Bocaiuva, 45");
        entrega.atualizarStatus(1, "A caminho");

        GeradorRelatorio financeiro = new ServicoAdministrativo();
        financeiro.gerarRelatorioVendas();
        System.out.println();

        // 5. Dependency Inversion Principle (DIP)
        System.out.println("5. Testando DIP:");
        NotificacaoService notificacao = new NotificacaoService(new NotificacaoEmail());
        notificacao.notificar("henrique@email.com", "Seu pedido foi confirmado!");

        // Trocando o canal de notificacao em tempo de execucao
        notificacao.setCanal(new NotificacaoSMS());
        notificacao.notificar("43999998888", "O motoboy saiu para entrega.");

        notificacao.setCanal(new NotificacaoWhatsApp());
        notificacao.notificar("43999998888", "Pedido entregue, bom apetite!");
    }
}
