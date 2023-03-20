package Tehtävä11.Memento;

public class CareTaker {
    private Object obj;
    
    public void saveMemento(Arvuuttaja arvuuttaja) {
        this.obj = arvuuttaja.liityPeliin();
    }
    
    public void getMemento(Arvuuttaja arvuuttaja) {
        arvuuttaja.arvaa(obj);
    }




}
