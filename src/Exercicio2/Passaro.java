
package Exercicio2;


public class Passaro extends Animal{
    
     @Override
    public void emitirSom() {
        System.out.println("P�ssaro: Piu Piu!");
    }

    @Override
    public void mover() {
        System.out.println("P�ssaro voando...");
    }
}
