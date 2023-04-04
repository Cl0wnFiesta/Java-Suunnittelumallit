public class Main {
    public static void main(String[] args) {
        LeluRekka leluRekka = new Rekka();
        LeluRekka autoAdapter = new AutoAdapter(new Auto());

        // LeluRekka ei mene kovaa
        leluRekka.työnnä(); // 12km/h
        // LeluRekka käyttäytyy kuin oikea auto, ja menee kovaa
        autoAdapter.työnnä(); // 140km/h
    }
}
