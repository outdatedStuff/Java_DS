package classes;

public class Farfurie {
    int numarFarfurie;
    int dimensiune;
    public Farfurie(int numarFarfurie,int dimensiune){
        this.numarFarfurie=numarFarfurie;
        this.dimensiune=dimensiune;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Farfurie{");
        sb.append("numarFarfurie=").append(numarFarfurie);
        sb.append(", dimensiune=").append(dimensiune);
        sb.append('}');
        return sb.toString();
    }
}
