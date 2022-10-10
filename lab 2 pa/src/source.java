//Pelcear Cristian
public class source
{
    private String name;
    private SourceType type;
    private int capacity;

    //constructors
    public source (String source_name, SourceType source_type, int source_capacity)
    {
        this.name=source_name;
        this.type=source_type;
        this.capacity=source_capacity;
    }

    // too see the name, type and capacity of the source

    public String getname()
     {
         return name;
     }
    public SourceType gettype()
    {
        return type;
    }
    public int getcapacity()
    {
        return capacity;
    }
    // set a new name, type and capacity

    public void setname(String new_name)
    {
        this.name=new_name;
    }
    public void settype(SourceType new_type)
    {
        this.type=new_type;
    }
    public void setcapacity(int new_capacity)
    {
        this.capacity=new_capacity;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type=" + type +
                '}';
    }

}
