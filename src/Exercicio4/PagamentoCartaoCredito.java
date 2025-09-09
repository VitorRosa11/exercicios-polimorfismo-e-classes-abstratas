
package Exercicio4;

public class PagamentoCartaoCredito extends Pagamento{
    
    private double taxa = 0.05; 

    public PagamentoCartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public double calcularValor() {
        return valor + (valor * taxa);
    }
}
