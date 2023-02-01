import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {
    private int hinta;
    private List<Laiteosa> osat = new ArrayList<Laiteosa>();;

    public Kotelo(int hinta) {
        this.hinta = hinta;
    }

    public void lisaaOsa(Laiteosa osa) {
        osat.add(osa);
    }

    public int getHinta() {
        int summa = hinta;
        for (Laiteosa osa: osat) {
            summa += osa.getHinta();
        }
        return summa;
    }
}
