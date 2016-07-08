package drew.harker.mycardgame.model.cards;

public abstract class Listener extends Effect
{
    public abstract void check(Card card, boolean purchasing, boolean activated);
}
