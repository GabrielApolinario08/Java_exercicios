package ex07;

public class ModeloDeComputador {
    private int processador, memoria, disco, monitor;

    public ModeloDeComputador() {
        this.processador = 1600;
        this.memoria = 1;
        this.disco = 500;
        this.monitor = 15;
    }

    public int getProcessador() {
        return processador;
    }

    public void setProcessador(int processador) {
        this.processador = processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public int getMonitor() {
        return monitor;
    }

    public void setMonitor(int monitor) {
        this.monitor = monitor;
    }

    public double calcularPreco() {
        double precoProcessador, precoMemoria, precoDisco, precoMonitor;
        precoProcessador = getProcessador() == 1600 ? 700 : getProcessador() == 1800 ? 830 : 910;
        precoMemoria = getMemoria() == 1 ? 350 : getMemoria() == 2 ? 700 : getMemoria() == 4 ? 1400 : getMemoria() == 6 ? 2100 : 2800;
        precoDisco = getDisco() == 500 ? 300 : getDisco() == 1 ? 420 : 500;
        precoMonitor = getMonitor() == 15 ? 320 : 520;
        System.out.println("Configuração escolhida: ");
        System.out.println("Placa-mãe custando R$800.00");
        System.out.println("Processador: " + getProcessador() + "Mhz, custando R$" + precoProcessador);
        System.out.println("Memória: " + getMemoria() + "GB, custando R$" + precoMemoria);
        if (getDisco() == 500) {
            System.out.println("Disco: " + getDisco() + "GB, custando R$" + precoDisco);
        } else {
            System.out.println("Disco: " + getDisco() + "TB, custando R$" + precoDisco);
        }
        System.out.println("Monitor: " + getMonitor() + " polegadas, custando R$" + precoMonitor);

        return (800 + precoProcessador + precoMemoria + precoDisco + precoMonitor);
    }
}
