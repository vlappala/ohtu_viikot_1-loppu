package ohtu;

public class TennisGame {
    
    private int points_player_one = 0;
    private int points_player_two = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            points_player_one += 1;
        else
            points_player_two += 1;
    }

    

    public String getScore() {
        String score = "";
        
        if (points_player_one==points_player_two)
        {
            score = getEvenResult(points_player_one);
        }
        else if (points_player_one>=4 || points_player_two>=4)
        {
            score = getExtendedGameResult();
        }
        else
        {
            score = getInProgressResult();
        }
        return score;
    }

    private String getEvenResult(int points) {

        String score = "";

        switch (points_player_one)
            {
                case 0:
                        score = "Love-All";
                    break;
                case 1:
                        score = "Fifteen-All";
                    break;
                case 2:
                        score = "Thirty-All";
                    break;
                case 3:
                        score = "Forty-All";
                    break;
                default:
                        score = "Deuce";
                    break;
                
            }
        return score;

    } 

    private String getExtendedGameResult() {

        String score = "";

        int minusResult = points_player_one-points_player_two;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";

        return score;
    }

    private String getInProgressResult() {

        String score = "";
        int tempScore = 0;

        for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = points_player_one;
                else { score+="-"; tempScore = points_player_two;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        return score;
    }
}