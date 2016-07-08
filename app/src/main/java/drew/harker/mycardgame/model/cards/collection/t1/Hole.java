package drew.harker.mycardgame.model.cards.collection.t1;

import java.util.ArrayList;
import java.util.List;
import drew.harker.mycardgame.controller.EffectController;
import drew.harker.mycardgame.model.ResourceList;
import drew.harker.mycardgame.model.cards.Card;
import drew.harker.mycardgame.model.cards.CardType;
import drew.harker.mycardgame.model.cards.Effect;
import drew.harker.mycardgame.model.cards.EffectType;

public class Hole extends Card
{
    private ResourceList cost;

    public Hole(ResourceList cost)
    {
        this.cost = cost;
    }

    @Override
    public String getTitle()
    {
        return "Hole";
    }

    @Override
    public String getDescription()
    {
        return "+1 to Resource Cap";
    }

    @Override
    public ResourceList getCost()
    {
        return cost;
    }

    @Override
    public int getVictoryPoints()
    {
        return 0;
    }

    @Override
    public CardType getCardType()
    {
        return CardType.STRUCTURE;
    }

    @Override
    public boolean isSpecial()
    {
        return false;
    }

    @Override
    public List<Effect> getEffects()
    {
        Effect effect = new HoleEffect();

        List<Effect> effects = new ArrayList<>();
        effects.add(effect);
        return effects;
    }

    private class HoleEffect extends Effect
    {
        private HoleEffect()
        {
            super();
        }

        @Override
        public EffectType getTiming()
        {
            return EffectType.IMMEDIATE;
        }

        @Override
        public void activate()
        {
            EffectController.resourceCapPlus(1);
        }
    }
}
