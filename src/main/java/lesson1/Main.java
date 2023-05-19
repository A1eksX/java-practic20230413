//Задача 1
//Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

//В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

package lesson1;

import java.util.Scanner;
import java.util.Date;  //для Д/З

public class Main {
    public static void main(String[] args) {
    //    ex1();
    //    ex2();
    //    ex3();
        ex4(2,2);

    }

//  Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный
//  массив типа int длиной len, каждая ячейка которого равна initialValue;
    private static int[] ex4(int len, int initialValue) {
        int [] arr = new int[len];
        int i = 0;
        while (i< arr.length) {
             i = initialValue;
            i++;
        }
        return arr;
    }


    private static void ex3() {
//Задача 3
//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
        int[] arr = {3, 2, 2, 3, 5, 6, 6, 7};
        int val = 3;
        int temp = 0;
        int indexEnd = arr.length - 1;
        int indexStart = 0;
        for (int i = 0; indexStart < indexEnd; i++) {
            if (arr[i] != val){
                indexStart += 1;
            }
            else if (arr[i] == val) {
                if (arr[indexEnd] != val) {
                    temp = arr[indexEnd];
                    arr[indexEnd] = arr[indexStart];
                    arr[indexStart] = temp;
                    indexStart += 1;
                    indexEnd -= 1;
                } else {
                    indexEnd -= 1;
                }
            }
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }

    private static void ex2() {
//Задача 2
//Дан массив двоичных чисел, например [1,1,0,1,1,1,1,1,1,1], вывести максимальное количество подряд идущих 1.
        int[] arr = {1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0};
        int count = 0;
        int max = 0;
        for (int num : arr) {   //это цикл forage надо почитать, он сосзданя для коллекций, где нет индексов и идёт просот перебор по элементам
            if (num == 1) {
                count += 1;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }

    private static void ex1() {
//Задача 1
//Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
        Date date = new Date();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.println("Привет, %S!" + name);
        iScanner.close();
        System.out.println(date);   //для Д/З
    }

}

