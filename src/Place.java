
import java.util.*;

public class Place{
    private static Scanner sc = new Scanner(System.in);
    static int ranks;
    static int places;
    static HashMap<Integer, String> Ranks = new HashMap<>();
    static HashMap<Integer, String> Places = new HashMap<>();

    public static void place() {
        Ranks.put(1,"1 ряд");
        Ranks.put(3,"3 ряд");
        Ranks.put(6,"6 ряд");

        System.out.println("Выберите свободный ряд: "+Ranks.get(1)+", "+Ranks.get(3)+", "+Ranks.get(6));


        Selection();
    }

    public static void Selection(){
        ranks=sc.nextInt();
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
        Places.put(8,"8 место");
        Places.put(9,"9 место");
        Places.put(12,"12 место");
        System.out.println("Выберите свободное место: "+Places.get(8)+", "+Places.get(9)+", "+Places.get(12));
        Selection1();
        }
    private static void Selection1(){
        places=sc.nextInt();
        switch (places){
            case 8:
                System.out.println("Вы выбрали "+Places.get(places));
                break;
            case 9:
                System.out.println("Вы выбрали "+Places.get(places));
                break;
            case 12:
                System.out.println("Вы выбрали "+Places.get(places));
                break;
            default:
                System.out.println("Выбранное место занято");
                break;
        }
        System.out.println("");
    }
}
