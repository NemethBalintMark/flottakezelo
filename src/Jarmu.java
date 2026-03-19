public class Jarmu {
    private String azonosito;
    private int uzemanyagszint;
    private int atlagfogyasztas;

    public Jarmu(String azonosito, int uzemanyagszint, int atlagfogyasztas) {
        setAzonosito(azonosito);
        setUzemanyagszint(uzemanyagszint);
        setAtlagfogyasztas(atlagfogyasztas);
    }

    public String getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public int getUzemanyagszint() {
        return uzemanyagszint;
    }

    public void setUzemanyagszint(int uzemanyagszint) {
        this.uzemanyagszint = uzemanyagszint;
    }

    public int getAtlagfogyasztas() {
        return atlagfogyasztas;
    }

    public void setAtlagfogyasztas(int atlagfogyasztas) {
        this.atlagfogyasztas = atlagfogyasztas;
    }

    public double fenntartasiKoltseg(int ut) {
        return (((double) ut / 100) * getAtlagfogyasztas() * 600);
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "azonosito='" + getAzonosito() + '\'' +
                ", uzemanyagszint=" + getUzemanyagszint() +
                ", atlagfogyasztas=" + getAtlagfogyasztas() +
                '}';
    }
}
