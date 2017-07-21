package exam1;

public class Exam01 {
    private int socrePlayerA = 0;

    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        int point = 15;
        if (socrePlayerA == 30) {
            point = 10;
        }
        socrePlayerA += point;
    }

    public void playerBWin() {
    }

    public String getScore() {
        String score = "";
        switch (socrePlayerA) {
            case 15:
                score = "Fifteen-Love";
                break;
            case 30:
                score = "Thirty-Love";
                break;
            case 40:
                score = "Forty-Love";
                break;
            default:
                score = "Love-All";
        }
        return score;
    }

}
