package hu.petrik.adatbaziskonzolos;

public class Majom {
    private int id;
    private  String fajta;
    private int max_iq;
    private boolean szereti_banant;

    public Majom(String fajta, int max_iq, boolean szereti_banant) {
        this.fajta = fajta;
        this.max_iq = max_iq;
        this.szereti_banant = szereti_banant;
    }

    public Majom(int id, String fajta, int max_iq, boolean szereti_banant) {
        this.id = id;
        this.fajta = fajta;
        this.max_iq = max_iq;
        this.szereti_banant = szereti_banant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public int getMax_iq() {
        return max_iq;
    }

    public void setMax_iq(int max_iq) {
        this.max_iq = max_iq;
    }

    public boolean isSzereti_banant() {
        return szereti_banant;
    }

    public void setSzereti_banant(boolean szereti_banant) {
        this.szereti_banant = szereti_banant;
    }

    @Override
    public String toString() {
        return "Majom{" +
                "id=" + id +
                ", fajta='" + fajta + '\'' +
                ", max_iq=" + max_iq +
                ", szereti_banant=" + szereti_banant +
                '}';
    }
}
