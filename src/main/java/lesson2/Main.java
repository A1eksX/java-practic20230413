package lesson2;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        ex1();
//        ex2("aaaabbbcdd");
//        ex3();
//        System.out.println(ex3());
//        ex4();
        ex5("F:\\Java\\Java GB\\Java\\java-practic20230413");

    }

    private static void ex1() {
//Дано число N (>0) и символы A и B.
//Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов A и B, начиная с B.
        int n = 6;
        int count = 0;
        char symbA = 'A';
        char symbB = 'B';
        StringBuilder sb = new StringBuilder();
        while (count < n) {
            if (count % 2 == 0) {
                sb.append(symbA);
            } else {
                sb.append(symbB);
            }
            count++;
        }
        System.out.println(sb.toString());
    }

    private static void ex2(String input) {
//Напишите метод, который сжимает строку.
//Пример: вход aaaabbbcdd.
        input += " ";
        char[] array = input.toCharArray();     // строку переводим в массив
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            char check = array[i];
            if (check != array[i + 1]) {
                result.append(check);
                if (count != 1) {
                    result.append(count);
                }
                count = 0;
            }
            count++;
        }
        System.out.println(result);
    }

    private static boolean ex3() {
//Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String polindrom = input.nextLine();  // считываем слово из консоли

        char[] arrayP = polindrom.toCharArray();    // строку переводим в массив

        for (int i = 0; i < arrayP.length / 2; i++) {
            if (arrayP[i] != arrayP[arrayP.length - i - 1]){
                return false;
            }
        }
        return true;
    }

    private static void ex4() throws IOException {
//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
// и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

        StringBuilder sb = new StringBuilder();
        sb.append("TEST".repeat(100));
        File output = new File("Text.txt");
        FileWriter writer = new FileWriter(output);


    }

    private static void ex5(String pathDir) {
        File file = new File(pathDir);  //создаём экземпляр класса ФАЙЛ и указываем путь указанный в аргументе
        if (!(file.exists() || file.isDirectory())){ //если файл не существует (.exists()) или не директория
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String fileName : file.list()){
            sb.append(fileName).append(System.lineSeparator());
        }
        System.out.println(sb);
//Записываем в Файл
        // конструкция называется try с ресурсами,  try(сюда помещаем наш ПОТОК (PrintWriter pw)
        // в скобки можно поместить ТОЛЬКО те потоки, у которых есть спец интерфейс AutoCloseable)
        //таким образом мы оберегаем себя от возможных исключений, и будет сразу запись в файл.
        // Остальные способы имеют ряд уязвимостей
        try (PrintWriter pw = new PrintWriter("src/main/resources/files/filesNames.txt")){
           pw.print(sb); 
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
