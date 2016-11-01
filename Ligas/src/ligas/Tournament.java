package ligas;
import java.util.*;

public class Tournament {
public Date Start, End;
public ArrayList<Player> players;

    public Tournament(Date Start, Date End) {
        this.Start = Start;
        this.End = End;
        this.players = new ArrayList<>();
    }

    public Date getStart() {
        return Start;
    }

    public Date getEnd() {
        return End;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setStart(Date Start) {
        this.Start = Start;
    }

    public void setEnd(Date End) {
        this.End = End;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    public boolean Duracion(Date Start,Date end){
    int dias= end.getDate()-Start.getDate();
    if(dias>7){
        System.out.println("el torneo a durado mas de una semana, este a durado "+dias+" dias");
        return true;
    }else{
        System.out.println("el torneo a durado menos de una semana, este a durado "+dias+" dias");
        return false;
    }    
    }
    public boolean acceptPlayer(Player a){
    if(a.getLeagues()!=null){
        this.players.add(a);
    return true;
    }else{ 
        return false;
    }
    }
}     