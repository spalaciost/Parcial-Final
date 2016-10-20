package gestion.de.proyectos;

public abstract class ShareAsset implements Asset{
    protected String symbol;
    protected double TotalCost;
    protected double CurrentPrice;

    public ShareAsset(String symbol, double TotalCost, double CurrentPrice) {
        this.symbol = symbol;
        this.TotalCost = TotalCost;
        this.CurrentPrice = CurrentPrice;
    }
}
