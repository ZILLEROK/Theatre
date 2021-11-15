import java.util.*;

public class Show{
    static int choice;
    static int opera;
    static int cost;
    static String show;
    static HashMap<Integer, String> Shows = new HashMap<>();
    static HashMap<Integer, String> Operas = new HashMap<>();
    static HashMap<Integer, String> Ballets = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);
    public static void genre(){

        System.out.println("Выберите жанр: 1 - Опера, 2 - Балет, 3 - Пьеса");
        Shows.put(1, "Опера");
        Shows.put(2, "Балет");
        Shows.put(3, "Пьеса");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Вы выбрали " + Shows.get(1));
                Opera();
                break;
            case 2:
                System.out.println("Вы выбрали " + Shows.get(2));
                Ballet();
                break;
            case 3:
                System.out.println("Вы выбрали " + Shows.get(3));
                Play();
                break;
        }
        //int choice1=Shows
    }
    public static void Opera(){
        Operas.put(1, "Фигаро");
        Operas.put(2, "Цирюльник");
        Operas.put(3, "Манон");
        System.out.println("Выберите жанр: 1 - " + Operas.get(1) + " 2 - " + Operas.get(2) + " 3 - " + Operas.get(3) + " 4 - назад");
        opera = sc.nextInt();
        switch (opera){
            case 1:
                System.out.println("Вы выбрали " + Operas.get(1));
                break;
            case 2:
                System.out.println("Вы выбрали " + Operas.get(2));
                break;
            case 3:
                System.out.println("Вы выбрали " + Operas.get(3));
                break;
            case 4:
                genre();
                break;
        }
        show=Operas.get(opera);
        cost=45;
    }
    public static void Ballet(){

        Ballets.put(1, "Спартак");
        Ballets.put(2, "Отелло");
        Ballets.put(3, "Щелкунчик");
        System.out.println("Выберите жанр: 1 - " + Ballets.get(1) + " 2 - " + Ballets.get(2) + " 3 - " + Ballets.get(3) + " 4 - назад");
        opera = sc.nextInt();
        switch (opera){
            case 1:
                System.out.println("Вы выбрали " + Ballets.get(1));
                break;
            case 2:
                System.out.println("Вы выбрали " + Ballets.get(2));
                break;
            case 3:
                System.out.println("Вы выбрали " + Ballets.get(3));
                break;
            case 4:
                genre();
                break;
        }
        cost=55;
        show=Ballets.get(opera);
    }
    public static void Play(){
        HashMap<Integer, String> Plays = new HashMap<>();
        Plays.put(1, "Гроза");
        Plays.put(2, "Пикассо");
        Plays.put(3, "Желание");
        System.out.println("Выберите жанр: 1 - " + Plays.get(1) + " 2 - " + Plays.get(2) + " 3 - " + Plays.get(3) + " 4 - назад");
        opera = sc.nextInt();
        switch (opera){
            case 1:
                System.out.println("Вы выбрали " + Plays.get(1));
                break;
            case 2:
                System.out.println("Вы выбрали " + Plays.get(2));
                break;
            case 3:
                System.out.println("Вы выбрали " + Plays.get(3));
                break;
            case 4:
                genre();
                break;
        }
        cost=50;
        show=Plays.get(opera);
    }
}
