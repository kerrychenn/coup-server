import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    // Queue to represent the deck
    // The top of the deck is the head of the linked list.
    // The bottom of the deck is the tail of the linked list.
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
        return deck.pop();
    }

    public void returnCard(Influence card) {
        deck.add(card);
    }
}
