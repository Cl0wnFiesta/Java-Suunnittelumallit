package Tehtävä11.Memento;

public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        CareTaker careTaker = new CareTaker();
        
        careTaker.saveMemento(arvuuttaja);
        arvuuttaja.setArvaus((int) (Math.random() * 10));
        careTaker.getMemento(arvuuttaja);

    /*     while (true) {
            careTaker.saveMemento(arvuuttaja);
            arvuuttaja.setArvaus((int) (Math.random() * 10));
            careTaker.getMemento(arvuuttaja);
        } */
    } 
}
