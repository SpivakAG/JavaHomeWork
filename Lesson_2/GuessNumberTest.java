import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumber game = new GuessNumber();
        Player[] p = new Player[2];
        String answer = "yes";

        for(int i = 0; i < 2; i++) {
            System.out.println("Введите имя игрока " + (i+1) +" : " );
            p[i] = new Player(scan.nextLine());
        }
        System.out.println("Начата новая игра");
        do {
            if(answer.equals("yes")) {
                game.gameProcess(p[0].getName(), p[1].getName());
            } else {
                System.out.println("Ответ не распознан, попробуйте еще");
            }
            System.out.println("Хотите продолжить? [yes/no]");
            answer = scan.nextLine();
        } while(!answer.equals("no"));
    }
}