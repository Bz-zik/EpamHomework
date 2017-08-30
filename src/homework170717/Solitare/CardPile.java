package homework170717.Solitare;

import java.awt.*;

class CardPile {

    // coordinates of the card pile
    protected int x;

    // access to cards are not overridden
    protected int y;

    // countOfCardsInPile cards in pile
    protected int countOfCardsInPile;

    // check, if we selected pile
    protected static boolean wasSelect = false;

    // pile which was select
    protected static CardPile thisPileWasSelect;


    private Card firstCard;

    CardPile(int xl, int yl) {
        x = xl;
        y = yl;
        firstCard = null;
    }

    // the following are sometimes overridden

    public Card top() {
        return firstCard;
    }

    public void addCard(Card aCard) {
        aCard.link = firstCard;
        firstCard = aCard;
    }

    public boolean isEmpty() {
        return firstCard == null;
    }

    public Card pop() {
        Card result = null;
        if (firstCard != null) {
            result = firstCard;
            firstCard = firstCard.link;
        }
        return result;
    }

    public boolean includes(int tx, int ty) {
        return x <= tx && tx <= x + Card.WIDTH &&
                y <= ty && ty <= y + Card.HEIGHT;
    }

    public void select(int tx, int ty) {
        // do nothing
    }

    public void display(Graphics g) {
        g.setColor(Color.black);
        if (firstCard == null)
            g.drawRect(x, y, Card.WIDTH, Card.HEIGHT);
        else
            firstCard.draw(g, x, y);
    }

    public boolean  canTake(Card aCard) {
        return false;
    }
}
