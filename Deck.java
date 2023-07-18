import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Deck {
    private LinkedList<Influence> deck = null;

    public Deck() {
    }

    public void resetDeck() {
        deck = new LinkedList<Influence>();
        for (Influence cardType : Influence.values()) {
            deck.add(cardType);
            deck.add(cardType);
            deck.add(cardType);
        }
        Collections.shuffle(deck);
    }

    public Influence drawCard() {
        return Influence.DUKE;
    }

    public void addCard() {

    }

    
}
