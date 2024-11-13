//Упр.3 Создать массив с числами (положительными и отрицательными). Создать метод,
// который принимает этот массив, в методе создать стрим, отфильтровать, оставляя только положительные,
// просуммировать и вернуть результат. Написать простые тесты для метода.

import java.util.Arrays;
import java.util.stream.Stream;

public class Exempl1 {
    public static void main(String[] args) {
        Integer [] mass = {5, 10, 20, -10, -20, 30 };

        System.out.println(metod(mass));



    }
    public static int metod(Integer [] mass){
        Stream<Integer> stream = Arrays.stream(mass);
         int b = stream.filter(x -> x>0).reduce(0, (x,y)->x+y);


        return b;


    }
}
