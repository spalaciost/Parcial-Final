
package automoviles;


public class AutosCompactos extends Autos{
    public int NumPasajeros;

    public AutosCompactos(int NumPasajeros, int serie, int año, String Marca, String color, double precio) {
        super(serie, año, Marca, color, precio);
        this.NumPasajeros = NumPasajeros;
    }

    @Override
    public String toString() {
        return "AutosCompactos{" + "NumPasajeros=" + NumPasajeros + '}';
    }
    
}
