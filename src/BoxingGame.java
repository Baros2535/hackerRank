import java.util.Random;

public class BoxingGame {
   static double  player1Power=100;
 static    double  player2Power=100;
    public static void main(String[] args) {
        startBox();
    }

    private static void startBox() {

      do {
        if (selectPlayer()==1) {
            hit("player2");
        }
        if (selectPlayer()==2){
            hit("player1");
        }
          if ((int)player1Power<=0){
              System.out.println("Player2 win");
              break;
          }
         if ((int)player2Power<=0)
          {
              System.out.println("Player1 win");
              break;
          }
      }while(true);

    }

    private static void hit(String player) {
        if (player.equals("player2")){
            player2Power=player2Power*0.1;
        }
        if (player.equals("player1")){
            player1Power=player1Power*0.1;
        }
    }

    private static int selectPlayer() {
        Random random=new Random();
        int a=random.nextInt(2)+1;
        return a;
    }
}
