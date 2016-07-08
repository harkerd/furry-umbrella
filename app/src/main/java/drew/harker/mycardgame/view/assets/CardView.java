package drew.harker.mycardgame.view.assets;

import android.content.Context;

import drew.harker.mycardgame.model.cards.Card;

public class CardView extends Asset
{
    private Card card;

    public CardView(Context context, Card card)
    {
        super(context);
        this.card = card;
    }

    @Override
    public void refresh()
    {

    }
}
