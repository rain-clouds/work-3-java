//Pelcear Cristian
public class destination {
    private String name;
    private int demand;
    private SourceType type;
//constructorul
    public destination(String destination_name,int amount, SourceType t)
    {
        this.name = destination_name;
        this.demand= amount;
        this.type=t;

    }

// to see the name ,  demand and type the of a destination
    public String getname()
    {
        return name;
    }
   public int getdemand()
   {
       return demand;
   }
    public SourceType gettype()
    {
        return type;
    }
// set a new  name, demand and type of a certain destination

    public  void setname(String new_name)
    {
        this.name=new_name;
    }
    public void setdemand(int new_demand)
    {
        this.demand=new_demand;
    }
    public void settype(SourceType new_type)
    {
        this.type=new_type;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name=" + name + '\'' +
                ", demand=" + demand +
                ", type=" + type +
                '}';
    }
}