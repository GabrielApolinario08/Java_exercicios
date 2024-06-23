package ex05;

import java.util.ArrayList;
import java.util.List;

public class AnimalHabitat {
    private List<Animal> animais = new ArrayList<>();
    private Habtat habtat;

    public AnimalHabitat() {
        setAnimal(null);
        setHabtat(null);
    }

    public AnimalHabitat(Animal animal, Habtat habtat) {
        setAnimal(animal);
        setHabtat(habtat);
    }

    public List<Animal> getAnimal() {
        return animais;
    }

    public void setAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public Habtat getHabtat() {
        return habtat;
    }

    public void setHabtat(Habtat habtat) {
        this.habtat = habtat;
    }

    @Override
    public String toString() {
        String retorno;
        retorno = getHabtat().toString() + "\n\t";
        for (Animal animal:animais) {
            retorno += animal.toString();
        }
        return retorno;
    }
}
