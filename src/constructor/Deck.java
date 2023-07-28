package constructor;

public class Deck {
    private int numberCards;
    private int averageElixir;
    private String cardQuality;
    private int cardLevel;

    public Deck(int numberCards, int averageElixir, String cardQuality, int cardLevel) {
        this.numberCards = numberCards;
        this.averageElixir = averageElixir;
        this.cardQuality = cardQuality;
        this.cardLevel = cardLevel;
    }

    public int getNumberCards() {
        return numberCards;
    }

    public void setNumberCards(int numberCards) {
        this.numberCards = numberCards;
    }

    public int getAverageElixir() {
        return averageElixir;
    }

    public void setAverageElixir(int averageElixir) {
        this.averageElixir = averageElixir;
    }

    public String getCardQuality() {
        return cardQuality;
    }

    public void setCardQuality(String cardQuality) {
        this.cardQuality = cardQuality;
    }

    public int getCardLevel() {
        return cardLevel;
    }

    public void setCardLevel(int cardLevel) {
        this.cardLevel = cardLevel;
    }

}
