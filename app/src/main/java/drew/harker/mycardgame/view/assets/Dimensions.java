package drew.harker.mycardgame.view.assets;

import android.content.Context;
import android.util.DisplayMetrics;

public class Dimensions
{
    private static Dimensions instance;

    public static void init(Context context)
    {
        if(instance == null)
        {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            instance = new Dimensions(displayMetrics.heightPixels, displayMetrics.widthPixels);
        }
    }

    private final CardDim card;
    private final CardDim largeCard;
    private final int game_margin_vertical;
    private final int game_margin_horizontal;

    private Dimensions(int height, int width)
    {
        int unit = 0;
        //TODO: calculate the unit
        //TODO: assign all the values based off the unit
        card = new CardDim();
        largeCard = new CardDim();
        game_margin_horizontal = 0;
        game_margin_vertical = 0;
    }


    private class CardDim
    {
        private int width;
        private int height;
        private int margin;
        private int text;
        private int oval_height;
        private int oval_width;
        private int line_width;
        private int image_height;
        private int image_width;
    }
}
