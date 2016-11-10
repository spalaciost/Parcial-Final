package businessLogic;

public class Dog extends Pet{
    private String breed;

    public Dog(String breed, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.breed = breed;
    }
    
    @Override
    public String sound(){
        return "guau";
    }
    
    
}
