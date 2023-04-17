public interface IMediator {
    public void kerroHypynPituus(int pituus);

    public void sendArvostelu(int summa);

    public void lisääHypynTulos(int pituus, int arvostelu);

    public void lisääHyppääjä(Hyppääjä hyppääjä);

    public void hyppää(Hyppääjä hyppääjä);

}
