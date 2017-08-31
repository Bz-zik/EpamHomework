package homework170717.Solitare;

import java.applet.Applet;
import java.awt.*;

public class Solitare extends Applet {
    static CardPile allPiles[];
    static SuitPile suitPile[];
    static TablePile tableau[];
    static DeckPile deckPile;
    static DiscardPile discardPile;
    static SelectPile selectingPile;

    public void init() {
        resize(500, 500);
        // first allocate the arrays
        allPiles = new CardPile[13];
        suitPile = new SuitPile[4];
        tableau = new TablePile[7];
        // then fill them in
        allPiles[0] = deckPile = new DeckPile(335, 5);
        allPiles[1] = discardPile = new DiscardPile(268, 5);
        for (int i = 0; i < 4; i++)
            allPiles[2 + i] = suitPile[i] =
                    new SuitPile(15 + 60 * i, 5);
        for (int i = 0; i < 7; i++)
            allPiles[6 + i] = tableau[i] =
                    new TablePile(5 + 55 * i, 80, i + 1);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < 13; i++)
            allPiles[i].display(g);
    }


    public boolean mouseDown(Event evt, int x, int y) {
        if (evt.metaDown()) {
            autoPile();
            repaint();
        }
        else for (int i = 0; i < 13; i++) {
            if (allPiles[i].includes(x, y)) {
                if (i == 0) {
                    allPiles[i].select(x, y);
                }
                else if (!CardPile.wasSelect) {
                    CardPile.thisPileWasSelect = allPiles[i];
                    selectingPile = SelectPile.select(allPiles[i], x, y);
                }
                else {
                    if (allPiles[i].canTake(selectingPile.top())) {
                        while (!selectingPile.isEmpty()) {
                            Card pop = selectingPile.pop();
                            if (!pop.isFaceUp()) pop.flip();
                            allPiles[i].addCard(pop);
                            CardPile.thisPileWasSelect.pop();
                        }
                        if (CardPile.thisPileWasSelect.top() != null && !CardPile.thisPileWasSelect.top().isFaceUp()) {
                            CardPile.thisPileWasSelect.top().flip();
                        }
                    }
                    CardPile.wasSelect = false;
                    selectingPile = null;
                }

                repaint();
            }
        }
        return true;
    }

    private void autoPile() {
        boolean haveChange = true;
        while (haveChange) {
            haveChange = false;
            for (int i = 6; i < 13; i++) {
                for (int j = 2; j < 6; j++) {
                    if (!allPiles[i].isEmpty() && allPiles[j].canTake(allPiles[i].top())) {
                        Card current = allPiles[i].pop();
                        allPiles[j].addCard(current);
                        if (allPiles[i].top() != null && !allPiles[i].top().isFaceUp()) {
                            allPiles[i].top().flip();
                        }
                        haveChange = true;
                    }
                    if (!allPiles[1].isEmpty() && allPiles[j].canTake(allPiles[1].top())) {
                        Card current = allPiles[1].pop();
                        allPiles[j].addCard(current);
                        haveChange = true;
                    }
                }
            }
        }
    }

}
