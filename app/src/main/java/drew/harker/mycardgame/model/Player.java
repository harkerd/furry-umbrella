package drew.harker.mycardgame.model;

import java.util.List;

import drew.harker.mycardgame.model.cards.Card;
import drew.harker.mycardgame.model.cards.EffectsContainer;

public class Player
{
    private List<Card> sources;
    private ResourceList resources;
    private int resourceCap;
    private List<Card> researchedCards;
    private int researchCap;
    private int totalVictoryPoints;
    private EffectsContainer activeEffects;
}
