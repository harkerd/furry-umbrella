package drew.harker.mycardgame.view.dialog;

import java.util.List;

public class UserInputRequest
{
    private String title;
    private List<Option> options;
    private SelectionCallback callback;
    private LimitCaps totalCap;
    private boolean canBeCanceled;

    public boolean isCancelable()
    {
        return canBeCanceled;
    }

    public List<Option> getOptions()
    {
        return options;
    }

    public SelectionCallback getCallback()
    {
        return callback;
    }

    public String getTitle()
    {
        return title;
    }
}
