package drew.harker.mycardgame.model.cards.collection.t1;

import java.util.ArrayList;
import java.util.List;

import drew.harker.mycardgame.controller.EffectController;
import drew.harker.mycardgame.model.ResourceList;
import drew.harker.mycardgame.model.ResourceType;
import drew.harker.mycardgame.model.cards.Card;
import drew.harker.mycardgame.model.cards.CardType;
import drew.harker.mycardgame.model.cards.Effect;
import drew.harker.mycardgame.model.cards.EffectType;

public class Hunter extends Card
{
    private ResourceList cost;

    public Hunter(ResourceList cost)
    {
        this.cost = cost;
    }

    @Override
    public String getTitle()
    {
        return "Hunter";
    }

    @Override
    public String getDescription()
    {
        return "At the start of your turn: +2 Food";
    }

    @Override
    public ResourceList getCost()
    {
        return cost;
    }

    @Override
    public int getVictoryPoints()
    {
        return 1;
    }

    @Override
    public CardType getCardType()
    {
        return CardType.PERSON;
    }

    @Override
    public boolean isSpecial()
    {
        return false;
    }

    @Override
    public List<Effect> getEffects()
    {
        Effect effect = new HunterEffect();

        List<Effect> effects = new ArrayList<>();
        effects.add(effect);
        return effects;
    }

    private class HunterEffect extends Effect
    {
        private HunterEffect()
        {
            super();
        }

        @Override
        public EffectType getTiming()
        {
            return EffectType.START;
        }

        @Override
        public void activate()
        {
            EffectController.gain(ResourceType.FOOD, 2);
        }
    }
}
