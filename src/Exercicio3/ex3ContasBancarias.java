
package Exercicio3;

public class ex3ContasBancarias {
    
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente(500, 200);
        ContaBancaria cp = new ContaPoupanca(1000);

        cc.depositar(200);
        cc.sacar(800);

        cp.depositar(300);
        cp.sacar(1500);
    }
    
}
