package com.delivery.isp;

public class ServicoAdministrativo implements GeradorRelatorio {

    @Override
    public void gerarRelatorioVendas() {
        System.out.println("Relatorio de vendas do dia: 25 pedidos atendidos.");
    }
}
