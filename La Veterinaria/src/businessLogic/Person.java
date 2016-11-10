package businessLogic;

public class Person {
    private String name;
    private String id;
    public Pet e;

    public Person(String name, String id, Pet e) {
        this.name = name;
        this.id = id;
        this.e = e;
    }

    public void showPets(){
        System.out.println();
    }
}
