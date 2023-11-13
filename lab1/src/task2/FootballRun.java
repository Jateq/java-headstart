package task2;

public class FootballRun {
    public static void main(String[] args) {



        Football.setLeague("Premier League");

        Football player1 = new Football();
        Football player2 = new Football();
        
        player1.setPlayer("Haaland", Positions.Striker);
        player2.setPlayer("Bellingham", Positions.Midfielder);

        
        System.out.println("First player: " + player1.getPlayerName() + " | Position: " + player1.getPosition());
        System.out.println("Second player: " + player2.getPlayerName() + " | Position: " + player2.getPosition());

        player1.scoreGoal();
        player2.scoreGoal();
        player1.scoreGoal();

        System.out.println("Goals scored by " +player1.getPlayerName() + " is " + player1.getGoals() + " goals");
        System.out.println("Goals scored by " +player2.getPlayerName() + " is " + player2.getGoals() + " goals");


        System.out.println("League: " + Football.getLeague() + ", team: " + player1.getTeam());
    }
}
