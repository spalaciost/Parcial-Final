package businessLogic;

public class Hamster extends Pet{
    private double weight;

    public Hamster(double weight, String id, String name, String hairColor) {
        super(id, name, hairColor);
        this.weight = weight;
    }

    @Override
    public String sound(){
        return null;
    }
}
