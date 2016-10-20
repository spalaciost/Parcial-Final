package gestion.de.proyectos;

public abstract class MutualFund extends ShareAsset{
    public double totalShare;

    public MutualFund(double totalShare, String symbol, double TotalCost, double CurrentPrice) {
        super(symbol, TotalCost, CurrentPrice);
        this.totalShare = totalShare;
    }
    
    
    @Override
    public double getMarketValue(){
     double M= this.CurrentPrice*this.totalShare;
     return M;
     }
    
    @Override
    public double getProfit(){
     return (this.totalShare*this.CurrentPrice)-this.TotalCost;
    }
}
