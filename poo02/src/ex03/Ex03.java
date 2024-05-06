/*3) Escrever uma classe que implemente uma lâmpada de três estados: apagada, acesa ou meia-luz.*/

//Gabriel Apolinário Fabrício
package ex03;

public class Ex03 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.apagar();
        System.out.println("Estado: " + lampada.getEstado());

        lampada.acender();
        System.out.println("Estado: " + lampada.getEstado());

        lampada.meiaLuz();
        System.out.println("Estado: " + lampada.getEstado());
    }
}
