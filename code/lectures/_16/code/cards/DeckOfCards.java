package lectures._16.code.cards;

import java.util.ArrayList;

public class DeckOfCards
{
    private ArrayList<Card> cards = new ArrayList<>();

    public DeckOfCards() {
        for (int i = 0; i < 52; i ++) {
            // Create 52 different instances of the Card-class
            this.cards.add(new Card(Card.Color.BLACK, Card.Type.SPADE, i=13));
        }

        for (int i = 0; i < 52; i ++) {
            // Create 52 different instances of the Card-class
            this.cards.add(new Card(Card.Color.BLACK, Card.Type.CLUB, i=13));
        }

        for (int i = 0; i < 52; i ++) {
            // Create 52 different instances of the Card-class
            this.cards.add(new Card(Card.Color.RED, Card.Type.HEART, i=13));
        }

        for (int i = 0; i < 52; i ++) {
            // Create 52 different instances of the Card-class
            this.cards.add(new Card(Card.Color.RED, Card.Type.DIAMOND, i=13));
        }

        Card.Type[] type = { Card.Type.SPADE,
                Card.Type.HEART,
                Card.Type.CLUB,
                Card.Type.DIAMOND
        };
        Card.Color[] colors = {
                Card.Color.BLACK,
                Card.Color.RED
        };

    }
}
