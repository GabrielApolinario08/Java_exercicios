package ex05;

public class Aquatico extends Animal {
    private boolean respiraForaDaAgua;

    public Aquatico() {
        super();
        setRespiraForaDaAgua(false);
    }

    public Aquatico(String nome, String especie, Habtat habtat, boolean respiraForaDaAgua) {
        super(nome, especie, habtat);
        setRespiraForaDaAgua(respiraForaDaAgua);
    }

    public boolean isRespiraForaDaAgua() {
        return respiraForaDaAgua;
    }

    public void setRespiraForaDaAgua(boolean respiraForaDaAgua) {
        this.respiraForaDaAgua = respiraForaDaAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tAquatico\n\tRespira Fora d'água: " + (isRespiraForaDaAgua() ? "Sim":"Não");
    }
}
