package drew.harker.mycardgame.model;

public class ResourceList
{
    private int food;
    private int water;
    private int wood;
    private int stone;
    private int metal;
    private int glass;

    public ResourceList()
    {
        this.food = 0;
        this.water = 0;
        this.wood = 0;
        this.stone = 0;
        this.metal = 0;
        this.glass = 0;
    }

    public ResourceList(int food, int water)
    {
        this.food = food;
        this.water = water;
        this.wood = 0;
        this.stone = 0;
        this.metal = 0;
        this.glass = 0;
    }

    public ResourceList(int food, int water, int wood, int stone)
    {
        this.food = food;
        this.water = water;
        this.wood = wood;
        this.stone = stone;
        this.metal = 0;
        this.glass = 0;
    }

    public ResourceList(int food, int water, int wood, int stone, int metal, int glass)
    {
        this.food = food;
        this.water = water;
        this.wood = wood;
        this.stone = stone;
        this.metal = metal;
        this.glass = glass;
    }

    /*public void add(ResourceType resource, int count)
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
    }*/

    public int size()
    {
        return 0; //TODO
    }
}
