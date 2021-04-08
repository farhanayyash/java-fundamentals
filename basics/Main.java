
import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

//this is the main class
public class Main {
  

    public static void main(String[] args) {

      System.out.println(pluralize("Cat",12));

      

      flipNHeads(4);

      clock();
      

    }

    private static String pluralize(String word , int num){
      if(num == 0 || num > 1){
        word = word + 's';
      }
      return  "I own ".concat(num+"").concat(" ").concat(word);
    }

    private static void flipNHeads(int n) {
        int count = 0;

        int totalCout = 0;

        while (count < n){
            if(Math.random() * 1 < 0.5 ){
                count = 0;
                System.out.println("tails");
            }else {
                count++;
                System.out.println("heads") ;
            }
            totalCout++;
        }

        System.out.println("It took ".concat(Integer.toString(totalCout)).concat(" ").concat("flips to flip ").concat(Integer.toString(n)).concat(" ").concat(" heads in a row."));
    }

    private static void clock () {

      Timer timer = new Timer();
      timer.scheduleAtFixedRate(new TimerTask(){
      public void run() {
      LocalDateTime now = LocalDateTime.now();
      System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));      }
      }, new Date(), 1000);
      }

}