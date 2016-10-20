package gestion.de.proyectos;

public abstract class Cash implements Asset{
    private double amount;

    
    public Cash(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    
    @Override
    public double getMarketValue(){
    return this.amount;
    }
    
    @Override
    public double getProfit(){
        return 0;
    }
}
