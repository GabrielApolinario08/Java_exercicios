package ex06;

import java.util.Arrays;

public class Professor extends Pessoa{
    private String[] disciplina = new String[100];
    private double salario;

    public Professor() {
        super("", 0);
        setDisciplina(null);
        setSalario(0);
    }
    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        setSalario(salario);
    }

    public String getDisciplina(int indice) {
        return disciplina[indice];
    }

    public void setDisciplina(String disciplina) {
        for (int i = 0; i < this.disciplina.length ; i++) {
            if (this.disciplina[i] == null) {
                this.disciplina[i] = disciplina;
                return;
            }
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String disc = "";
        for (String disci:disciplina) {
            if (disci == null) {
                break;
            } else {
                disc += "'" + disci + "', ";
            }
        }
        return super.toString() + ", disciplina=" + disc +
                "salario=" + getSalario() +
                '}';
    }
}
