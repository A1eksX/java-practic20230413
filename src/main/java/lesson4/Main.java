//package lesson4;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//
////    Реализовать консольное приложение, которое:
//// 1. Принимает от пользователя строку вида text~num
//// 2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//// 3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//// 4. Продумать систему добавления элементов на индексы, превышающие размер
//// 5. Добавить проверки ввода
//// 6. Добавить еще команд на выбор
//
//
//}
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson4;

import java.util.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex0() {
        int SIZE = 100000;
        Random random = new Random();

        List<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            linkedList.add(0, random.nextInt());
        }

        System.out.println("LinkedList: " + (System.currentTimeMillis() - start));

        List<Integer> arrayList = new ArrayList<>(SIZE);
        start = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arrayList.add(0, random.nextInt());
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start));
    }

    private static void ex1() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "orange", "banana", "tomato", "strawberry", "melon");

        while (true) {
            while (true) {
                System.out.println();
                System.out.print("Введите строку: ");
                String inputString = in.nextLine();

                if (inputString.trim().length() == 0) {
                    System.out.println("Строка не должна быть пустой");
                    continue;
                }
                if (inputString.equalsIgnoreCase("каша не вари")) {
                    break;
                }
                if (inputString.equalsIgnoreCase("print~all")) {
                    printAllNotNullValues(wordsList);
                    continue;
                }
                if (!inputString.contains("~")) {
                    System.out.println("Строка не содержит тильду");
                    continue;
                }

                String[] parts = inputString.split("\\~+");

                if (parts.length != 2) {
                    System.out.println("Ошибка ввода шаблона. Должно быть \"word~num\". Пример: apple~6");
                    continue;
                }
                String word = parts[0];
                int num = 0;

                try {
                    num = Integer.parseInt(parts[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Выражение не содержит числа");
                    continue;
                }

                if (num < 1) {
                    System.out.println("Введите num более 1");
                    continue;
                }
                if (word.equalsIgnoreCase("print")) {
                    if (!isNumberInRange(num, wordsList.size()) || valueIsNull(wordsList, num)) {
                        System.out.printf("Указанного значения не существует");
                    } else {
                        System.out.printf("Под номером %d находится слово: %s%n", num, wordsList.get(num - 1));
                        wordsList.remove(num - 1);
                    }
                } else if (isNumberInRange(num, wordsList.size())) {
                    String oldWord = wordsList.get(num - 1);

                    if (valueIsNull(wordsList, num)) {
                        printAddMessage(word, num);
                    } else {
                        printSetMessage(word, num, oldWord);
                    }
                    wordsList.set(num - 1, word);
                } else {
                    int nullCount = num - wordsList.size() - 1;
                    addNulls(wordsList, nullCount);
                    wordsList.add(word);
                    printAddMessage(word, num);
                }
            }
        }
    }
        private static void addNulls(LinkedList <String> wordsList, int count){
            for (int i = 0; i < count; i++) {
                wordsList.add(null);
            }
        }

        private static void printAllNotNullValues(LinkedList <String> wordsList) {
            for (int i = 0; i < wordsList.size(); i++) {
                if (wordsList.get(i) != null) {
                    System.out.printf("%d) %s%n", i + 1, wordsList.get(i));
                }
            }
        }

        private static void printSetMessage(String word, int num, String oldWord){
            System.out.printf("Слово %s заменило на позиции %d слово %s%n", word, num, oldWord);
        }

        private static void printAddMessage(String word, int num){
            System.out.printf("Слово %s добавлено на позицию %d%n", word, num);
        }

        private static boolean valueIsNull (LinkedList < String > wordsList,int num){
            return wordsList.get(num - 1) == null;
        }

        private static boolean isNumberInRange ( int num, int size){
            return num >= 1 & num <= size;
        }
    }


