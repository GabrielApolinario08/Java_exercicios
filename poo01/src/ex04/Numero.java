package ex04;

public class Numero {
    private int numero;

    public Numero() {
        numero = 0;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int inverter() {
        String numeroString = String.valueOf(Math.abs(numero));
        String numeroRetornado = "";
        for (int i = 0 ; i < numeroString.length() ; i++) {
            numeroRetornado += numeroString.charAt(numeroString.length() - (i + 1));
        }
        if (numero < 0) {
            numeroRetornado = "-" + numeroRetornado;
        }
        return Integer.parseInt(numeroRetornado);
    }
}
