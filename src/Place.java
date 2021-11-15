
import java.util.*;

public class Place{
    private static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, String> Ranks = new HashMap<>();
    static HashMap<Integer, String> Places = new HashMap<>();
    static int places=sc.nextInt();
    static int ranks=sc.nextInt();
    public static void place() {
        Ranks.put(1,"1 ряд");
        Ranks.put(3,"3 ряд");
        Ranks.put(6,"6 ряд");
        Places.put(8,"8 место");
        Places.put(9,"9 место");
        Places.put(12,"12 место");
        System.out.println("Выберите свободный ряд: "+Ranks.get(1)+", "+Ranks.get(3)+", "+Ranks.get(6));
        Selection();
    }
    private static void Selection(){

     switch (ranks){
         case 1:
             System.out.println("Вы выбрали "+Ranks.get(ranks));
             break;
         case 3:
             System.out.println("Вы выбрали "+Ranks.get(ranks));
             break;
         case 6:
             System.out.println("Вы выбрали "+Ranks.get(ranks));
             break;
         default:
             System.out.println("Выбранный ряд занят");
             break;
     }
        System.out.println("Выберите свободное место: "+Places.get(1)+", "+Places.get(3)+", "+Places.get(6));
        Selection1();
        }
    private static void Selection1(){

        switch (places){
            case 1:
                System.out.println("Вы выбрали "+Places.get(places));
                break;
            case 3:
                System.out.println("Вы выбрали "+Places.get(places));
                break;
            case 6:
                System.out.println("Вы выбрали "+Places.get(places));
                break;
            default:
                System.out.println("Выбранное место занято");
                break;
        }
    }
}
