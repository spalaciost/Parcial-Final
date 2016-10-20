package gestion.de.proyectos;

public class DividendStock extends Stock{
   public double dividends;

    public DividendStock(double dividends, int totalShare, String symbol, double TotalCost, double CurrentPrice) {
        super(totalShare, symbol, TotalCost, CurrentPrice);
        this.dividends = dividends;
    }
   
   @Override
    public double getMarketValue(){
    double M= super.getMarketValue()+this.dividends;
     return M;
    }
    
    @Override
    public double getProfit(){
     return (totalShare*CurrentPrice)-TotalCost;
    }
}
