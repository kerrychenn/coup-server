import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int playerId;
    private List<Influence> hand = new ArrayList<>();
    private int coins;
   
    public Player(String name, int playerId) {
        this.name = name;
        this.playerId = playerId;
        this.coins = 2;
    }

    public String getName() {
        return name;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void resetCoin() {
        this.coins = 2;
    }

    public int getCoins() {
        return this.coins;
    }

    public void addCoins(int amount) {
        this.coins += amount;
    }

    public void removeCoins(int amount) {
        if (amount > this.coins) {
            this.coins = 0;
        } else {
            this.coins -= amount;
        }
    }

    public void resetHand() {
        hand = new ArrayList<>();
    }

    public List<Influence> getHand() {
        return List.copyOf(hand);
    }

    public void addCard(Influence card) {
        hand.add(card);
    }

    public boolean hasCard(Influence card) { 
        return hand.contains(card);
    }
    
    public void swapCard(Influence oldCard, Influence newCard) {
        int oldCardPosition = hand.indexOf(oldCard);
        hand.set(oldCardPosition, newCard);
    }
}
