public class GameRunner{
    private SuperContra game;
    public GameRunner(SuperContra mario){
        this.game=mario;
    }
    public void run(){
        game.up();
        game.down();
      
    }
}