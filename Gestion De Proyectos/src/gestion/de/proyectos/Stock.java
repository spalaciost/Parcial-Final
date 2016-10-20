package gestion.de.proyectos;

public abstract class Stock extends ShareAsset{
    public int totalShare;

    public Stock(int totalShare, String symbol, double TotalCost, double CurrentPrice) {
        super(symbol, TotalCost, CurrentPrice);
        this.totalShare = totalShare;
    }
    
    @Override
     public double getMarketValue(){
     double M= CurrentPrice*totalShare;
     return M;
     };
     
     @Override
    public double getProfit(){
     return (totalShare*CurrentPrice)-TotalCost;
    }
}
