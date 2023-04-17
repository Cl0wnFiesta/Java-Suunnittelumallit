public class Main {
    public static void main(String[] args) {
        IMediator mediator = new Mediator();

        // Luo kolme Hyppääjää

        Hyppääjä hyppääjä1 = new Hyppääjä(mediator, "Pekka");
        Hyppääjä hyppääjä2 = new Hyppääjä(mediator, "Matti");
        Hyppääjä hyppääjä3 = new Hyppääjä(mediator, "Jussi");

        // Lisää Hyppääjät Mediatoriin

        mediator.lisääHyppääjä(hyppääjä1);
        mediator.lisääHyppääjä(hyppääjä2);
        mediator.lisääHyppääjä(hyppääjä3);

        // Hyppääjät hyppäävät

        for (int i = 0; i < 2; i++) {
            mediator.hyppää(hyppääjä1);
            mediator.hyppää(hyppääjä2);
            mediator.hyppää(hyppääjä3);
        }

        // Example output:
        // Jussi hyppää!
        // Mittamies: 99
        // Kisasihteeri: 58
        // Arvostelutuomari: 4
        // Arvostelutuomari: 15
        // Arvostelutuomari: 8
        // Arvostelutuomari: 11
        // Arvostelutuomari: 2
        // Arvostelutuomari yhteensä: 23
        // Jussi hyppäsi 99 metriä ja sai arvostelun 81
        // Pituus: 99
        // Pisteet: 81
        // Tulostaulu
        // Hyppääjä        Hyppy   Arvostelu               Pituus
        // Pekka             2        209                    136
        // Matti             2        169                    112
        // Jussi             2        174                    119
    }
}
