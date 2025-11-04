package сom.enterprise;

public class Firm {
    private String name;

    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название фирмы не может быть пустым");
        }
        this.name = name;
    }
}