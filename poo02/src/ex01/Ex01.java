/*1) Criar uma classe para representar uma lâmpada vendida em um supermercado. Além de marca, modelo
        e tipo, esta deve conter um atributo que indique um dos dois possíveis estados da lâmpada (acesa ou
        apagada).*/

//Gabriel Apolinário Fabrício
package ex01;

public class Ex01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.setModelo("XXX123");
        lampada.setMarca("Clarinha");
        lampada.setTipo("Led");
        lampada.ligar();

        System.out.println("Modelo: " + lampada.getModelo());
        System.out.println("Marca: " + lampada.getMarca());
        System.out.println("Tipo: " + lampada.getTipo());
        System.out.println("A lampada esta acesa? " + lampada.isAcesa());

        System.out.println();

        lampada.setModelo("123ABC");
        lampada.setMarca("Escurinha");
        lampada.setTipo("Led");
        lampada.desligar();

        System.out.println("Modelo: " + lampada.getModelo());
        System.out.println("Marca: " + lampada.getMarca());
        System.out.println("Tipo: " + lampada.getTipo());
        System.out.println("A lampada esta acesa? " + lampada.isAcesa());
    }
}
