package drew.harker.mycardgame.model.cards.collection;

import drew.harker.mycardgame.controller.EffectController;
import drew.harker.mycardgame.model.cards.Effect;

public abstract class Duration extends Effect
{
    private int duration;

    public Duration(int turns)
    {
        super();
        duration = turns;
    }

    public boolean isStillActive()
    {
        duration--;
        if(duration == 0)
        {
            EffectController.remove(getEffectId());
            return false;
        }
        return true;
    }

}
