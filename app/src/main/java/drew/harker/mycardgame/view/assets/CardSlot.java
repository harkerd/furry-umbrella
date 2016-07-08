package drew.harker.mycardgame.view.assets;

import android.content.Context;

import drew.harker.mycardgame.model.cards.Card;

public class CardSlot extends Asset
{
    private Card card;

    public CardSlot(Context context)
    {
        super(context);
    }

    public void setCard(Card card)
    {
        this.card = card;
        refresh();
    }

    @Override
    public void refresh()
    {
        //TODO: If there is no card, draw a red x, else inject a CardView
    }
}
