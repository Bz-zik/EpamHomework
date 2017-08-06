package homework170717.Solitare;

import java.awt.*;

class TablePile extends CardPile {

    TablePile(int x, int y, int c) {
        // initialize the parent class
        super(x, y);
        // then initialize our pile of cards
        for (int i = 0; i < c; i++) {
            addCard(Solitare.deckPile.pop());
        }
        // flip topmost card face up
        top().flip();
    }

    public boolean canTake(Card aCard) {
        if (isEmpty())
            return aCard.getRank() == 12;
        Card topCard = top();
        return (aCard.getColor() != topCard.getColor()) &&
                (aCard.getRank() == topCard.getRank() - 1);
    }

    public boolean includes(int tx, int ty) {
        // don't test bottom of card
        return x <= tx && tx <= x + Card.width &&
                y <= ty;
    }

    public void select(int tx, int ty) {
        if (isEmpty())
            return;

        // if face down, then flip
        Card topCard = top();
        if (!topCard.isFaceUp()) {
            topCard.flip();
            return;
        }

        // else see if any getSuit pile can take card
        topCard = pop();
        for (int i = 0; i < 4; i++)
            if (Solitare.suitPile[i].canTake(topCard)) {
                Solitare.suitPile[i].addCard(topCard);
                if (top() != null && !top().isFaceUp()) top().flip();
                return;
            }
        // else see if any other table pile can take card
        for (int i = 0; i < 7; i++)
            if (Solitare.tableau[i].canTake(topCard)) {
                Solitare.tableau[i].addCard(topCard);
                if (top() != null && !top().isFaceUp()) top().flip();
                return;
            }
        // else put it back on our pile
        addCard(topCard);
    }

    private int stackDisplay(Graphics g, Card aCard) {
        int localy;
        if (aCard == null)
            return y;
        localy = stackDisplay(g, aCard.link);
        aCard.draw(g, x, localy);
        return localy + 35;
    }

    public void display(Graphics g) {
        stackDisplay(g, top());
    }

}