package drew.harker.mycardgame.view.assets;

import android.content.Context;
import android.view.View;

public abstract class Asset extends View
{
    public Asset(Context context)
    {
        super(context);
    }

    public abstract void refresh();
}
