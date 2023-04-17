public class Main {
    public static void main(String[] args) { 
        IMediator mediator = new Mediator();
        Hyppääjä hyppääjä1 = new Hyppääjä(mediator, "Pekka");
        Hyppääjä hyppääjä2 = new Hyppääjä(mediator, "Matti");
        Hyppääjä hyppääjä3 = new Hyppääjä(mediator, "Jussi");

        mediator.lisääHyppääjä(hyppääjä1);
        mediator.lisääHyppääjä(hyppääjä2);
        mediator.lisääHyppääjä(hyppääjä3);

        for (int i = 0; i < 2; i++) {
            mediator.hyppää(hyppääjä1);
            mediator.hyppää(hyppääjä2);
            mediator.hyppää(hyppääjä3);
        }
    }
}
