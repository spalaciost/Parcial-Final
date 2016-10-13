
package automoviles;


public class AutosLujo extends Autos{
    public int NumPasajeros;

    public AutosLujo(int NumPasajeros, int serie, int año, String Marca, String color, double precio) {
        super(serie, año, Marca, color, precio);
        this.NumPasajeros = NumPasajeros;
    }


    @Override
    public String toString() {
        return "AutosLujo{" + "NumPasajeros=" + NumPasajeros + '}';
    }
    
}
