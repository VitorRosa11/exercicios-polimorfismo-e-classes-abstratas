
package Exercicio5;

public class ex5SistemasFuncionarios {
    
    public static void main(String[] args) {
        
        Funcionario gerente = new Gerente("Ricardo", 5000.0);
        Funcionario programador = new Programador("Jhonathan", 4000.0);

        System.out.println(gerente.getNome() + " - Sal�rio: R$ " + gerente.calcularSalario());
        System.out.println(programador.getNome() + " - Sal�rio: R$ " + programador.calcularSalario());
    }
    
}
