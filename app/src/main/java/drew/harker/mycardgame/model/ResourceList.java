package drew.harker.mycardgame.model;

public class ResourceList
{
    private int food;
    private int water;
    private int wood;
    private int stone;
    private int metal;
    private int glass;

    public void add(ResourceType resource, int count)
    {
        switch (resource)
        {
            case FOOD:
                food += count;
                break;
            case WATER:
                water += count;
                break;
            case WOOD:
                wood += count;
                break;
            case STONE:
                stone += count;
                break;
            case METAL:
                metal += count;
                break;
            case GLASS:
                glass += count;
                break;
        }
    }

    public void add(ResourceList list)
    {
        this.food += list.food;
        this.water += list.water;
        this.wood += list.wood;
        this.stone += list.stone;
        this.metal += list.metal;
        this.glass += list.glass;
    }
}
