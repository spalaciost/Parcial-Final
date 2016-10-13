
package automoviles;

public class Vagonetas extends Autos{
    public int NumPasajeros;

    public Vagonetas(int NumPasajeros, int serie, int año, String Marca, String color, double precio) {
        super(serie, año, Marca, color, precio);
        this.NumPasajeros = NumPasajeros;
    }

    @Override
    public String toString() {
        return "Vagonetas{" + "NumPasajeros=" + NumPasajeros + '}';
    }
    
}
