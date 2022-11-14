import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumber game = new GuessNumber();
        Player[] p = new Player[2];
        int playerNum = 0;
        String answer = "yes";
        boolean checkWin = game.getCheckWin();

        for(int i = 0; i < 2; i++) {
            System.out.println("Введите имя игрока " + (i+1) +" : " );
            p[i] = new Player(scan.nextLine());
        }
        int i;
        int j;
        System.out.println("Начата новая игра");
        do {
            if(answer.equals("yes")) {
                j = 1;
                i = 0;
                playerNum = 0;
                game.doRandom();
                checkWin = game.restart();
                while(!checkWin) {
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
                    scan.nextLine();
                }
            } else {
                System.out.println("Ответ не распознан, попробуйте еще");
            }
            System.out.println("Хотите продолжить? [yes/no]");
            answer = scan.nextLine();
        } while(!answer.equals("no"));
    }
}