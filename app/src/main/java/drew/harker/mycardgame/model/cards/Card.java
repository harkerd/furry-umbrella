package drew.harker.mycardgame.model.cards;

import java.util.List;

import drew.harker.mycardgame.model.ResourceList;

public abstract class Card
{
    public abstract String getTitle();
    public abstract String getDescription();
    public abstract ResourceList getCost();
    public abstract int getVictoryPoints();
    public abstract CardType getCardType();
    public abstract boolean isSpecial();
    public abstract List<Effect> getEffects();
}
