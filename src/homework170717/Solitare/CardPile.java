package homework170717.Solitare;

import java.awt.*;

class CardPile {

    // coordinates of the card pile
    protected int x;

    // access to cards are not overridden
    protected int y;
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

    public boolean empty() {
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
        return x <= tx && tx <= x + Card.width &&
                y <= ty && ty <= y + Card.height;
    }

    public void select(int tx, int ty) {
        // do nothing
    }

    public void addCard(Card aCard) {
        aCard.link = firstCard;
        firstCard = aCard;
    }

    public void display(Graphics g) {
        g.setColor(Color.black);
        if (firstCard == null)
            g.drawRect(x, y, Card.width, Card.height);
        else
            firstCard.draw(g, x, y);
    }

    public boolean  canTake(Card aCard) {
        return false;
    }
}
