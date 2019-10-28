public class Shaker {

    private Die die1;
    private Die die2;


    Shaker() {

        die1 = new Die();
        die2 = new Die();

    }

    int rollDice(){

        die1.roll();
        die2.roll();

        return die1.getFaceValue() + die2.getFaceValue();
    }



}
