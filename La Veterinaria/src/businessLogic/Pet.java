package businessLogic;

public abstract class Pet {
    private String id;
    private String name;
    private String hairColor;
    
    abstract public String sound();

    public Pet(String id, String name, String hairColor) {
        this.id = id;
        this.name = name;
        this.hairColor = hairColor;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    
}
