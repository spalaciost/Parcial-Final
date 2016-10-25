package gestion.de.proyectos;

public class Client {
    public String nombre, apellido, email;
    public int telefono, edad, numAsset, cedula;
    
    private Asset[] assets;

    public Client(String nombre, String apellido, String email, int telefono, 
            int edad, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.assets = new Asset[10];
        this.cedula=cedula;
        this.numAsset=0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumAsset() {
        return numAsset;
    }
    public int getCedula() {
        return cedula;
    }
    public Asset[] getAssets() {
        return assets;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumAsset(int numAsset) {
        this.numAsset = numAsset;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }
    
    public double SumProfit(){
    double ProfitValue=0;
        for (Asset asset : assets) {
            ProfitValue+=asset.getProfit();
        }
        return ProfitValue;
    }
    public double sumMarketValue(){
    double MarketValue=0;
        for (Asset asset : assets) {
            MarketValue+=asset.getMarketValue();
        }
        return MarketValue;
    }
    public boolean addAsset(Asset asset){
    if(this.numAsset<10){
        this.assets[this.numAsset]=asset;
        this.numAsset++;
    }else{
    throw new IllegalArgumentException("hay mas de 10 activos");
    }
    return false;
    }
}
