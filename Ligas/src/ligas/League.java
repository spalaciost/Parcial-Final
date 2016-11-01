package ligas;

import java.util.ArrayList;
import java.util.Date;

public class League {
    Date Strart, End;
    public ArrayList<Player> players;
    public ArrayList<Tournament> tournaments;

    public League(Date Strart, Date End) {
        this.Strart = Strart;
        this.End = End;
        this.players = new ArrayList<>();
        this.tournaments = new ArrayList<>();
    }

    public Date getStrart() {
        return Strart;
    }

    public Date getEnd() {
        return End;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Tournament> getTournaments() {
        return tournaments;
    }

    public void setStrart(Date Strart) {
        this.Strart = Strart;
    }

    public void setEnd(Date End) {
        this.End = End;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void setTournaments(ArrayList<Tournament> tournaments) {
        this.tournaments = tournaments;
    }

    public ArrayList<Player> getActivePlayers(){
    ArrayList<Player> players=
            new ArrayList<>();
    for(Tournament s:this.tournaments)
        for(Player e:s.getPlayers())
        players.add(e);
    return players;    
    }   
}