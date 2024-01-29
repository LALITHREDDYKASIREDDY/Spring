
public class AppGame{
    public static void main(String[] args) {
        SuperContra marioGame=new SuperContra();
        GameRunner gameRunner=new GameRunner(marioGame);
        gameRunner.run();
    }
}