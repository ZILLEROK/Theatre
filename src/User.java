

import java.util.*;

 public class User{
    static HashMap<Integer, String> Users = new HashMap<>();
    static int number;
    static String name;
    private static Scanner sc = new Scanner(System.in);
    public static void userFromConsole(){
    System.out.println("Введите номер телефона и Фамилию");
    Users.put(number, name);
    number();
    name();
    }
    public static void number(){
         number = sc.nextInt();
    }
    public static void name(){
        name = sc.next();
    }


 }
