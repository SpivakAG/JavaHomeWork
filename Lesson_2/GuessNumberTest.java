import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumber game = new GuessNumber();
        Player[] p = new Player[2];
        int playerNum = 0;
        String answer = "";
        boolean repeat = false;
        boolean wrongAnswer = false;
        boolean checkWin = game.getCheckWin();

        for(int i = 0; i < 2; i++) {
            System.out.println("Введите имя игрока " + (i+1) +" : " );
            p[i] = new Player(scan.nextLine());
        }
        int i;
        int j;
        do {
            j = 1;
            i = 0;
            game.doRandom();
            while(!game.getCheckWin()) {
                if(j % 2 != 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                System.out.println("Ход игрока " + p[i].getName());
                playerNum = scan.nextInt();
                game.checkNum(playerNum, p[i].getName());
                checkWin = game.getCheckWin();
                j++;
            }
            do {
                wrongAnswer = false;
                System.out.println("Хотите продолжить игру? [yes/no]:");
                scan.nextLine();
                answer = scan.nextLine();
                switch(answer) {
                    case "yes":
                        repeat = true;
                        break;
                    case "no":
                        repeat = false;
                        break;
                    default:
                        System.out.println("Ответ не распознан, попробуйте еще");
                        wrongAnswer = true;
                }
            } while(wrongAnswer);
        } while(repeat);
    }
}