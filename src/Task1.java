import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


public class Task1 {
    public static void task1() {

        Books[] b1 = new Books[5];


        b1[0] = new Books("Капитанская дочь", "Александр", "Пушкин", "Сергеевич", 1);
        b1[1] = new Books("Крейсера", "Валентин", "Пикуль", "Саввич", 2);
        b1[2] = new Books("Моонзунд", "Валентин", "Пикуль", "Саввич", 3);
        b1[3] = new Books("Честь имею", "Валентин", "Пикуль", "Саввич", 4);
        b1[4] = new Books("Баязет", "Валентин", "Пикуль", "Саввич", 5);


        List<Books> list1 = new LinkedList<Books>();
        list1.add(b1[0]);
        list1.add(b1[1]);
        list1.add(b1[2]);
        list1.add(b1[3]);
        list1.add(b1[4]);


        System.out.println("All books:  ");
        for (Books element : b1) {
            System.out.println(element);
        }
        list1.remove(1);
        System.out.println("after deleting:  ");
        for (Books element : b1) {
            System.out.println(element);
        }


    }

}