package drew.harker.mycardgame.model.cards.collection.t2;

import java.util.ArrayList;
import java.util.List;

import drew.harker.mycardgame.controller.EffectController;
import drew.harker.mycardgame.model.ResourceList;
import drew.harker.mycardgame.model.cards.Card;
import drew.harker.mycardgame.model.cards.CardType;
import drew.harker.mycardgame.model.cards.Effect;
import drew.harker.mycardgame.model.cards.EffectType;
import drew.harker.mycardgame.model.cards.collection.Duration;

public class RockSlide extends Card
{
    @Override
    public String getTitle()
    {
        return "Rock Slide";
    }

    @Override
    public String getDescription()
    {
        return "For the next two rounds: You can only pick up Stone on Gather.";
    }

    @Override
    public ResourceList getCost()
    {
        return new ResourceList();
    }

    @Override
    public int getVictoryPoints()
    {
        return 0;
    }

    @Override
    public CardType getCardType()
    {
        return CardType.EVENT;
    }

    @Override
    public boolean isSpecial()
    {
        return false;
    }

    @Override
    public List<Effect> getEffects()
    {
        Effect effect = new RockSlideEffect();
        RockSlideCounter counter = new RockSlideCounter();
        counter.setEffectId(effect.getEffectId());

        List<Effect> effects = new ArrayList<>();
        effects.add(counter);
        effects.add(effect);
        return effects;
    }

    private class RockSlideEffect extends Effect
    {
        private RockSlideEffect()
        {
            super();
        }

        @Override
        public EffectType getTiming()
        {
            return EffectType.ON_GATHER;
        }

        @Override
        public void activate()
        {
            EffectController.effect_RockSlide();
        }
    }

    private class RockSlideCounter extends Duration
    {
        private int effectId;

        private RockSlideCounter()
        {
            super(2);
        }

        private void setEffectId(int effectId)
        {
            this.effectId = effectId;
        }

        @Override
        public EffectType getTiming()
        {
            return EffectType.DURATION;
        }

        @Override
        public void activate()
        {
            if(!isStillActive())
            {
                EffectController.remove(effectId);
            }
        }
    }
}
