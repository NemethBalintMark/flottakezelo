public class VarosiFurgon extends Jarmu{
    private double rakomanySuly;

    public VarosiFurgon(String azonosito, int uzemanyagszint, int atlagfogyasztas, double rakomanySuly) {
        super(azonosito, uzemanyagszint, atlagfogyasztas);
        this.setRakomanySuly(rakomanySuly);
    }

    public double getRakomanySuly() {
        return rakomanySuly;
    }

    public void setRakomanySuly(double rakomanySuly) {
        this.rakomanySuly = rakomanySuly;
    }

    @Override
    public double fenntartasiKoltseg(int ut) {
        return (((double) ut / 100) * 600 * (this.getRakomanySuly() / 1000));
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "azonosito='" + getAzonosito() + '\'' +
                ", uzemanyagszint=" + getUzemanyagszint() +
                ", atlagfogyasztas=" + getAtlagfogyasztas() + ", rakomanySuly=" + getRakomanySuly() +
                '}';
    }
}
