package ex04;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        dia = 0;
        mes = 0;
        ano = 0;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public boolean isValida() {
        if (dia > 0 && ano > 0) {
            if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia <= 31)) {
                return true;
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia <= 30)) {
                return true;
            } else return mes == 2 && dia <= 28;
        } else {
            return false;
        }
    }

    public String mostrarData() {
        return dia + "/" + mes + "/" + ano;
    }
}
