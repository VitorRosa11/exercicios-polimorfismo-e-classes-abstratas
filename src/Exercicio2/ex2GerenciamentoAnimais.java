
package Exercicio2;


public class ex2GerenciamentoAnimais {
    
    public static void main(String[] args) {
        
        Animal[] animais = {new Cachorro(), new Gato(), new Passaro()};

        for (Animal a : animais) {
            a.emitirSom();
            a.mover();
            System.out.println();
        }
    }
}
