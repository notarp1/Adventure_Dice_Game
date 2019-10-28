import java.util.Scanner;

public class AdventureDiceGame {


    public static void main(String[] args) {

        Player player1, player2;


        System.out.println("Spiller 1 indtast dit navn");
        player1 = new Player();
        System.out.println(player1.playerName);
        System.out.println("Balance:  " + player1.balance);

        System.out.println();

        System.out.println("Spiller 2 indtast dit navn");
        player2 = new Player();
        System.out.println(player2.playerName);
        System.out.println("Balance:  " + player2.balance);
        System.out.println();

        Shaker shaker;
        shaker = new Shaker();

        System.out.println("Slå sten, saks, papir om hvem der starter");

        while (player1.balance < 3000 && player2.balance < 3000) {
            Scanner input = new Scanner(System.in);

            System.out.println();
            System.out.println("Tryk 'E' + enter for " + player1.playerName + "'s tur");
            System.out.println("Tryk 'T' + enter for " + player2.playerName + "'s tur");

            String roll = input.nextLine();

            if (roll.equals("e")) {

                int sum = shaker.rollDice();
                System.out.println(player1.playerName + " slog " + sum + " og lander på: ");

                switch (sum) {

                    case 2:
                        System.out.println("Tower: +250 point");
                        player1.setFelt(2);
                        System.out.println(player1.playerName + " total " + player1.balance + " point");
                        player1.fixNegativeBalance();
                        break;

                    case 3:
                        System.out.println("Crater: -100 point");
                        player1.setFelt(3);
                        System.out.println(player1.playerName + " total " + player1.balance + " point");
                        player1.fixNegativeBalance();
                        break;

                    case 4:
                        System.out.println("Palace Gates: +100 point");
                        player1.setFelt(4);
                        System.out.println(player1.playerName + " total " + player1.balance + " point");
                        player1.fixNegativeBalance();
                        break;

                    case 5:
                        System.out.println("Cold Desert: -20 point ");
                        player1.setFelt(5);
                        System.out.println(player1.playerName + " total " + player1.balance + " point");
                        player1.fixNegativeBalance();
                        break;

                    case 6:
                        System.out.println("Walled City: +180 point");
                        player1.setFelt(6);
                        System.out.println(player1.playerName + " total " + player1.balance + " point");
                        player1.fixNegativeBalance();
                        break;

                    case 7:
                        System.out.println("Monastery: 0 point");
                        player1.setFelt(7);
                        System.out.println(player1.playerName + " total " + player1.balance + " point");

                        break;

                    case 8:
                        System.out.println("Black Cave: -70 point");
                        player1.setFelt(8);
                        System.out.println(player1.playerName + " total " + player1.balance + " point");
                        player1.fixNegativeBalance();
                        break;

                    case 9:
                        System.out.println("Huts in the mountain: +60 point");
                        player1.setFelt(9);
                        System.out.println(player1.playerName + " total " + player1.balance + " point");
                        player1.fixNegativeBalance();
                        break;

                    case 10:
                        System.out.println("The Werewall: -80 point");
                        System.out.println(player1.playerName + " får en ekstra tur");
                        player1.setFelt(10);
                        System.out.println(player1.playerName + " total " + player1.balance + " point");
                        player1.fixNegativeBalance();
                        break;

                    case 11:
                        System.out.println("The pit: -50 point");
                        player1.setFelt(11);
                        System.out.println(player1.playerName + " total " + player1.balance + " point");
                        player1.fixNegativeBalance();
                        break;

                    case 12:
                        System.out.println("Goldmine: +650 point");
                        player1.setFelt(12);
                        System.out.println(player1.playerName + " total " + player1.balance + " point");
                        player1.fixNegativeBalance();
                        break;
                }

            }

            if (roll.equals("t")) {


                int sum = shaker.rollDice();
                System.out.println(player2.playerName + " slog " + sum + " og lander på: ");

                switch (sum) {

                    case 2:
                        System.out.println("Tower: +250 point");
                        player2.setFelt(2);
                        System.out.println(player2.playerName + " total " + player2.balance + " point");
                        player2.fixNegativeBalance();
                        break;

                    case 3:
                        System.out.println("Crater: -100 point");
                        player2.setFelt(3);
                        System.out.println(player2.playerName + " total " + player2.balance + " point");
                        player2.fixNegativeBalance();
                        break;

                    case 4:
                        System.out.println("Palace Gates: +100 point");
                        player2.setFelt(4);
                        System.out.println(player2.playerName + " total " + player2.balance + " point");
                        player2.fixNegativeBalance();
                        break;

                    case 5:
                        System.out.println("Cold Desert: -20 point ");
                        player2.setFelt(5);
                        System.out.println(player2.playerName + " total " + player2.balance + " point");
                        player2.fixNegativeBalance();
                        break;

                    case 6:
                        System.out.println("Walled City: +180 point");
                        player2.setFelt(6);
                        System.out.println(player2.playerName + " total " + player2.balance + " point");
                        player2.fixNegativeBalance();
                        break;

                    case 7:
                        System.out.println("Monastery: 0 point");
                        player2.setFelt(7);
                        System.out.println(player2.playerName + " total " + player2.balance + " point");
                        player2.fixNegativeBalance();
                        break;

                    case 8:
                        System.out.println("Black Cave: -70 point");
                        player2.setFelt(8);
                        System.out.println(player2.playerName + " total " + player2.balance + " point");
                        player2.fixNegativeBalance();
                        break;

                    case 9:
                        System.out.println("Huts in the mountain: +60 point");
                        player2.setFelt(9);
                        System.out.println(player2.playerName + " total " + player2.balance + " point");
                        player2.fixNegativeBalance();
                        break;

                    case 10:
                        System.out.println("The Werewall: -80 point");
                        System.out.println(player2.playerName + " får en ekstra tur");
                        player2.setFelt(10);
                        System.out.println(player2.playerName + " total " + player2.balance + " point");
                        player2.fixNegativeBalance();
                        break;

                    case 11:
                        System.out.println("The pit: -50 point");
                        player2.setFelt(11);
                        System.out.println(player2.playerName + " total " + player2.balance + " point");
                        player2.fixNegativeBalance();
                        break;

                    case 12:
                        System.out.println("Goldmine: +650 point");
                        player2.setFelt(12);
                        System.out.println(player2.playerName + " total " + player2.balance + " point");
                        player2.fixNegativeBalance();
                        break;
                }

            }



        }

        if(player1.balance >= 3000){
            System.out.println("Tillykke " + player1.playerName + " har vundet spillet!");
        }

        if(player2.balance >= 3000){
            System.out.println("Tillykke " + player2.playerName + " har vundet spillet!");
        }
    }
}