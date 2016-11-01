package ligas;

import java.util.*;

public class Player {
    String name, email;
    public ArrayList<Tournament> tournaments;
    public ArrayList<League> leagues;

    public Player(String name, String email) {
        this.name = name;
        this.email = email;
        this.tournaments = new ArrayList<>();
        this.leagues = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Tournament> getTournaments() {
        return tournaments;
    }

    public ArrayList<League> getLeagues() {
        return leagues;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTournaments(ArrayList<Tournament> tournaments) {
        this.tournaments = tournaments;
    }

    public void setLeagues(ArrayList<League> leagues) {
        this.leagues = leagues;
    }
   
}