
package Exercicio4;

public class PagamentoBoleto extends Pagamento{
    
    private double desconto = 0.1; 

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public double calcularValor() {
        return valor - (valor * desconto);
    }
    
}
