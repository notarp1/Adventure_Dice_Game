import java.util.Scanner;

class Player {

    private String input;
    String playerName;

    int balance;

    private Account account = new Account();

    Player(){

        Username();
        playerName = input;
        balance = account.startBalance;

    }

    private void Username(){

        Scanner scan = new Scanner(System.in);
        this.input = scan.nextLine();


    }

    void setFelt(int felt){
        account.caseNumber = felt;
        account.oldBalance = balance;
        account.landedOn();
        balance = account.currentBalance;
    }

    void fixNegativeBalance(){

        if(balance < 0){

            balance = 0;
            System.out.println("Da din balance er blevet nulstillet da den ikke kan gå i minus");
            System.out.println(playerName + ": " + balance);
        }


    }


}
