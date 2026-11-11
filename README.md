# Atividade - Principios SOLID

Implementacao dos cinco principios SOLID aplicados a um cenario de delivery de restaurante em Java.

Aluno: Henrique Cavalari

## Como os principios foram aplicados

### 1. Single Responsibility Principle (SRP)
O fluxo do pedido foi separado em tres classes, cada uma com uma responsabilidade:
- `Pedido`: cuida apenas dos dados do pedido e de calcular o total.
- `PedidoRepository`: cuida apenas de salvar e buscar os pedidos.
- `PedidoViewer`: cuida apenas de exibir as informacoes do pedido no terminal.

### 2. Open/Closed Principle (OCP)
Para os pagamentos, criamos a interface `FormaPagamento`.
- As classes `PagamentoCartao`, `PagamentoPix` e `PagamentoDinheiro` implementam essa interface.
- A classe `ProcessadorPagamento` apenas recebe a interface e chama o metodo de processar, sem precisar de if/else para verificar o tipo de pagamento. Para adicionar outra forma no futuro (ex: vale refeicao), basta criar outra classe implementando a interface.

### 3. Liskov Substitution Principle (LSP)
Criamos a classe abstrata `Produto` e as subclasses `Pizza`, `Hamburguer` e `Bebida`.
- Cada subclasse implementa suas proprias regras para calcular preco e montar a descricao (como adicionais de carne ou tamanho da pizza).
- Todas as subclasses podem ser tratadas como `Produto` em qualquer lista ou metodo sem que ocorra nenhum erro ou comportamento inesperado.

### 4. Interface Segregation Principle (ISP)
Em vez de criar uma interface gigante com metodos que nem todo mundo usa, separamos em interfaces menores:
- `GerenciadorPedidos`: metodos para criar e cancelar pedidos.
- `GerenciadorEntregas`: metodos para despachar e atualizar status da entrega.
- `EnviadorNotificacao`: metodo para enviar mensagens.
- `GeradorRelatorio`: metodo para gerar relatorio.

Dessa forma, classes como `ServicoLogistica` implementam apenas o que tem a ver com entrega, sem precisar implementar metodos de relatorio ou pedidos.

### 5. Dependency Inversion Principle (DIP)
O envio de notificacoes foi desacoplado usando a interface `CanalNotificacao`.
- As classes `NotificacaoEmail`, `NotificacaoSMS` e `NotificacaoWhatsApp` implementam a interface.
- A classe `NotificacaoService` nao cria instancias com `new NotificacaoEmail()`, ela recebe a interface pelo construtor ou por setter. Com isso, o canal de envio pode ser trocado a qualquer momento sem mexer no codigo da classe principal.

## Como rodar o projeto

Compilar pelo terminal:
```bash
javac -d bin src/com/delivery/**/*.java src/com/delivery/*.java
```

Executar a classe Main:
```bash
java -cp bin com.delivery.Main
```
