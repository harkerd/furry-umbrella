package drew.harker.mycardgame.view.dialog;

public class Option
{
    private String title;
    private String description;
    private String imageLocation;
    private CapPair cap;

    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }

    public String getImageLocation()
    {
        return imageLocation;
    }

    public int getMax()
    {
        return cap.max;
    }

    public int getMin()
    {
        return cap.min;
    }
}
