package drew.harker.mycardgame.model.cards;

public abstract class Effect
{
    public abstract EffectTiming getTiming();
    public abstract void activate();
}
