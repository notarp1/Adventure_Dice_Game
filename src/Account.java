public class Account {


    public int startBalance;
    public int currentBalance;
    public int oldBalance;

    public int caseNumber;

   public  Account(){
       startBalance = 1000;
    }


    public void landedOn(){


        switch (caseNumber) {

            case 2:

                this.currentBalance = oldBalance + 250;

                break;
            case 3:

                this.currentBalance = oldBalance -100;
                break;
            case 4:

                this.currentBalance = oldBalance + 100;
                break;
            case 5:

                this.currentBalance = oldBalance - 20;
                break;
            case 6:
                this.currentBalance = oldBalance + 180;
                break;
            case 7:

                this.currentBalance = oldBalance;

                break;
            case 8:
                this.currentBalance = oldBalance - 70;
                break;
            case 9:
                this.currentBalance = oldBalance + 60;
                break;
            case 10:
                this.currentBalance = oldBalance - 80;
                break;
            case 11:
                this.currentBalance = oldBalance - 50;
                break;
            case 12:
                this.currentBalance = oldBalance + 650;
                break;
        }

    }

}


