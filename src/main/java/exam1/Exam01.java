package exam1;

public class Exam01 {
    private int playerA = 0;

    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        playerA += 15;
    }

    public void playerBWin() {
    }

    public String getScore() {
        String score = "";
        switch (playerA) {
            case 15:
                score = "Fifteen-Love";
                break;
            case 30:
                score = "Thirty-Love";
                break;
            default:
                score = "Love-All";
        }
        return score;
    }

}
