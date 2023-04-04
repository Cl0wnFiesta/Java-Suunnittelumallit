public class Main {
    public static void main(String[] args) {
        LeluRekka autoAdapter = new AutoAdapter(new Auto());
        
        autoAdapter.työnnä(); // 120/h
        autoAdapter.työnnäKovaa(); // 140km/h
        autoAdapter.työnnäHitaasti(); // 40km/h

        System.out.println(autoAdapter.työnnä().getNopeus()); // Auton perus nopeus
        System.out.println(autoAdapter.työnnäKovaa().getNopeus()); // Muokattu nopeus
        System.out.println(autoAdapter.työnnäHitaasti().getNopeus()); // Muokattu nopeus
    }
}
