package exam1;

public class Exam01 {
    private int scorePlayerA = 0;
    private int scorePlayerB = 0;
    private String whoGetPoint = "";

    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        int point = 15;
        if(scorePlayerA == 45){
            point = 5;
        }else
        if(scorePlayerB == 45 && scorePlayerA == 40){
            scorePlayerB -= 5;
            whoGetPoint = "";
            return;
        }else
        if (scorePlayerA == 40 && scorePlayerB == 40) {
            point = 5;
        } else if (scorePlayerA >= 30) {
            point = 10;
        }

        scorePlayerA += point;
        whoGetPoint = "A";
    }

    public void playerBWin() {
        int point = 15;
        if(scorePlayerB == 45){
            point = 5;
        }else
        if(scorePlayerA == 45 && scorePlayerB == 40){
            scorePlayerA -= 5;
            whoGetPoint = "";
            return;
        }
        else if (scorePlayerA == 40 && scorePlayerB == 40) {
            point = 5;
        } else if (scorePlayerB >= 30) {
            point = 10;
        }
        scorePlayerB += point;
        whoGetPoint = "B";
    }

    public String getScore() {
        String score = "";
        if(scorePlayerA == 50){
            score = "Win for Player A";
        }else if (scorePlayerB == 50){
            score = "Win for Player B";
        }
        else if( scorePlayerA == 45){
            score = "Advantage Player A";
        }
        else if (scorePlayerB == 45){
            score = "Advantage Player B";
        }
        else if (scorePlayerA == scorePlayerB) {
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
        }
        else{
                score = n2s(scorePlayerA) + "-" + n2s(scorePlayerB);
        }


        if(whoGetPoint.equals("A") && scorePlayerB == 0) {
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
        } else if (whoGetPoint.equals("B") &&scorePlayerA == 0) {
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
    private String n2s(int number){
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
