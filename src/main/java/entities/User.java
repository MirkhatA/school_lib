package entities;

public class User {
    private int id;
    private String name;
    private String surname;
    private boolean gender;
    private String groupname;
    private String username;
    private String password;

    public User() {

    }

    public User(String name, String surname, boolean gender, String groupname, String username, String password) {
        setName(name);
        setSurname(surname);
        setGender(gender);
        setGroupname(groupname);
        setUsername(username);
        setPassword(password);
    }

    public User(int id, String name, String surname, boolean gender, String groupname, String username, String password) {
        this(name, surname, gender, groupname, username, password);
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
