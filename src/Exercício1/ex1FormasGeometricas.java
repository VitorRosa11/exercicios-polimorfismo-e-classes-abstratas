
package Exercício1;

public class ex1FormasGeometricas {
    
    public static void main(String[] args) {
        
         FormaGeometrica f1 = new Circulo(5);
        FormaGeometrica f2 = new Retangulo(4, 6);
        FormaGeometrica f3 = new Triangulo(3, 8);

        System.out.println("Área do círculo: " + f1.calcularArea());
        System.out.println("Área do retângulo: " + f2.calcularArea());
        System.out.println("Área do triângulo: " + f3.calcularArea());
    }
}
