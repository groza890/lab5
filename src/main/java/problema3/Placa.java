package problema3;

import java.util.Arrays;

enum Orientare {
    LUNGIME,
    LATIME,
    ORICARE
}

public class Placa {
    private String descriere;
    private int lungime;
    private int latime;
    private Orientare orientare;
    private boolean[] canturi;
    private int nr_bucati;

    public Placa() {}

    public Placa(String descriere, int lungime, int latime, Orientare orientare, boolean[] canturi, int nr_bucati) {
        this.descriere = descriere;
        this.lungime = lungime;
        this.latime = latime;
        this.orientare = orientare;
        this.canturi = canturi;
        this.nr_bucati = nr_bucati;
    }


    public String getDescriere()
    {
        return descriere;
    }

    public int getLungime()
    {
        return lungime;
    }


    public int getLatime()
    {
        return latime;
    }


    public Orientare getOrientare()
    {
        return orientare;
    }


    public boolean[] getCanturi()
    {
        return canturi;
    }


    public int getNr_bucati()
    {
        return nr_bucati;
    }


    public void setDescriere(String descriere)
    {
        this.descriere = descriere;
    }


    public void setLungime(int lungime)
    {
        this.lungime=lungime;
    }


    public void setLatime(int latime)
    {
        this.latime=latime;
    }


    public void setOrientare(Orientare orientare)
    {
        this.orientare=orientare;
    }


    public void setCanturi(boolean[] canturi)
    {
        this.canturi=canturi;
    }


    public void setNr_bucati(int nr_bucati)
    {
        this.nr_bucati=nr_bucati;
    }

    @Override
    public String toString() {
        return descriere + ", " + lungime + ", " + latime + ", " + orientare + ", " + Arrays.toString(canturi) + ", " + nr_bucati + '\n';
    }
}