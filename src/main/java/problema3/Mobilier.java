package problema3;

import java.util.List;
import java.util.Objects;

public class Mobilier {
    private String nume;
    private List<Placa> placi;

    public Mobilier() {}

    public Mobilier(String nume, List<Placa> placi) {
        this.nume = nume;
        this.placi = placi;
    }

    public String getNume()
    {
        return nume;
    }

    public List<Placa> getPlaci()
    {
        return placi;
    }

    public void setNume(String nume)
    {
        this.nume = nume;
    }

    public void setPlaci(List<Placa> placi)
    {
        this.placi = placi;
    }

    @Override
    public String toString() {
        return "Mobilier{" + "nume='" + nume + '\'' + ", placi=" + placi + '}';
    }

    public int NrPlaciDePal() {
        int ariaTotalaCorp = 0;
        int ariaPal = 2800 * 2070;
        for(Placa p : placi) {
            ariaTotalaCorp += p.getLatime()*p.getLungime();
        }

        System.out.println(ariaPal);
        System.out.println(ariaTotalaCorp);
        return ariaTotalaCorp/ariaPal + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mobilier mobilier = (Mobilier) o;
        return Objects.equals(nume, mobilier.nume) && Objects.equals(placi, mobilier.placi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, placi);
    }
}
