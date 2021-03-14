package entities;

public class Courses {
    private int id;
    private String name;
    private boolean active;

    public Courses() {

    }

    public Courses(String name, boolean active) {
        setName(name);
        setActive(active);
    }

    public Courses(int id, String name, boolean active) {
        this(name, active);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
