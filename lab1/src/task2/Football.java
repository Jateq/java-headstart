package task2;

public class Football {
	
    private static String league;
    private final String TEAM = "Jateq";
    private String name;
    private Positions position; 
    private int goalsScored;

    
    public Football() {
        
    }
   
    public static void setLeague(String userLeague) {
    	league = userLeague;
    }
    
    public static String getLeague() {
    	return league;
    }
    
    public String getTeam() {
    	return this.TEAM;
    }

    public Positions getPosition() {
        return this.position;
    }
    
    public String getPlayerName() {
        return this.name;
    }
    
    public void setPlayer(String name, Positions position) {
    	this.name = name;
    	this.position = position;
    }
    
    public int getGoals() {
        return this.goalsScored;
    }

    public void scoreGoal() {
        goalsScored++;
    }

}
