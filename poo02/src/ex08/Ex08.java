/*8) Escrever a classe ConversaoDeUnidadesDeArea com métodos para conversão das unidades de área
        segundo a lista abaixo:
        • 1 metro quadrado = 10.76 pés quadrados
        • 1 pé quadrado = 929 centímetros quadrados
        • 1 milha quadrada = 640 acres
        • 1 acre = 43.560 pés quadrado*/

//Gabriel Apolinário Fabrício
package ex08;

public class Ex08 {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeArea conversaoDeUnidadesDeArea = new ConversaoDeUnidadesDeArea();

        conversaoDeUnidadesDeArea.setAcre(10);
        conversaoDeUnidadesDeArea.setCm(10);
        conversaoDeUnidadesDeArea.setMetro(10);
        conversaoDeUnidadesDeArea.setPe(10);
        conversaoDeUnidadesDeArea.setMilha(10);

        System.out.println("Metros² em pés²: " + conversaoDeUnidadesDeArea.metroParaPes());
        System.out.println("Pés² em centímetros²: " + conversaoDeUnidadesDeArea.pesParaCm());
        System.out.println("Milhas² em acres²: " + conversaoDeUnidadesDeArea.milhasParaAcres());
        System.out.println("Acres² em pés²: " + conversaoDeUnidadesDeArea.acresParaPes());
    }
}
