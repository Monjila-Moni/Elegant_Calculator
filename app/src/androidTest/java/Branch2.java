
public class Branch2 {
    String name,id;
    float cgpa;




    Branch2(String name, String id, float cgpa,double income)
    {
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
}