package Recursion;

/**
 * Input
 */
public class Input {

    private String name;
    private int rol;
    private String section;

    public Input(String name, int rol, String section) {
        this.name = name;
        this.rol = rol;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Input{}";
    }
}