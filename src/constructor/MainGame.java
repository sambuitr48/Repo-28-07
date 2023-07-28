package constructor;

public class MainGame {
    public static void main(String[] args) {
        Character valquiria = new Character(
                "Valquiria",
                200,
                150,
                4
        );
        Character miniPekka = new Character(
                "Mini P.E.K.K.A",
                1000,
                999,
                7
        );
        Deck deck1 = new Deck(
                8,
                4,
                "Exotica",
                13
        );
        Arena arena = new Arena();
        Arena arena1 = new Arena(
                23);
    }
        Arena arena2 = new Arena(
                23,
                5);
}
