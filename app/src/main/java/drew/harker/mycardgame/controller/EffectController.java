package drew.harker.mycardgame.controller;

import drew.harker.mycardgame.model.Action;
import drew.harker.mycardgame.model.ResourceType;

public class EffectController
{
    private static int effectIdCounter = 0;

    public static int getEffectId()
    {
        return effectIdCounter++;
    }
    //TODO

    public static void gain(ResourceType resource, int quantity)
    {

    }

    public static void resourceCapPlus(int quantity)
    {

    }

    public static void researchCapPlus(int quantity)
    {

    }

    public static void actionPlus(Action action, int quantity)
    {

    }

    public static void gainOfChoice(int quantity)
    {

    }

    /**
     * Used for removing effects.
     * Specifically for Duration Effects, the effect will keep track of how long it lasts and then remove itself.
     */
    public static void remove(int effectId)
    {

    }



    //For Unique Effects effect_CardName()
    public static void effect_RockSlide()
    {

    }

    public static void effect_Copy()
    {

    }
}
