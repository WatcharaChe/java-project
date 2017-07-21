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

    public void playerAWinTEMP() {
        int point = 15;
        if (scorePlayerA == 45) {
            point = 5;
        } else if (scorePlayerB == 45 && scorePlayerA == 40) {
            scorePlayerB -= 5;
            whoGetPoint = "";
            return;
        } else if (scorePlayerA == 40 && scorePlayerB == 40) {
            point = 5;
        } else if (scorePlayerA >= 30) {
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

    public void playerBWinTEMP() {
        int point = 15;
        if (scorePlayerB == 45) {
            point = 5;
        } else if (scorePlayerA == 45 && scorePlayerB == 40) {
            scorePlayerA -= 5;
            whoGetPoint = "";
            return;
        } else if (scorePlayerA == 40 && scorePlayerB == 40) {
            point = 5;
        } else if (scorePlayerB >= 30) {
            point = 10;
        }
        scorePlayerB += point;
        whoGetPoint = "B";
    }

    public String getScoreTEMP() {
        String score = "";

        if (scorePlayerA == 50) {
            score = "Win for Player A";
        } else if (scorePlayerB == 50) {
            score = "Win for Player B";
        } else if (scorePlayerA == 45) {
            score = "Advantage Player A";
        } else if (scorePlayerB == 45) {
            score = "Advantage Player B";
        } else if (scorePlayerA == scorePlayerB) {
            switch (scorePlayerA) {
                case 15:
                    score = "Fifteen-All";
                    break;
                case 30:
                    score = "Thirty-All";
                    break;
                case 40:
                    score = "Deuce";
                    break;
                case 50:
                    score = "Win for Player A";
                    break;
                case 0:
                    score = "Love-All";
                    break;
            }

            return score;
        } else {
            score = convertNumber2String(scorePlayerA) + "-" + convertNumber2String(scorePlayerB);
        }


        if (whoGetPoint.equals("A") && scorePlayerB == 0) {
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
        } else if (whoGetPoint.equals("B") && scorePlayerA == 0) {
            switch (scorePlayerB) {
                case 15:
                    score = "Love-Fifteen";
                    break;
                case 30:
                    score = "Love-Thirty";
                    break;
                case 40:
                    score = "Love-Forty";
                    break;
                case 50:
                    score = "Win for Player B";
                    break;
            }
        }


        return score;
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
                    case 15:
                        score = "Fifteen-All";
                        break;
                    case 30:
                        score = "Thirty-All";
                        break;
                    case 40:
                        score = "Deuce";
                        break;
                    case 0:
                        score = "Love-All";
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
