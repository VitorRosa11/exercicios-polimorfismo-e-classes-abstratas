
package Exercicio4;

public class ex4SistemaPagamento {
    
    public static void main(String[] args) {
        
        Pagamento cartao = new PagamentoCartaoCredito(100.0);
        Pagamento boleto = new PagamentoBoleto(100.0);

        System.out.println("Pagamento no cartão de crédito: R$ " + cartao.calcularValor());
        System.out.println("Pagamento no boleto: R$ " + boleto.calcularValor());
    }
}
