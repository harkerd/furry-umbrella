package drew.harker.mycardgame.model.cards.collection.t3;

import java.util.List;

import drew.harker.mycardgame.controller.EffectController;
import drew.harker.mycardgame.model.ResourceList;
import drew.harker.mycardgame.model.cards.Card;
import drew.harker.mycardgame.model.cards.CardType;
import drew.harker.mycardgame.model.cards.Effect;
import drew.harker.mycardgame.model.cards.EffectType;

public class Copy extends Card
{
    private List<Effect> effects;
    private CardType cardType;

    @Override
    public String getTitle() {
        return "Copy";
    }

    @Override
    public String getDescription() {
        return "Select one of your sources. The effect of this card becomes the selected card's effect.";
    }

    @Override
    public ResourceList getCost() {
        return new ResourceList(); //TODO
    }

    @Override
    public int getVictoryPoints() {
        return 0; //TODO
    }

    @Override
    public CardType getCardType() {
        return cardType;
    }

    @Override
    public boolean isSpecial()
    {
        return true;
    }

    @Override
    public List<Effect> getEffects() {
        if (effects == null)
        {


            return null;
        }
        else
        {
            return effects;
        }
    }

    private class CopyEffect extends Effect
    {
        private CopyEffect()
        {
            super();
        }

        @Override
        public EffectType getTiming() {
            return EffectType.IMMEDIATE;
        }

        @Override
        public void activate()
        {
            EffectController.effect_Copy();
        }
    }

}
