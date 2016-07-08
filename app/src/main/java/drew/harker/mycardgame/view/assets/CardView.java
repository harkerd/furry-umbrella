package drew.harker.mycardgame.view.assets;

import android.content.Context;

import drew.harker.mycardgame.model.cards.Card;

public class CardView extends Asset
{
    private Card card;
    private boolean large;

    public CardView(Context context, Card card, boolean isLarge)
    {
        super(context);
        this.card = card;
        large = isLarge;
    }

    @Override
    public void refresh()
    {

    }
}
