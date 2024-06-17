package ex06;

public class TestaData {
    private int dia01, dia02, mes01, mes02, ano01, ano02;
    private String data01, data02;

    public TestaData() {
        this.dia01 = this.dia02 = 1;
        this.mes01 = this.mes02 = 1;
        this.ano01 = this.ano02 = 1;

        this.data01 = this.data02 = this.dia01 + "/" + this.mes01 + "/" + this.ano01;
    }

    public void setDia01(int dia01) {
        this.dia01 = dia01;
    }

    public int getDia01() {
        return this.dia01;
    }

    public int getDia02() {
        return dia02;
    }

    public void setDia02(int dia02) {
        this.dia02 = dia02;
    }

    public int getMes01() {
        return mes01;
    }

    public void setMes01(int mes01) {
        this.mes01 = mes01;
    }

    public int getMes02() {
        return mes02;
    }

    public void setMes02(int mes02) {
        this.mes02 = mes02;
    }

    public int getAno01() {
        return ano01;
    }

    public void setAno01(int ano01) {
        this.ano01 = ano01;
        setData01();
    }

    public int getAno02() {
        return ano02;
    }

    public void setAno02(int ano02) {
        this.ano02 = ano02;
        setData02();
    }

    public String getData01() {
        return data01;
    }

    private void setData01() {
        this.data01 = this.dia01 + "/" + this.mes01 + "/" + this.ano01;
    }

    public String getData02() {
        return data02;
    }

    private void setData02() {
        this.data02 = this.dia02 + "/" + this.mes02 + "/" + this.ano02;
    }

    public boolean datasIguais() {
        if (this.dia01 == this.dia02 && this.mes01 == this.mes02 && this.ano01 == this.ano02) {
            return true;
        } else {
            return false;
        }
    }

    public String dataMaior() {
        if (getAno01() > getAno02()) {
            return getData01();
        } else if (getAno01() < getAno02()){
            return getData02();
        } else {
            if (getMes01() > getMes02()) {
                return getData01();
            } else if(getMes01() < getMes02()) {
                return getData02();
            } else {
                if (getDia01() > getDia02()) {
                    return getData01();
                } else if (getDia01() < getDia02()) {
                    return getData02();
                } else {
                    return "As datas são iguais!";
                }
            }
        }
    }

    public String dataMenor() {
        if (getAno01() < getAno02()) {
            return getData01();
        } else if (getAno01() > getAno02()){
            return getData02();
        } else {
            if (getMes01() < getMes02()) {
                return getData01();
            } else if(getMes01() > getMes02()) {
                return getData02();
            } else {
                if (getDia01() < getDia02()) {
                    return getData01();
                } else if (getDia01() > getDia02()) {
                    return getData02();
                } else {
                    return "As datas são iguais!";
                }
            }
        }
    }

    public int diferencaDias() {
        int diasData01, diasData02;
        diasData01 = (getDia01() + ((getMes01() - 1) * 30) + ((getAno01() - 1) * 365));
        diasData02 = (getDia02() + ((getMes02() - 1) * 30) + ((getAno02() - 1) * 365));
        if (getData01().equals(dataMaior())) {
            return diasData01 - diasData02;
        } else if (getData01().equals(dataMenor()))  {
            return diasData02 - diasData01;
        } else {
            return 0;
        }
    }
}
