package businessLogic;

import java.io.*;
import java.util.*;

public class Starter {

    public Person persona;
        ArrayList<Pet> mascotas= new ArrayList<>(); 
        ArrayList<Person> dueños= new ArrayList<>();
        ArrayList<Pet> dogs= new ArrayList<>(); 
        ArrayList<Pet> cats= new ArrayList<>();
        ArrayList<Pet> hamsters= new ArrayList<>(); 
        
    public static void main(String[] args) {
        Vet v= new Vet();

    }
    
    public void readPets(Vet v){
        try{
            
        Scanner entrada= new Scanner(new File("pets.txt"));
        int count=0;
        int lineas=0;
        int a=count%2;
        
        if(entrada.hasNextLine()){
        lineas++;
        }
         
        for (int i = 0; i <=lineas; i++) {

        if(a==0){
        while(entrada.hasNext()){
        String tipo=entrada.next();
        String id=entrada.next();
        String name= entrada.next();
        String hairColor= entrada.next();
        if(tipo=="Dog"){
            String breed= entrada.next();
            Dog dog= new Dog(breed,id, name, hairColor);
            mascotas.add(dog);
            dogs.add(dog);
        }else{
            if(tipo=="Cat"){
                boolean isHunter= entrada.nextBoolean();
                Cat cat=new Cat(isHunter, id, name, hairColor);
                mascotas.add(cat);
                cats.add(cat);
            }else{
                if(tipo=="Hamster"){
                    double weight= entrada.nextDouble();
                    Hamster hamster= new Hamster(weight, id, name, hairColor);
                    mascotas.add(hamster);
                    hamsters.add(hamster);
                }else{
                    System.out.println("Opcion no disponible");
                     }
                }
            }
        count++;
        }
        }else{
        String name= entrada.next();
        String id=entrada.next();
        Person dueño= new Person(name, id, mascotas.get(i) );
        }}

        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
        }  
    }
    
    public void manageVet(Vet v, String action){
   
        if(action=="a"){
            v.removePet(null);
        }else{
            if(action=="b"){
                
            }else{
                if(action=="c"){
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
                }else{
                    if (action=="d"){  
                        for (int i = 0; i < mascotas.size(); i++) {
                            System.out.println(mascotas.get(i));   
                        }
                    }else{
                        System.out.println("Opcion no disponible");
                    }
                }
            }
        }
    }
}
