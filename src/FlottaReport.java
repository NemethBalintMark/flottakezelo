import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FlottaReport {
    public static void main(String[] args) {
        Jarmu auto1 = new Jarmu("ASD-123", 35, 7);
        Jarmu auto2 = new Jarmu("DSA-321", 40, 5);
        ElektromosRobogo e1 = new ElektromosRobogo("FGH-456", 50, 10);
        ElektromosRobogo e2 = new ElektromosRobogo("HGF-654", 10, 10);
        VarosiFurgon f1 = new VarosiFurgon("JKL-789", 60, 10, 1500);
        VarosiFurgon f2 = new VarosiFurgon("LKJ-987", 70, 15, 2000);

        ArrayList<Jarmu> jarmuvek = new ArrayList<>(Arrays.asList(auto1, auto2, e1, e2, f1, f2));

        System.out.println(jarmuListaz(jarmuvek));
        System.out.println("Napi összköltség: " + osszKoltseg(jarmuvek) + " Ft");
    }

    private static int osszKoltseg(ArrayList<Jarmu> jarmuvek){
        int ossz = 0;

        for (Jarmu j : jarmuvek)  {
            ossz += (int) j.fenntartasiKoltseg(new Random().nextInt(0, 150));
        }

        return ossz;
    }

    private static String jarmuListaz(ArrayList<Jarmu> jarmuvek) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jarmuvek.size(); i++) {
            if(jarmuvek.get(i) instanceof ElektromosRobogo && jarmuvek.get(i).getUzemanyagszint() < 20) {
                sb.append(jarmuvek.get(i));
            }
        }
        return  sb.toString();
    }
}
