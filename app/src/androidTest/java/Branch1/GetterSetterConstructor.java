package Branch1;

public class GetterSetterConstructor
{
    int roll;
    String name;
    GetterSetterConstructor(String n, int r)
    {
        this.roll=r;
        this.name=n;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

