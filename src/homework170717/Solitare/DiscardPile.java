package homework170717.Solitare;

class DiscardPile extends CardPile {

    DiscardPile(int x, int y) {
        super(x, y);
        countOfCardsInPile = 1;
    }

    public void addCard(Card aCard) {
        if (!aCard.isFaceUp())
            aCard.flip();
        super.addCard(aCard);
    }
}
