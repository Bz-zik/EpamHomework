package homework170717.Solitare;

public class SelectPile extends CardPile {


    SelectPile(int xl, int yl) {
        super(xl, yl);
    }

    static SelectPile select(CardPile pile, int x, int y) {

        int count = countOfSelectingCards(pile, y);
        int otherCount = pile.countOfCardsInPile - count;
        x = pile.x;
        y = pile.y + otherCount*(Card.HEIGHT/2);

        SelectPile select = new SelectPile(x, y);
        Card current = pile.top();

        for (int i = 0; i < count; i++) {
            if (current != null && current.isFaceUp()) {
                select.addCard(new Card(current.getSuit(), current.getRank()));
                current = current.link;
            }
            else return null;
        }

        wasSelect = true;
        return select;
    }

    private static int countOfSelectingCards(CardPile pile, int y) {
        int count = (y - pile.y)/(Card.HEIGHT/2);
        if (count >= pile.countOfCardsInPile) count--;
        return pile.countOfCardsInPile - count;
    }

}
