package lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//    ex1();
//   ex2();
        ex3();
    }

    private static void ex3() {
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        for (int i = 0; i < list.size() -1; i++) {
            String first = list.get(i);
            String second= list.get(i+1);
            if (second.equals(first)) {
                list.remove(i);
                i--;
            }
            else{
                first = list.get(i+1);
            }
        }
        System.out.println(list);
    }

  /*  private static void ex3() {
//        Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
//        randomSolarSystem.sort(Comparator.naturalOrder());
        System.out.println(randomSolarSystem);
        for (int i = 0; i < randomSolarSystem.size(); i++) {
            if (randomSolarSystem.contains(randomSolarSystem.get(i))){
                randomSolarSystem.remove(randomSolarSystem.get(i));
            }
        }
        System.out.println(randomSolarSystem);
    }*/
/*
    private static void ex2() {
//   Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//   Вывести название каждой планеты и количество его повторений в списке.
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        randomSolarSystem.sort(Comparator.naturalOrder());
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < planetsNamesStringArray.length; i++) {
            count = 0;
            for (var item : randomSolarSystem) {
                if (item.equals(planetsNamesStringArray[i]))
                    count++;
                }
                sb.append(planetsNamesStringArray[i]).append(": ").append(count).append("\n");
            }
            System.out.println(sb);
        }*/

    private static void ex1() {
        Random random = new Random();
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < 100;  i++){
            list.add(random.nextInt(100));
        }
        list.sort(Comparator.naturalOrder());
 //       Collections.sort(list, Comparator.naturalOrder());;

        System.out.println(list);
    }


}
