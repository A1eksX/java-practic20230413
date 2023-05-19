package lesson6;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


    int [] arr = getArray();

    public static int [] getArray() {
//        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
//        2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
//        уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
//                Для вычисления процента используйте формулу:
//        процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
        int[] array = new int[1000];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt (0,25);
        }

        return array;
    }
    public static Double getPercentUniqElement(int[]array){
        HashSet<Integer> set = new HashSet<>();
        for (int number: array) {
            set.add(number);
        }
        int setLen = set.size();
        Double result = setLen * 100.0 / array.length;

    }



}

//    Задание №2
//1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//    а) информационной системой ветеринарной клиники
//    б) архивом выставки котов
//    в) информационной системой Театра кошек Ю. Д. Куклачёва
//    Можно записать в текстовом виде, не обязательно реализовывать в java.

}