package drew.harker.mycardgame.view.assets;

import android.content.Context;
import android.view.View;

public abstract class Asset extends View
{
    public Asset(Context context)
    {
        super(context);
    }

    /**
     * This method is for syncing the model to the view. 
     */
    public abstract void refresh();
}
