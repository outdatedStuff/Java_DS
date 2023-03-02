package classes;

public class Avion {
    String companie;
    int capacitate;

    public Avion(){};
    public Avion(String companie, int capacitate) {
        this.companie = companie;
        this.capacitate = capacitate;
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    @Override
    public String toString() {
        return "classes.Avion{" +
                "companie='" + companie + '\'' +
                ", capacitate=" + capacitate +
                '}';
    }
}
