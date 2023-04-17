public class Main {
    public static void main(String[] args) {
        IMediator mediator = new Mediator();

        // Luo Hyppääjät

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
        // Mittamies: 98
        // Kisasihteeri: 59
        // Arvostelutuomari: 7
        // Arvostelutuomari: 11
        // Arvostelutuomari: 11
        // Arvostelutuomari: 17
        // Arvostelutuomari: 3
        // Arvostelutuomari yhteensä: 29
        // Jussi hyppäsi 98 metriä ja sai arvostelun 88
        // Pituus: 98
        // Pisteet: 88
        // Tulostaulu
        // Hyppääjä        Hyppy   Arvostelu               Pituus
        // Pekka             2        190                    156
        // Matti             2        212                    144
        // Jussi             2        171                    98
    }
}
