
package automoviles;

public class Camionetas extends Autos{
    public int CapacidadCarga, Ejes, Rodadas;

    public Camionetas(int CapacidadCarga, int Ejes, int Rodadas, int serie, int año, String Marca, String color, double precio) {
        super(serie, año, Marca, color, precio);
        this.CapacidadCarga = CapacidadCarga;
        this.Ejes = Ejes;
        this.Rodadas = Rodadas;
    }

    @Override
    public String toString() {
        return "Camionetas{" + "CapacidadCarga=" + CapacidadCarga + ", Ejes=" + Ejes + ", Rodadas=" + Rodadas + '}';
    }
    
    
}
