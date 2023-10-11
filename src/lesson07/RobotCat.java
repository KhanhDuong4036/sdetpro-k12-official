package lesson07;

public class RobotCat {
    private String name;
    private int id;

    public RobotCat() {
    }

    public RobotCat(String name) {
        this.name = name;
    }

    //Getter
    public String getName() {
        return this.name;
    }

    public RobotCat(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

}
