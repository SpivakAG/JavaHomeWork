public class GuessNumber {
    private int hiddenNum;
    private boolean checkWin = false;

    public void doRandom(){
        hiddenNum = (int) (Math.random() * 100);
    }
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
    public boolean getCheckWin(){
        return checkWin;
    } 
}