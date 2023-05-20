package lesson6;

import java.util.*;

/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
 */
public class Main {
    public static void main(String[] args) {
        /*
        HashSet hashSet = new HashSet(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3)); //у HashSet нет гарантий, что будет сортировка
        hashSet.add(0);
        hashSet.add(6);
        for (Object item : hashSet) {
            System.out.print(item + " ");
        }
        System.out.println();
        LinkedHashSet linkedSet = new LinkedHashSet(Arrays.asList(1, 3, 2, 3, 2, 4, 5, 6, 3)); //хранит в себе порядок добавления в множество
        linkedSet.add(0);
        linkedSet.add(6);
        for (Object item : linkedSet) {
            System.out.print(item + " ");
        }
        System.out.println();
        TreeSet treeSet = new TreeSet(Arrays.asList(1, 3, 2, 3, 2, 4, 5, 6, 3)); //всегда упорядочивает список
        treeSet.add(0);
        treeSet.add(6);
        for (Object item : treeSet) {
            System.out.print(item + " ");
        }
        System.out.println();


        int [] arr = getArray();
        System.out.println(getPercentUniqElement(arr));         */

//    Задание №2
//1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//    а) информационной системой ветеринарной клиники
//    б) архивом выставки котов
//    в) информационной системой Театра кошек Ю. Д. Куклачёва
//    Можно записать в текстовом виде, не обязательно реализовывать в java.

        Cat cat = new Cat(2, "Vasya", "persian", true);    //делаем экземпляры класса и заполняем его
//        cat.name = "Vasya";
//        cat.age = 2;
//        cat.isMale = true;
//        cat.breed = "persian";

        System.out.println(cat);

        Cat cat1 = new Cat(5, "Masha", "persian", false);   //делаем экземпляры класса и заполняем его
//        cat1.name = "Masha";
//        cat1.age = 5;
//        cat1.isMale = false;
//        cat1.breed = "persian";

        Cat cat2 = new Cat(2, "Vasya", "persian", true);   //делаем экземпляры класса и заполняем его
//        cat2.name = "Vasya";
//        cat2.age = 2;
//        cat2.isMale = true;
//        cat2.breed = "persian";

        VetCat catVet = new VetCat(2, "Viktor", "persian", true, "blanc", false);
//        catVet.name = "Viktor";
//        catVet.age = 2;
//        catVet.isMale = true;
//        catVet.breed = "persian";
//        catVet.isSterilized = false;
//        catVet.medicalHistory = "blanc";

        TheatreCat theatreCat = new TheatreCat(2, "Leonid", "persian", true, 1, "high jump");
//        theatreCat.name = "Viktor";
//        theatreCat.age = 2;
//        theatreCat.isMale = true;
//        theatreCat.breed = "persian";

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat);
        cats.add(cat2);
        cats.add(catVet);
        cats.add(theatreCat);

        System.out.println(cats);

    }

//        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//        2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
//        уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//                Для вычисления процента используйте формулу:
//        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
   public static int[] getArray() {
       int [] array = new int[1000];
       Random rnd = new Random();

       for (int i = 0; i < array.length; i++) {
           array[i] = rnd.nextInt(0, 25);
       }
       return array;
       }
   public static Double getPercentUniqElement (int [] array) {
   HashSet<Integer> set = new HashSet<>();
       for (int number: array) {
           set.add(number);
       }
       int setLen = set.size();
        Double result = setLen * 100.0 / array.length;
        return result;
    }

}