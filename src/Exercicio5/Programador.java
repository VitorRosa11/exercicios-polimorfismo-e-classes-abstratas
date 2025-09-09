
package Exercicio5;

public class Programador extends Funcionario{
    
        private double adicional = 1000.0;

    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + adicional;
    }

}
