import java.util.*;

public class Order {

    private static Scanner sc = new Scanner(System.in);
    public static void Cost(){
        User character = new User();
        Show show1 = new Show();
        Place place1 = new Place();
        System.out.println("Номер телефона: "+character.number+" Фамилия: "+character.name);
        System.out.println("Жанр "+ show1.Shows.get(show1.choice)+" Мероприятие "+show1.show);
        System.out.println("Ряд "+place1.Ranks.get(place1.ranks)+" Место "+place1.Places.get(place1.places));
        System.out.println("Цена составляет: "+show1.cost);
    }
}
