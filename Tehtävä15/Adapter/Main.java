public class Main {
    public static void main(String[] args) {
        LeluRekka autoAdapter = new AutoAdapter(new Auto());

        autoAdapter.aja(); // 120km/h
        autoAdapter.ajaHiljalleen(); // 12/h
        autoAdapter.ajaHitaasti(); // 24km/h

        System.out.println(autoAdapter.aja().getNopeus()); // Auton perus nopeus
        System.out.println(autoAdapter.ajaHiljalleen().getNopeus()); // Muokattu nopeus
        System.out.println(autoAdapter.ajaHitaasti().getNopeus()); // Muokattu nopeus
    }
}
