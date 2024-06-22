package ex04;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Jogo extends Midia{
    private String console;

    public Jogo() {
        super(null, "descrição", "tipo", "genero", 0);
        setConsole("console");
    }

    public Jogo(ArrayList<Midia> midias, String descricao, String tipo, String genero, double valorAluguel, String console) {
        super(midias, descricao, tipo, genero, valorAluguel);
        setConsole(console);
    }

    public String getConsole() {
        return this.console;
    }

    public void setConsole(String console) {
        if (console.trim().isEmpty()) throw new IllegalArgumentException("Console não pode ser vazio.");
        this.console = console;
    }

    @Override
    public String toString() {
        return super.toString() + "\tConsole: " + getConsole();
    }
}
