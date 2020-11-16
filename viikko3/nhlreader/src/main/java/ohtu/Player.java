
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private String nationality;
    private String team;


    private int goals;



    private int assists;

    public int getAssists() {
    	return this.assists;
    }
    public void setAssists(int assists) {
    	this.assists = assists;
    }

    public String getTeam() {
    	return this.team;
    }
    public void setTeam(String team) {
    	this.team = team;
    }

    public int getGoals() {
    	return this.goals;
    }
    public void setGoals(int goals) {
    	this.goals = goals;
    }




    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    

    public void setNationality(String NAT) {
        this.nationality = NAT;
    }

    public String getNationality() {
        return this.nationality;
    }

    @Override
    public String toString() {
        return name+", "+"team: "+team+" goals: "+goals+", assists: "+assists;
    }

    @Override
    public int compareTo(Player p) {
        return (p.goals+p.assists)-(this.goals+this.assists);
    }
      
}
