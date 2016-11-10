package businessLogic;

public class Cat extends Pet{
    private boolean isHunter;

    public Cat(boolean isHunter, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.isHunter = isHunter;
    }
    
    @Override
    public String sound(){
        return "miau";
    }
}
