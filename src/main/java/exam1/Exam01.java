package exam1;

public class Exam01 {
    private int scorePlayerA = 0;
    private int scorePlayerB = 0;
    private String whoGetPoint = "";

    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        int point = 15;
        if (scorePlayerA >= 30) {
            point = 10;
        }
        scorePlayerA += point;
        whoGetPoint = "A";
    }

    public void playerBWin() {
        int point = 15;
        if (scorePlayerB >= 30) {
            point = 10;
        }
        scorePlayerB += point;
        whoGetPoint = "B";
    }

    public String getScore() {
        String score = "";

        if (whoGetPoint.equals("A")) {
            switch (scorePlayerA) {
                case 15:
                    score = "Fifteen-Love";
                    break;
                case 30:
                    score = "Thirty-Love";
                    break;
                case 40:
                    score = "Forty-Love";
                    break;
                case 50:
                    score = "Win for Player A";
                    break;
            }
        } else if (whoGetPoint.equals("B")) {
            switch (scorePlayerB) {
                case 15:
                    score = "Love-Fifteen";
                    break;
            }
        } else {
            score = "Love-All";
        }


        return score;
    }

}
