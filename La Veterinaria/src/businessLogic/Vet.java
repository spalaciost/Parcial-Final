package businessLogic;

import java.util.*;

public class Vet {
    ArrayList<Pet> mascotas= new ArrayList<>();
    ArrayList<Pet> dogs= new ArrayList<>(); 
    ArrayList<Pet> cats= new ArrayList<>();
    ArrayList<Pet> hamsters= new ArrayList<>();

    public Vet() {
    }

    public void removePet(Pet p){
    String id= p.getId();

    }
    public void showPetsByTipe(String Type){
        
        System.out.println("ingrese el tipo de mascota del que desea la lista");
                    Scanner teclado= new Scanner(System.in);
                    String Tipo= teclado.next();
                    if(Tipo=="Perros"){
                    System.out.println("Perros");
                        for (int i = 0; i < dogs.size(); i++) {
                        System.out.println(dogs.get(i));
    } }
                    if(Tipo=="Gatos"){
                    System.out.println("Gatos");
                        for (int i = 0; i < cats.size(); i++) {
                        System.out.println(cats.get(i));
    } }
                    if(Tipo=="Hamsters"){
                    System.out.println("Hamsters");
                        for (int i = 0; i < hamsters.size(); i++) {
                        System.out.println(hamsters.get(i));
    }}
    }
    
    public void showPets(){
    for (int i = 0; i < mascotas.size(); i++) {
            System.out.println(mascotas.get(i));
    } 
}}
