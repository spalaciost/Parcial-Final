package gestion.de.proyectos;
import java.util.*;

public class Company {
    private HashMap<String, Client> clients;
    
    public Company(){
    this.clients=new HashMap<>();
    }
    public boolean addClient(Client cliente){
    return true;
    }
    public double CallAmountAllMarket(){
    return 0;
    }
    public double CallAllProfit(){
    return 0;
    }
    public ArrayList CallMarketAndProfitByAsset(){
    return null;
    }
    public ArrayList CallMarketAndProfitByAge(){
    return null;
    }
    public Client calClientMaxProfit(){
       return null;
    }
    
    public ArrayList listClient(){
      return null;
    }  
}
