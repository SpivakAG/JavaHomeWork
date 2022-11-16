import java.util.Scanner;

public class GuessNumber {
    private Scanner scan = new Scanner(System.in);
    private int hiddenNum;
    private boolean checkWin = false;
    private int playerNum = 0;
    private String currentPlayer = "";

    public int getNumber(){
        return hiddenNum;
    }
    public void checkNum (int playerNum, String playerName) {
            if(playerNum > hiddenNum) {
                System.out.println("Число " + playerNum + " больше, чем загадал компьютер");
            } else  if(playerNum < hiddenNum) {
                System.out.println("Число " + playerNum + " меньше, чем загадал компьютер");
            } else {
                System.out.println("Победил " + playerName);
                checkWin = true;
            }
    }

    public void gameProcess(String playerName1,String playerName2) {
        int j = 1;
        int i = 0;
        playerNum = 0;
        hiddenNum = (int) (Math.random() * 100);
        checkWin = false;
        while(!checkWin) {
            if(j % 2 != 0) {
                i = 0;
                currentPlayer = playerName1;
            } else {
                i = 1;
                currentPlayer = playerName2;
            }
            System.out.println("Ход игрока " + currentPlayer);
            playerNum = scan.nextInt();
            checkNum(playerNum, currentPlayer);
            j++;
            scan.nextLine();
        }
    }
}