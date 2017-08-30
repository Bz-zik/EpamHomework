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

    @Override
    public void addCard(Card aCard) {
        countOfCardsInPile++;
        super.addCard(aCard);
    }

    @Override
    public Card pop() {
        Card card = super.pop();
        if (card != null) countOfCardsInPile--;
        return card;
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
        return x <= tx && tx <= x + Card.WIDTH &&
                y <= ty && ty <= y + (countOfCardsInPile -1)*Card.HEIGHT/2 + Card.HEIGHT;
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
