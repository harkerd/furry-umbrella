package drew.harker.mycardgame.model.cards;

import drew.harker.mycardgame.controller.EffectController;

public abstract class Effect
{
    private int effectId;

    public Effect()
    {
        effectId = EffectController.getEffectId();
    }

    public abstract EffectType getTiming();
    public abstract void activate();

    public int getEffectId()
    {
        return effectId;
    }
}
