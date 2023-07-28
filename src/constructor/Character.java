package constructor;

public class Character {
    private String characterName;
    private int life;
    private int dps;
    private int elixirCost;

    public Character(String characterName, int life, int dps, int elixirCost) {
        this.characterName = characterName;
        this.life = life;
        this.dps = dps;
        this.elixirCost = elixirCost;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDps() {
        return dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    public int getElixirCost() {
        return elixirCost;
    }

    public void setElixirCost(int elixirCost) {
        this.elixirCost = elixirCost;
    }
    public void movement(){

    }
}