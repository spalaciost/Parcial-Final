package gestion.de.proyectos;
import java.util.*;

public class Company {
    private HashMap<String, Client> clients;
    
    public Company(){
    this.clients=new HashMap<>();
    }
    public boolean addClient(Client cliente){
        if(!this.clients.containsKey(cliente.getCedula())){
            this.clients.put(cliente.getCedula(), cliente);
            return true;
            }
            return false;
    }
    
    public double CallAmountAllMarket(){
    double MarketValue=0;
    for (Client client: this.clients.values()){
    MarketValue+=client.sumMarketValue();
    }
    return MarketValue;
    }
    
    public double CallAllProfit(){
    double ProfitValue=0;
    for (Client client: this.clients.values()){
    ProfitValue+=client.SumProfit();
    }
    return ProfitValue;
    }
    
    public ArrayList CallMarketAndProfitByAsset(){
    return null;
    }
    
    public ArrayList CallMarketAndProfitByAge(){
    return null;
    }
    
    public Client calClientMaxProfit(){
       Client maxProfit=null;
        for (Client cliente : this.clients.values()) {
            if(maxProfit==null)
                maxProfit=cliente;
            else{
            if(cliente.SumProfit()>maxProfit.SumProfit())
                maxProfit=cliente;
            }
        }
        return maxProfit;
    }
    
    public ArrayList listClient(){
      ArrayList<Client> Clients = new ArrayList();
        for (Client cliente : this.clients.values()) 
            Clients.add(cliente);
        for (int i = 0; i < Clients.size(); i++) {
            Client actual=this.clients.get(i);
            int pos=i;
            for (int j = i+1; j <Clients.size(); j++) {
                if(actual.sumMarketValue()>clients.get(j).sumMarketValue()){
                pos=j;}
            }
        Client temp=this.clients.get(pos);
    } 
        return Clients;
    }
}
