public class GuesNumber {

    public static void main(String[] args) {
        double hiddenNum = (int) (Math.random() * 100);
        int playerNum = 0;
        while(playerNum != hiddenNum) {
            if(playerNum > hiddenNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum--;
            } else {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum++;
            }
        }
        System.out.println("Вы победили! Загаданное число " + hiddenNum);

    }
}