package gestion.de.proyectos;

public class Client {
    public String nombre, apellido, email;
    public int telefono, edad;
    
    private Asset[] assets;

    public Client(String nombre, String apellido, String email, int telefono, 
            int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.assets = new Asset[10];
    }
    public double SumProfit(){
    return 0;
    }
    public double sumMarketValue(){
    return 0;
    }
    public boolean addAsset(Asset asset){
    return true;
    }
}
