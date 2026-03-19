public class ElektromosRobogo extends Jarmu{
    public ElektromosRobogo(String azonosito, int uzemanyagszint, int atlagfogyasztas) {
        super(azonosito, uzemanyagszint, atlagfogyasztas);
    }

    @Override
    public void setUzemanyagszint(int uzemanyagszint) {
        if (uzemanyagszint < 100 && uzemanyagszint > -1){
            super.setUzemanyagszint(uzemanyagszint);
        }
    }

    @Override
    public String toString() {
        return "Elektromos Robogó{" +
                "azonosito='" + getAzonosito() + '\'' +
                ", akkumulátor szint=" + getUzemanyagszint() +
                ", atlagfogyasztas=" + getAtlagfogyasztas() +
                '}';
    }
}
