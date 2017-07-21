package exam1;

public class Exam01 {
    private String mFirstPerson;
    private String mSecondPerson;
    private int scorePlayerA = 0;
    private int scorePlayerB = 0;
    private String whoGetPoint = "";
    private String deuce = "";
    private String game = null;


    public Exam01(String firstPerson, String secondPerson) {
        this.mFirstPerson = firstPerson;
        this.mSecondPerson = secondPerson;
    }

    public void playerAWin() {
        int point = 15;
        if (deuce.equals("A")) {
            game = mFirstPerson;
        } else if (deuce.equals("B")) {
            deuce = "";
            whoGetPoint = "";
            return;
        } else if (scorePlayerA == 40) {
            if (scorePlayerB == 40) {
                deuce = "A";
                whoGetPoint = "A";
                return;
            } else
                game = mFirstPerson;
        } else if (scorePlayerA == 30) {
            point = 10;
        }

        scorePlayerA += point;
        whoGetPoint = "A";
    }

    public void playerBWin() {
        int point = 15;
        if (deuce.equals("B")) {
            game = mSecondPerson;
        } else if (deuce.equals("A")) {
            deuce = "";
            whoGetPoint = "";
            return;
        } else if (scorePlayerB == 40) {
            if (scorePlayerA == 40) {
                deuce = "B";
                whoGetPoint = "B";
                return;
            } else
                game = mSecondPerson;
        } else if (scorePlayerB == 30) {
            point = 10;
        }

        scorePlayerB += point;
        whoGetPoint = "B";
    }


    public String getScore() {
        String score = "";
        if (game != null) {
            score = "Win for " + game;
        } else {
            if (deuce.equals("A")) {
                score = "Advantage " + mFirstPerson;
            } else if (deuce.equals("B")) {
                score = "Advantage " + mSecondPerson;
            } else if (scorePlayerA == scorePlayerB) {
                switch (scorePlayerA) {
                    case 0:
                    case 15:
                    case 30:
                        score = convertNumber2String(scorePlayerA) + "-All";
                        break;
                    case 40:
                        score = "Deuce";
                        break;
                }
            } else if (scorePlayerA != 0 && scorePlayerB != 0) {
                score = convertNumber2String(scorePlayerA) + "-" + convertNumber2String(scorePlayerB);
            } else if (whoGetPoint.equals("A")) {
                score = convertNumber2String(scorePlayerA) + "-Love";

            } else if (whoGetPoint.equals("B")) {
                score = "Love-" + convertNumber2String(scorePlayerB);
            }
        }
        return score;
    }


    private String convertNumber2String(int number) {
        String ans = "";
        switch (number) {
            case 0:
                ans = "Love";
                break;
            case 15:
                ans = "Fifteen";
                break;
            case 30:
                ans = "Thirty";
                break;
            case 40:
                ans = "Forty";
                break;
        }
        return ans;
    }

}
