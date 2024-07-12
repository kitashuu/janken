package src;
import java.util.Random;
public class Player {

    private String playerName;
    public void createRandomHand() {



        Random random = new Random();

        int randomValue = random.nextInt(3);



        if(randomValue == 0) {

            this.hand = new Gu();

        } else if(randomValue == 1) {

            this.hand = new Choki();

        } else {

            this.hand = new Pa();

        }

    }



    public Player(String playerName) {

        this.playerName = playerName;

    }

    public String getPlayerName() {

        return playerName;

    }

    public void setPlayerName(String playerName) {

        this.playerName = playerName;

    }

}




