package homework170717.Solitare;

class SuitPile extends CardPile {

    SuitPile(int x, int y) {
        super(x, y);
    }

    public boolean canTake(Card aCard) {
        if (isEmpty())
            return aCard.getRank() == 0;
        Card topCard = top();
        return (aCard.getSuit() == topCard.getSuit()) &&
                (aCard.getRank() == 1 + topCard.getRank());
    }
}
