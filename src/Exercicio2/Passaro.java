
package Exercicio2;


public class Passaro extends Animal{
    
     @Override
    public void emitirSom() {
        System.out.println("Pássaro: Piu Piu!");
    }

    @Override
    public void mover() {
        System.out.println("Pássaro voando...");
    }
}
