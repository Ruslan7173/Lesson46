//На java:
//Создать ArrayList с числами, создать метод, который принимает этот ArrayList,
// создает стрим, убирает дубли, сортирует числа и выводит результат на консоль.


import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(3);
        met(list);
    }

    public static void met(ArrayList<Integer> list) {
        Stream<Integer> stream = list.stream();
        stream.distinct().sorted().forEach(System.out::println);

    }

}

