package master;

public class master {
    int roll;
    String name;
    master(String a,Integer r)
    {
        this.roll=r;
        this.name=a;
    }
    public int getRoll()
    {
        return roll;
    }

    public void setRoll(int roll)
    {
        this.roll=roll;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

}

